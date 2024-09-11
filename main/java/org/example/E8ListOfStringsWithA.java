package org.example;

import java.util.ArrayList;
import java.util.List;

public class E8ListOfStringsWithA {
    public static List<String> getStringsStartingWithA(List<String> strings) {
        List<String> result = new ArrayList<>();  // List to store results

        for (String str : strings) {
            if (str.startsWith("A")) {  // Check if the string starts with 'A'
                result.add(str.toLowerCase());  // Convert to lowercase and add to result list
            }
        }

        return result;  // Return the filtered list
    }



    public static void main(String[] args) {
        // List of example strings

        List<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Avocado");
        strings.add("Mango");
        strings.add("Apricot");

        // Get the strings starting with 'A' in lowercase
        List<String> filteredStrings = getStringsStartingWithA(strings);

        // Print the result
        for (String str : filteredStrings) {
            System.out.println(str);
        }
    }
}
