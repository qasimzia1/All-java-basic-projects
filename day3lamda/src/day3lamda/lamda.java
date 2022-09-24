/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day3lamda;

import java.util.LinkedList;

/**
 *
 * @author Administrator
 */
abstract interface animal {
    
    public  void printanimal();
    
}



public class lamda{
    
    public static void main(String[] args) {
        
         LinkedList l1 = new LinkedList();
    
    l1.add("cat");
    l1.add("dog");
    l1.add("cow");
    
    animal 
        a = () -> {
            System.out.println(l1);       
        };
    a.printanimal();
    
    }
    
   
    
    
}