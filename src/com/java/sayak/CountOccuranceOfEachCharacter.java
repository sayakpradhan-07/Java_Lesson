package com.java.sayak;
import java.util.*;


public class CountOccuranceOfEachCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String inputString = sc.nextLine();

        countWords(inputString);
    }
    public static void countWords(String inputString)  {
        HashMap<String, Integer> hm = new HashMap<>();

        for(String s: inputString.split(" ")) {
            if(hm.containsKey(s)) {
                hm.put(s, hm.get(s) + 1);
            }
            else {
                hm.put(s, 1);
            }
        }
        System.out.println("Count of each words in the given string: " + hm);
    }
}
