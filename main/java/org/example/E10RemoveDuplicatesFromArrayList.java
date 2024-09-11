package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class E10RemoveDuplicatesFromArrayList {
    public static void main(String[] args) {


        ArrayList<String> ar = new ArrayList<>();
        ar.add("kiwi");
        ar.add("kiwi");
        ar.add("banana");
        ar.add("banana");
        ar.add("mango");
        ar.add("mango");
        ar.add("apple");
        System.out.println(ar);

        ArrayList<String>arl=new ArrayList<>();

        for (int i = 0; i < ar.size(); i++)
        {
            if(!arl.contains(ar.get(i))){
            arl.add(ar.get(i));
            }

        }
        System.out.println(arl);


    }
}




