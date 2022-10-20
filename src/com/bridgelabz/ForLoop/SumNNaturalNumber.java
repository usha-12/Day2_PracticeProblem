package com.bridgelabz.ForLoop;

public class SumNNaturalNumber {
    public static void sumNaturalNo(int number){
        int sum =0;
        for (int i =1; i <= number; i++){
            sum = sum + i;
        }
        System.out.println("Sum of First 5 Natural Number :" +sum);

    }
    public static void main(String[] args) {
        System.out.println("Welcome To Sum of Natural Number...");
        sumNaturalNo(5);
    }
}
