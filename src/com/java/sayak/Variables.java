package com.java.sayak;

public class Variables {
    public static void main(String[] args) {
        boolean isPassed = true;
        int count = 12;


        byte marks = 113;   // -128 to 127
        short marksMath = 10000; // 32768 to 32767
        int marksComputer = 100000000;
        long marksChemistry = 1000000000;
        float marksHindi = 92.18f;
        double marksBengali = 92.18;
        char myFirstLetter = 'A';  // single quote '' for char
        String name = "Sayak";

        System.out.print(count);
        System.out.println(marks); // println is for a new line
        System.out.println(count);
        System.out.println(marksBengali);
        System.out.println(marksHindi);
        System.out.println(myFirstLetter);
        System.out.println(name);


        // Datatype implicit conversion
        short num = 19;

        long countLong = count;    // implicit conversion of datatypes (int --> Long)
        int count2 = (int) countLong;   // explicit conversion of datatypes (Long --> int)
        System.out.println(countLong);
    }
}
