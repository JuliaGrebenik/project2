package org.example;

import java.util.Arrays;

public class E5Are2StringAnagrams {
    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        if(anagramCheck(s1,s2)){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }

    }
    static boolean anagramCheck(String s1, String s2){

        //check if length is the same
        if(s1.length()!=s2.length()) {
            return false;

        }
        //convert to char array
        char string1ToArray[]=s1.toCharArray();
        char string2ToArray[]=s2.toCharArray();

        //sorting
        Arrays.sort(string1ToArray);
        Arrays.sort(string2ToArray);

        for (int i = 0; i <s1.length() ; i++) {
            if(string1ToArray[i]!=string2ToArray[i]){
                return false;
            }

        }
        return true;
    }
}

