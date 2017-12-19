package com.Madpoints;

public class Main {

    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println(myString);

        myString = myString + ", and here is some more";
        System.out.println(myString);

        String numberString = "299.99";
        numberString = numberString + ".05";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
   }
}
