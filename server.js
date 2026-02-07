// 1. IMPORTS + SETUP
import express from "express";
import cors from "cors";
import multer from "multer";
import fs from "fs";
import { GoogleGenerativeAI } from "@google/generative-ai";

const app = express();
app.use(cors()); // must be before routes

const upload = multer({ dest: "uploads/" });
const genAI = new GoogleGenerativeAI(process.env.GEMINI_API_KEY);


// 2. ROUTES — THIS is where /analyze goes
app.post("/analyze", upload.single("image"), async (req, res) => {
    try {
        const imageBuffer = fs.readFileSync(req.file.path);

        const model = genAI.getGenerativeModel({ model: "gemini-1.5-flash" });

        const prompt = `
        Return ONLY valid JSON.
        No markdown. No commentary. No code blocks.
        Format:
        {
            "items": [
                {
                    "name": "",
                    "calories": 0,
                    "protein": 0,
                    "carbs": 0,
                    "fat": 0,
                    "fiber": 0,
                    "sugar": 0
                }
            ],
            "total_calories": 0
        }
        `;

        const result = await model.generateContent([
            {
                inlineData: {
                    data: imageBuffer.toString("base64"),
                    mimeType: req.file.mimetype
                }
            },
            prompt
        ]);

        let text = result.response.text();
        text = text.replace(/```json/g, "").replace(/```/g, "");

        const json = JSON.parse(text);
        res.json(json);

    } catch (err) {
        console.error("AI ERROR:", err);
        res.status(500).json({ error: "AI analysis failed", details: err.message });
    }
});


// 3. START SERVER
app.listen(8080, () => {
    console.log("Backend running on http://localhost:8080");
});