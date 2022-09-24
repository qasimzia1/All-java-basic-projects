/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labday3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class palandrometask {
    public String paladrome( String original ){
        
         String  reverse = "";  
        int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("Entered string/number is a palindrome." + reverse);  
      else  
         System.out.println("Entered string/number isn't a palindrome." + reverse);   
        
        return (reverse); }
    
    public static void main(String[] args) {
       
  palandrometask pal = new palandrometask();
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string/number to check if it is a palindrome");  
        String a = in.nextLine();  
      
      pal.paladrome(a); } }  

    

