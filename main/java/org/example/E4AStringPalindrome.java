package org.example;

public class E4AStringPalindrome {
    public static void main(String[] args) {


        String s="madam";

        String s1=new StringBuilder(s).reverse().toString();

        if(s.equals(s1)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }


    }
}
