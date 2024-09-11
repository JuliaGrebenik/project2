package org.example;

public class E2HowManyAlphaCharactersAreInTheString {
    public static void main(String[] args) {

        String s="Good Morning";

        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=' '){
                count++;
            }

        }
        System.out.println(count);

    }
}
