package com.caltracker.model;

import java.util.Date; //imports the time
import java.util.InputMismatchException;

public class Meal {
    //Instance Variables
    private int id;
    private String userName;
    private String mealName;
    private double calories;
    private double proteins;
    private double carbohydrates;
    private double fibers;
    private double fats;
    private double sugars;
    private Date timeStamp;

    public Meal(){} //used for JSON library

    /*--------------------------------------------------------
        Meal Constructor returns all @params listed below
        @param int id returns database id of user
        id cannot be < 0; @throws IdAllocationException
        @param String userName returns name of user
        @param String mealName returns name of meal
        @param double calories returns number of calories
        @param double proteins returns number of proteins
        @param double carbohydrates returns number of carbs
        @param double fibers returns number of fibers
        @param double fats returns number of fats
        @param double sugars returns number of sugars
        @param Date timeStamp returns time logged for meal
        @throws InputMismatchException if @params null or empty
     --------------------------------------------------------*/
    public Meal(int id, String userName, String mealName,
                double calories, double proteins, double carbohydrates,
                double fibers, double fats, double sugars, Date timeStamp) {
        //Set default values
        this.id = id;
        this.userName = userName;
        this.mealName = mealName;
        this.calories = calories;
        this.proteins = proteins;
        this.carbohydrates = carbohydrates;
        this.fibers = fibers;
        this.fats = fats;
        this.sugars = sugars;
        this.timeStamp = timeStamp;
    } //Meal constructor

    /*--------------------------------------------------------
        getId() returns meal's id
    --------------------------------------------------------*/
    public int getId(){
        return id;
    } //getUserName() method

    /*--------------------------------------------------------
        setId() sets meal's id
        @param int id
        @throws IllegalArgumentException for all values
        of id < -1
    --------------------------------------------------------*/
    public void setId(int id) {
        if (id < -1){
            throw new IllegalArgumentException("id must be greater than -1");
        }
        this.id = id;
    } //setId() method

    /*--------------------------------------------------------
        getUserName() returns user's name
     --------------------------------------------------------*/
    public String getUserName(){
        return userName;
    } //getId() method

    /*--------------------------------------------------------
        setUserName() sets user's name
        @param String username
        @throws InputMismatchException for non String name
     --------------------------------------------------------*/
    public void setUserName(String username){
        //Check if username is populated
        String userNameErr = "Unexpected username error occurred";
        if (username == null){
            throw new InputMismatchException(userNameErr);
        }
        if (username.isBlank()){
            throw new InputMismatchException(userNameErr);
        }
        this.userName = username;
    } //setUserName() method

    /*--------------------------------------------------------
        getMealName() returns meal's name
    --------------------------------------------------------*/
    public String getMealName(){
        return mealName;
    } //getMealName() method

    /*--------------------------------------------------------
        setMealName() sets meal's name
        @param String mealName
        @throws InputMismatchException for non String name
    --------------------------------------------------------*/
    public void setMealName(String mealName){
        //Check if mealName is populated
        String mealNameErr = "Unexpected meal error occurred";
        if (mealName == null){
            throw new InputMismatchException(mealNameErr);
        }
        if (mealName.isBlank()){
            throw new InputMismatchException(mealNameErr);
        }
        this.mealName = mealName;
    } //setMealName() method


    /*--------------------------------------------------------
        getCalories() returns calories
    --------------------------------------------------------*/
    public double getCalories(){
        return calories;
    } //getCalories() method

    /*--------------------------------------------------------
        setCalories() sets calories' name
        @param double calories
        @throw IllegalArgumentException if calories is less
        than 0 or infinite
    --------------------------------------------------------*/
    public void setCalories(double calories){
        //Verify calories
        if (calories < 0) {
            throw new IllegalArgumentException("Calories cannot be negative");
        }
        if (Double.isNaN(calories) || Double.isInfinite(calories)){
            throw new IllegalArgumentException("Calories must be a valid number");
        }
        this.calories = calories;
    } //setCalories() method

    /*--------------------------------------------------------
        getProteins() returns proteins
    --------------------------------------------------------*/
    public double getProteins(){
        return proteins;
    } //getProteins() method

