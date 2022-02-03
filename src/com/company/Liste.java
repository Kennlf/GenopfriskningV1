package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Liste {

    public boolean doesArrayListContainString(ArrayList<String> list, String string) {
        boolean hasString = false;
        if (list.contains(string)) {
            hasString = true;
            System.out.println("The String has been found");
        } else if (!list.contains(string)) {
            list.add(string);
        }

        return hasString;

    }

    public static void main(String[] args) {
        Liste liste = new Liste();
        ArrayList<String> strings = new ArrayList<>();

        String temp = "test test test";
        String temp2 = "test test";
        String temp3 = "test";

        //strings.add(temp);
        System.out.println(liste.doesArrayListContainString(strings, temp));
        System.out.println(liste.doesArrayListContainString(strings, temp));
        System.out.println();
        System.out.println(liste.doesArrayListContainString(strings, temp2));
        System.out.println();
        System.out.println(liste.doesArrayListContainString(strings, temp3));
    }
}
