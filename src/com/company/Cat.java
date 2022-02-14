package com.company;

public class Cat {

    //Each class should have at 3 properties
    //name
    //age
    //1 more of your choosing
//Each class should have accessor methods for each property

    private String catName;
    private int catAge;
    private int catWeight;

    //setters for properties
    public void setCatName (String name) {
        catName = name;
    }
    public void setCatAge (int age) {
        catAge = age;
    }
    public void setCatWeight (int weight) {
        catWeight = weight;
    }

    //getters for properties
    public String getCatName() {
        return catName;
    }
    public int getCatAge() {
        return catAge;
    }
    public int getCatWeight () {
        return catWeight;
    }
}
