package com.company;

import java.util.Scanner;

public class PetShop {
//Create a new project in IntelliJ named Pets
//Rename your Main file to PetShop(right-click -> Refactor -> Rename…)

//In Petshop create two instances of each animal type
//Set values for each property
//Print a statement to the console saying “We have the following animals available: ” followed by property values
    // (name, age, etc)of each instance of Dog and Cat.
//Bonus: Ask the user to pick the name of the animal that they want to purchase and check if that is one of the
    // 4 animal’s names. Tell the user whether the name is not a valid choice.

    public static void main(String[] args) {
        // create two instances of each animal type
        Dog myDog1 = new Dog();
        Dog myDog2 = new Dog();
        Cat myCat1 = new Cat();
        Cat myCat2 = new Cat();

        myDog1.setDogAge(1);
        myDog1.setDogName("Fluffy");
        myDog1.setDogWeight(205);

        myDog2.setDogAge(3);
        myDog2.setDogName("Twyla");
        myDog2.setDogWeight(70);

        myCat1.setCatAge(7);
        myCat1.setCatName("Snowball");
        myCat1.setCatWeight(5);

        myCat2.setCatAge(1);
        myCat2.setCatName("Luna");
        myCat2.setCatWeight(8);

        System.out.println("Welcome to Detroit Pet Rescue. We have the following animals available: " +
                '\n' + "A cat named " + myCat1.getCatName() +
                ". She is " + myCat1.getCatAge() + " years old" + " and weighs " + myCat1.getCatWeight() + " pounds." + '\n'
                + "A cat named " + myCat2.getCatName() + ". She is " + myCat2.getCatAge() + " year old" + " and weighs "
                + myCat2.getCatWeight() + " pounds. " + '\n' + "A dog named " + myDog1.getDogName() + ". He is " +
                myDog1.getDogAge() + " year old" + " and weighs " + myDog1.getDogWeight() + '\n' + "A dog named " +
                myDog2.getDogName() + ". She is " + myDog2.getDogAge() + " years old" + " and weighs " +
                myDog2.getDogWeight() + " pounds.");


        //Bonus: create a scanner that asks which they would like
        Scanner userInput = new Scanner(System.in);
        System.out.println("Which animal would you like to adopt today?");
        String selection = userInput.next();
        boolean keepAsking = true;

        while(keepAsking == true) {
            if(selection.equals(myCat1.getCatName()) || selection.equals(myCat2.getCatName()) ||
                    selection.equals(myDog1.getDogName()) || selection.equals(myDog2.getDogName())) {
                System.out.println("Congrats on making a new furry friend!");
                keepAsking = false;
            } else {
                System.out.println("Sorry that is not a valid option, please try again: ");
                selection = userInput.next();
            }
        }

    }
}
