import java.util.*;
 
class PQueue {
    public static void main(String args[])
    {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
 
        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
	pQueue.add(50);	
        System.out.println("Queue elements:"+pQueue);
        System.out.println("First element:"+pQueue.peek());
 
        System.out.println("Element removed:"+pQueue.poll()); 
        System.out.println("Remaining Queue:"+pQueue); //printing queue
        pQueue.remove(50); 
        System.out.println("Remaining Queue:"+pQueue); //printing queue
 

    }
}