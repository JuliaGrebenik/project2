package org.example;

public class E1Swap2String {
    public static void main(String[] args) {

        String s1 = "Good";
        String s2 = "Morning";

        System.out.println(s1);
        System.out.println(s2);


        s1=s1+s2; //GoodMorning
        s2=s1.substring(0,s1.length()-s2.length());//Good
        s1=s1.substring(s2.length());//Morning

        System.out.println(s1);
        System.out.println(s2);
    }
}

