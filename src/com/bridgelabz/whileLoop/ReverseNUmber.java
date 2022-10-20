package com.bridgelabz.whileLoop;

public class ReverseNUmber {
    public static void checkReverse(int number){
        int reverse = 0;
        while (number != 0){
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number /10;
        }
        System.out.println("Reverse Number Is :" +reverse);

    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Reverse Number Program");
        checkReverse(231);
    }
}