    /*--------------------------------------------------------
        setProteins() sets proteins' name
        @param double proteins
        @throw IllegalArgumentException if proteins is less
        than 0 or infinite
    --------------------------------------------------------*/
    public void setProteins(double proteins){
        //Verify proteins
        if (proteins < 0) {
            throw new IllegalArgumentException("Proteins cannot be negative");
        }
        if (Double.isNaN(proteins) || Double.isInfinite(proteins)){
            throw new IllegalArgumentException("Proteins must be a valid number");
        }
        this.proteins = proteins;
    } //setProteins() method


    /*--------------------------------------------------------
        getCarbohydrates() returns carbohydrates
    --------------------------------------------------------*/
    public double getCarbohydrates(){
        return carbohydrates;
    } //getCarbohydrates() method

    /*--------------------------------------------------------
        setCarbohydrates() sets carbohydrates' name
        @param double carbohydrates
        @throw IllegalArgumentException if carbohydrates is
        less than 0 or infinite
    --------------------------------------------------------*/
    public void setCarbohydrates(double carbohydrates){
        //Verify carbohydrates
        if (carbohydrates < 0) {
            throw new IllegalArgumentException("Carbohydrates cannot be negative");
        }
        if (Double.isNaN(carbohydrates) || Double.isInfinite(carbohydrates)){
            throw new IllegalArgumentException("Carbohydrates must be a valid number");
        }
        this.carbohydrates = carbohydrates;
    } //setCarbohydrates() method

    /*--------------------------------------------------------
        getFibers() returns fibers
    --------------------------------------------------------*/
    public double getFibers(){
        return fibers;
    } //getFibers() method

    /*--------------------------------------------------------
        setFibers() sets fibers' name
        @param double fibers
        @throw IllegalArgumentException if fibers is less
        than 0 or infinite
    --------------------------------------------------------*/
    public void setFibers(double fibers){
        //Verify fibers
        if (fibers < 0) {
            throw new IllegalArgumentException("Fibers cannot be negative");
        }
        if (Double.isNaN(fibers) || Double.isInfinite(fibers)){
            throw new IllegalArgumentException("Fibers must be a valid number");
        }
        this.fibers = fibers;
    } //setFibers() method

    /*--------------------------------------------------------
        getFats() returns fats
    --------------------------------------------------------*/
    public double getFats(){
        return fats;
    } //getFats() method

    /*--------------------------------------------------------
        setFats() sets fats' name
        @param double fats
        @throw IllegalArgumentException if fats is less
        than 0 or infinite
    --------------------------------------------------------*/
    public void setFats(double fats){
        //Verify fats
        if (fats < 0) {
            throw new IllegalArgumentException("Fats cannot be negative");
        }
        if (Double.isNaN(fats) || Double.isInfinite(fats)){
            throw new IllegalArgumentException("Fats must be a valid number");
        }
        this.fats = fats;
    } //setFats() method

    /*--------------------------------------------------------
        getSugars() returns sugars
    --------------------------------------------------------*/
    public double getSugars(){
        return sugars;
    } //getSugars() method

    /*--------------------------------------------------------
        getSugars() sets sugars' name
        @param double sugars
        @throw IllegalArgumentException if sugars is less
        than 0 or infinite
    --------------------------------------------------------*/
    public void setSugars(double sugars){
        //Verify sugars
        if (sugars < 0) {
            throw new IllegalArgumentException("Sugars cannot be negative");
        }
        if (Double.isNaN(sugars) || Double.isInfinite(sugars)){
            throw new IllegalArgumentException("Sugars must be a valid number");
        }
        this.sugars = sugars;
    } //setSugars() method

    /*--------------------------------------------------------
        getTimeStamp() returns time meal was logged
    --------------------------------------------------------*/
    public Date getTimeStamp(){
        return timeStamp;
    } //getTimeStamp() method

    /*--------------------------------------------------------
        setTimeStamp() sets timeStamp's name
        @param Date timeStamp
        @throws IllegalArgumentException if timeStamp is null
    --------------------------------------------------------*/
    public void setTimeStamp(Date timeStamp){
        if (timeStamp == null){
            throw new IllegalArgumentException("TimeStamp cannot be null");
        }

        this.timeStamp = timeStamp;
    } //setTimeStamp() method
} //Meal class
