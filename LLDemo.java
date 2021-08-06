/*Linked list program to remove all elements*/
import java.io.*;
import java.util.LinkedList;
  
class LLDemo {
    public static void main(String args[])
    {
  
        // Creating an empty LinkedList
        LinkedList<String> list = new LinkedList<String>();
  
        // Using add() method to add elements in the list
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("10");
        list.add("20");
  
        // Displaying the List
        System.out.println("Original LinkedList:" + list);
  
        // Clearing the list
        list.clear();
  
        // Accessing the List after clearing it
        System.out.println("List after clearing all elements: " + list);
  
        // Adding elements after clearing the list
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
  
        // Displaying the List
        System.out.println("After adding elements to empty list:" + list);
    }
}
