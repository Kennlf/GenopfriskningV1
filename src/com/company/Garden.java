package com.company;

import java.util.Scanner;

public class Garden {


    public int whenToCutGrass(int grassLength, int maxLength) {
        int daysUntillCut = 0;

        for (int i = grassLength; i < maxLength; i += 8) {
            daysUntillCut++;
        }
        return daysUntillCut;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        com.company.Garden garden = new com.company.Garden();
        System.out.println("Indtast græssets nuværende længde i mm: ");
        int length = sc.nextInt();
        System.out.println("Indtast græssets max længde i mm");
        int maximumLength = sc.nextInt();
        System.out.println("Dage indtil at græsset skal slås:" + garden.whenToCutGrass(length, maximumLength));

    }

}
