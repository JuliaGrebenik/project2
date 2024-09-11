package org.example;

public class E7AmountOfWordsInAString {

    public static void main(String[] args) {

        String words = "Hello, World";

        int countWords = words.split("\\s").length;

        System.out.println(countWords);
    }

    }

