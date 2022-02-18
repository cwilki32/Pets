package com.company;

public class Dog {
    //Create 2 new classes
    //One class should be called Dog
    //One class should be called Cat
//Each class should have at 3 properties
    //name
    //age
    //1 more of your choosing
//Each class should have accessor methods for each property
    private String dogName;
    private int dogAge;
    private int dogWeight;

/*    //setters for properties
    public void setDogName (String name) { // old setter methods
        dogName = name;
    }
    public void setDogAge (int age) {
        dogAge = age;
    }
    public void setDogWeight (int weight) {
        dogWeight = weight;
    }*/

    //The other homework for today is to refactor your PetShop code to use constructors in the animal classes and
    // the this. keyword in your setters.
    // Bonus point if you find a way to do some string handling fun stuff too
    public Dog(String dogName, int dogAge, int dogWeight) { // new constructor set method
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogWeight = dogWeight;
    }

    //getters for properties
    public String getDogName() {
        return dogName;
    }

    public int getDogAge() {
        return dogAge;
    }
    public int getDogWeight() {
        return dogWeight;
    }
}
