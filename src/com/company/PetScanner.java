package com.company;

import java.util.Scanner;

public class PetScanner {
    //add a scanner so someone can add a pet to the directory
    //make this an option to donate or receive
    Scanner scanner = new Scanner(System.in);
    private String petName;
    private int petAge;
    private int petWeight;

    //constructor using scanner
    public PetScanner(String petName, int petAge, int petWeight) {
        System.out.println("Enter the name of the pet: ");
        this.petName = scanner.nextLine();
        System.out.println("How old is" + petName + "?");
        this.petAge = scanner.nextInt();
        System.out.println("How much does " + petName + "weigh?");
        this.petWeight = scanner.nextInt();
    }
    //getters for PetScanner
    public String getPetName() {return petName;}
    public int getPetAge() {return petAge;}
    public int getPetWeight() {return petWeight;}
}
