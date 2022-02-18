package com.company;

public class GuineaPig {
    //adding class for GuineaPig
    //set properties for name, age and weight using constructor and this.keywords
    private String gpName;
    private int gpAge;
    private int gpWeight;

    //setter methods for GP
    public GuineaPig(String gpName, int gpAge, int gpWeight) {
        this.gpName = gpName;
        this.gpAge = gpAge;
        this.gpWeight = gpWeight;
    }
    //getter methods for GP
    public String getGpName() {
        return gpName;

    }
    public int getGpAge() {
        return gpAge;
    }
    public int getGpWeight() {
        return gpWeight;
    }
}
