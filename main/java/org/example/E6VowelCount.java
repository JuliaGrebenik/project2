package org.example;

public class E6VowelCount {

    public static int countVowels (String str){
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'e'||str.charAt(i)=='i'){

                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String str = "documentation";

        int vowelCount = countVowels(str);
        System.out.println(vowelCount);
    }

}










