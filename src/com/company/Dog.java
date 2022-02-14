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

    //setters for properties
    public void setDogName (String name) {
        dogName = name;
    }
    public void setDogAge (int age) {
        dogAge = age;
    }
    public void setDogWeight (int weight) {
        dogWeight = weight;
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
