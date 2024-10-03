package com.Q2.palindrome;

import java.util.Scanner;

public class palindeomeString {
    public static void main(String[] args) {
        String string;
        Scanner s1 = new Scanner(System.in); // taking input from user
        System.out.println("Enter String: ");   //madam
        string = s1.next(); // capturing input
        
        int len = string.length();           // finding length of the string
        String reversed = "";                // to store the reversed string
       System.out.println("Length of string: "+len);
        
        // Reversing the string using a for loop
        for (int i = len - 1; i >= 0; i--) {
            reversed += string.charAt(i);
        }

        
        if (string.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        
        s1.close(); // close the scanner
    }
}
