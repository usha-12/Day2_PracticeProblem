package com.bridgelabz.ForLoop;

public class Palindrome {
    public static void checkPalindrome(int number){
        int sum =0;
        int palindrome = number;
        for (int i =0; number>0; number/=10 ){
            int remainder = number % 10;
            sum = (sum*10) + remainder;
        }
        if (sum == palindrome)
            System.out.println("Number is Palindrome :"+palindrome);
        else
            System.out.println("Number is Not Palindrome :"+palindrome);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Palindrome Number :");
        checkPalindrome(121);

    }
}
