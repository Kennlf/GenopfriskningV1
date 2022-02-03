package com.company;

public class Square {

    public String print(int number, String s){
        String squareWidth = "";
        String square = "";
        String space = "  ";

        for (int i = 0; i < number ; i++) {
            squareWidth += s + space;
        }

        for (int i = 0; i < number; i++) {
            square += squareWidth + "\n";
        }
        return square;
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square.print(5, "?"));
    }
}
