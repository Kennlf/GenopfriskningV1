package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort {

    public ArrayList<String> Sort(ArrayList<String> list){
        Collections.sort(list);
        Collections.reverse(list);
        return list;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sort sortering = new Sort();
        ArrayList<String> temp = new ArrayList<>();

        System.out.println("Enter words!");
        String word = "";
        for (int i = 0; i < 5; i++) {
            word = sc.nextLine();
            temp.add(word);
        }

        System.out.println(sortering.Sort(temp));
    }


}
