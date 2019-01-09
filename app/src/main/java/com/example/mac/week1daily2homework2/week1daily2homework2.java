package com.example.mac.week1daily2homework;

import java.util.ArrayList;
import java.lang.String;
import java.util.Arrays;

public class week1daily2homework2 {
    public static void main(String[] args) {
        //instanciate object
        week1daily2homework2 duplicates = new week1daily2homework2();
        // instanciate ArrayList
        ArrayList<String> stringList = new ArrayList();
        // Populate list
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("four");
        stringList.add("five");
        stringList.add("six");
        stringList.add("seven");
        stringList.add("eight");
        stringList.add("nine");
        stringList.add("ten");
        stringList.add("one");
        stringList.add("three");
        stringList.add("seven");
        stringList.add("nine");

        System.out.println("problem 1");
        // Call the findDuplicates method
        duplicates.findDuplicates(stringList);

        // Instanciate new object
        System.out.println("");
        System.out.println("");
        //instanciate new object
        week1daily2homework2 palendrome = new week1daily2homework2();
        System.out.println("problem 2");
        // Test words with cheackPalendrome
        palendrome.checkPalindrome("thought");
        palendrome.checkPalindrome("alula");
        //
        System.out.println("");
        System.out.println("");
        //
        //instanciate new object
        week1daily2homework2 fizzybuzzy = new week1daily2homework2();
        System.out.println("Problem 3");
        // test count of 20
        fizzybuzzy.fizzBuzz(20);
        //
        System.out.println("");
        System.out.println("");
        //
        System.out.println("problem 4");
        // instanciate new object
        week1daily2homework2 annieGram = new week1daily2homework2();
        // test some pairs of words
        annieGram.checkAnagrams("taco", "coat");
        annieGram.checkAnagrams("hail", "ceaser");
        annieGram.checkAnagrams("team","meat");
        annieGram.checkAnagrams("four","five");
        //
        System.out.println("");
        System.out.println("");
        //
        System.out.println("problem 5");
        //instanciate new object
        week1daily2homework2 multi = new week1daily2homework2();
        // run the method
        multi.printTables();

    }

    public void findDuplicates(ArrayList<String> arrList) {
        for (int i = 0; i < arrList.size(); i++) { // Take one string in the array
            for (int j = i + 1; j < arrList.size(); j++) { // Cycle through all indexes after the one
                if (arrList.get(i).equals(arrList.get(j))) { // Compare the strings
                    System.out.println(arrList.get(i)); // Print them out if they are the same
                }
            }
        }
    }

    public void checkPalindrome(String word) {
        int start = 0; // index of brginning character of the word
        int end = word.length() - 1; // index of the last character of the word
        while (word.charAt(start) == word.charAt(end) && start < end) { // loop while comparing them
            start++; // increment the index from the begining
            end--; // decrement the index from the end
        }
        if (start < end) { // if start is less than end...
            System.out.println(word + " is not a palendrome."); // the comparason was false at some point
        } else { // if start is equal to or greater than end...
            System.out.println(word + " is a plendrome."); // the comparason was always true.
        }

    }

    public void fizzBuzz(int count) {
        for (int i = 1; i < count + 1; i++) { // Loop through count
            if (i % 15 == 0) { // if evenly divisable by 15 then ...
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0) { // if evenly divisable by 5 then...
                System.out.println("buzz");
            } else if (i % 3 == 0) { // if evenly divisable by 3 then...
                System.out.println("fizz");
            } else { // otherwise print the number
                System.out.println(i);
            }
        }
    }

    public boolean checkAnagrams(String word1, String word2) {
        if (word1.length() == word2.length()) { // make sure the words are the same length
            char[] wordChar1 = word1.toCharArray(); // Set up two char arrays
            char[] wordChar2 = word2.toCharArray();
            Arrays.sort(wordChar1); // sort both arrays
            Arrays.sort(wordChar2);
            if (Arrays.equals(wordChar1,wordChar2)){ // see if the sorted arrays are equal
                System.out.println(word1 +" and "+ word2 + " are anagrams."); // if so..
                return true;
            }
            else { // otherwise...
                System.out.println(word1 + " and "+ word2 + " are not anagrams.");
                return false;
            }
        }
        else { // message that the words are not the same length
            System.out.println(word1 + " and " + word2 + " are not anagrams. They don't even have the same number of letters!.");
            return false;
        }

    }
    //problem 5
    public void printTables(){
        int[][] multiplicationArray = new int[10][10];
        for (int x = 1; x < 11; x++){ // these two loops will creat the 10 x 10 multiplicatiion table
            for (int y = 1; y < 11; y++){
                multiplicationArray[x -1][y -1] = x * y; // the [row][col] will equal the product of the two.
            }// print out the array
            for (int i = 0; i < 10; i++){
                for (int j = 0; j < 10; j++){
                    System.out.print(multiplicationArray[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
