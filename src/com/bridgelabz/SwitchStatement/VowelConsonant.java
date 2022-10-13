package com.bridgelabz.SwitchStatement;

import java.util.Scanner;

public class VowelConsonant {
    public static void checkVowelConsonant() {
        boolean isVowel = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Character :");
        char character = sc.next().charAt(0);
        switch (character) {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' : isVowel = true;
        }
        if (isVowel == true){
            System.out.println("Is a Vowel :"+character);
        }else {
            if ((character>='a' && character<='z') || (character>='A' && character<='Z'))
                System.out.println("Is Consonant :"+character);
            else
                System.out.println("Input not a Alphabet");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Vowel and Consonant program");
        checkVowelConsonant();
    }
}
