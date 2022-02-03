package com.company;

import java.util.Arrays;

public class ProperCase {

    public String[] properCase(String text){
        String[] sentence = text.split(" ");
        for (int i = 0; i < sentence.length; i++) {
            if(sentence[i].equals(sentence[i].toUpperCase())){
                continue;
            } else if (sentence[i].length() > 3){
                sentence[i] = sentence[i].substring(0,1).toUpperCase() + sentence[i].substring(1).toLowerCase();
            } else if (sentence[i].length() <= 3){
                sentence[i] = sentence[i].toLowerCase();
            }

        }
        return sentence;
    }

    public static void main(String[] args) {
        ProperCase temp = new ProperCase();
        System.out.println(Arrays.toString(temp.properCase("HEJ med Dig hÅBer aLt ER veL HILSEN Bo")));
    }
}
