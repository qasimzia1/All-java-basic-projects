/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day3lamda;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Administrator
 */
public class arraylist {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(5);
        array.add(8);
        array.add(7);
        array.add(6);
        System.out.println("assending order sorted data"+array);
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        Collections.sort(array);
        
        
        
        
    }
}
