/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Administrator
 */
public class queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
// use non-primative types when constructing

// to add a value to the back of queue:
 queue.add(7);
queue.add(9);
queue.add(10);
queue.add(91);
queue.add(1);
queue.add(2);
queue.add(4);

       
// to remove and return front value:
int next = queue.remove();


System.out.println(queue);

 System.out.println(queue.poll());
// to just return front value without removing:
int peek = queue.peek();


System.out.println(next);
        System.out.println(peek);
    }
    
}
