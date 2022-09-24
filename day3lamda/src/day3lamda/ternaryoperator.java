/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day3lamda;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ternaryoperator {
    
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("enter your character to find vowels");
        // Character input
        char c = sc.next().charAt(0);
        
        
        //String vowel = (c == 'a') ? "vowel":(c == 'e') ? "vowel":(c == 'i') ? "vowel":(c == 'o') ? "vowel":(c == 'u') ? "vowel": "consonent";
        
        String vowel = c == 'a' ? "vowel":c == 'e' ? "vowel":c == 'i' ? "vowel":c == 'o' ? "vowel":c == 'u' ? "vowel": "consonent";
        System.out.println(vowel);
        
    }
    
    
     
    
    
    
    
}
