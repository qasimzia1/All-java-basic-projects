/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labday3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class anagram {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);

    System.out.print("Enter your first word: ");
    String word1 = input.nextLine();
    System.out.print("Enter your second word: ");
    String word2 = input.nextLine();

    if(word1.length() == word2.length()) {
        char[] charArray1 = word1.toCharArray();
      char[] charArray2 = word2.toCharArray();
      Arrays.sort(charArray1);
      Arrays.sort(charArray2);
      boolean result = Arrays.equals(charArray1, charArray2);
      if(result) {
        System.out.println(word1 + " and " + word2 + " are anagram.");
      }
      else {
        System.out.println(word1 + " and " + word2 + " are not anagram.");
      }
    }
    else {
      System.out.println(word1 + " and " + word2 + " are not anagram.");
    }

    input.close();}}