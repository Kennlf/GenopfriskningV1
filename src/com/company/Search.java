package com.company;

import java.io.IOException;

public class Search {

    public int Search(String[] listOfWords, String s) throws IOException {

        for (int i = 0; i < listOfWords.length; i++) {
            if(listOfWords[i].equals(s)){
                return i;
            }
        }
        throw new IOException();
    }

    public static void main(String[] args) throws IOException {
        Search search = new Search();
        String[] words = {"hej", "En", "to", "tre", "test"};
        System.out.println(search.Search(words, "to"));
    }

}
