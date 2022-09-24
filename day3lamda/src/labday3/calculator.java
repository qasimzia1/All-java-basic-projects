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

//sum
//subtract
//decimal
//backspace where we will convert int to string and remove last value

    
   public class calculator{
        
        public int sum(int a ){
             Scanner input2 = new Scanner(System.in);
        
        int b = input2.nextInt();
        
        
            int sum = a + b;
            
            
            System.out.println("total sum of" + a + " and" + b + "" + "is :" + sum);
            return (sum);            
        }
    
        
        public int subtract (int a){
             Scanner input2 = new Scanner(System.in);
               int b = input2.nextInt();
        
        
            int sub = a - b;
            
            
            System.out.println("subtraction result of" + a + " and" + b + "" + "is :" + sub);
            return (sub); 
            
        }
        
    
         public String Backspace (String a){
             
        int n = a.length();
        String temp  = a.substring(0, n-1);
		System.out.println("After deleting last variable: " + temp);
        
            return(temp);
            
        }
    public float decimal (String a ){
             
        float decimalValue = Float.parseFloat(a);
        
		System.out.println(decimalValue);
            return(decimalValue);
        }
    
    
    
    public static void main(String[] args) {
        
        System.out.println(" enter two numbers to  perform calculation");
         System.out.println("  +  to  perform Addition");
         System.out.println("  -  to  perform Subtraction");
         System.out.println("  b  to  perform Backspace function");
         System.out.println("  After one number enter operator then enter second number  ");
            char e = 0;
            
          
        
        
        do {
            

        
            Scanner input = new Scanner(System.in);
       
        int a = input.nextInt();
        
        
       
        
        
        calculator cal  = new calculator();

     
        Scanner sc = new Scanner(System.in);
        
        // Character input
        char c = sc.next().charAt(0);
        
       switch (c) {
  case '+':
      cal.sum(a);
    break;
  case '-':
     cal.subtract(a);
    break;
     case 'b':
         String s=String.valueOf(a);
      cal.Backspace(s);
    break;
     case 'd':
        String d=String.valueOf(a);
      cal.decimal(d);
    break;
//     case 'u':
//      System.out.println(" this is a vowel");
//    break;
   
  default :
  	 System.out.println(" this is not a valid operator");
}
        
                
        
        } while( e <= 5);
        
        
        
        
        
    }
    
}
