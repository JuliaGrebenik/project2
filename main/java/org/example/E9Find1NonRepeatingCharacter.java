package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class E9Find1NonRepeatingCharacter {
    public static void main(String[] args) {

        String str = "abracadabra";

        HashMap<Character, Integer> charcount = new HashMap<Character, Integer>();

        Character ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);

            if (charcount.containsKey(ch)) {
                charcount.put(ch, charcount.get(ch) + 1);
            } else {
                charcount.put(ch, 1);
            }

        }
        for (int j = 0; j < str.length(); j++) {
            ch = str.charAt(j);
            if (charcount.get(ch) == 1) {
                System.out.println(ch);
            }

        }
    }
}





