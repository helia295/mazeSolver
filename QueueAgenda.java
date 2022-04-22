/* QueueAgenda.java
 * 
 * This file implements a queue structure using Linkedlist
 * 
 * Part of HW3
 */

import java.util.LinkedList;

public class QueueAgenda extends Agenda{
	// Your code goes here
	
	private LinkedList<MazeGridLocation> queue;
	
	public QueueAgenda() {
		
		queue = new LinkedList<MazeGridLocation>();
		
	}	
	
	//to access the first element of the queue
	public MazeGridLocation getFirst() {
		
		return queue.getFirst();
		
	}	
	
	//to add object to queue in FIFO manner
	public void addLocation(MazeGridLocation s) {
		
		queue.addLast(s);
		
	}	
	
	//to remove object in FIFO manner
	public MazeGridLocation removeLocation() {
		
		return queue.removeFirst();
		
	}	
	
	//to read into string
	public String toString() {
		
		return queue.toString();
	}
	
	
	//to check if the list is empty
	public boolean isEmpty() {
		
		return queue.isEmpty();
	}	
	
	
	//to clear out the content of the list
	public void clear() {
		
		queue.clear();
	}			
	
	
	//to return the size of list
	public int size() {
		
		return queue.size();
	}
	
	public static void main(String[] args) {
		
		QueueAgenda queue = new QueueAgenda();
		MazeGridLocation s1 = new MazeGridLocation(5, 6, '.');
		MazeGridLocation s2 = new MazeGridLocation(1, 2, '.');
		MazeGridLocation s3 = new MazeGridLocation(4, 3, '.');
		MazeGridLocation s4 = new MazeGridLocation(0, -1, '.');
		
		System.out.println("our queue: " + queue.toString() + " should be []" );
		System.out.println("size: " + queue.size() + " should be 0" );
		System.out.println("empty? " + queue.isEmpty());
		
		queue.addLocation(s1);
		System.out.println("queue enqueued " + s1.toString() + " : " + queue.toString());
		
		queue.addLocation(s2);
		System.out.println("queue enqueued " + s2.toString() + " : " + queue.toString());
		
		queue.addLocation(s3);
		System.out.println("queue enqueued " + s3.toString() + " : " + queue.toString());
		
		queue.addLocation(s4);
		System.out.println("queue enqueued " + s4.toString() + " : " + queue.toString());
		
		System.out.println("our queue: " + queue.toString() + " should be [(5,6), (1,2), (4,3), (0,-1)]");
		System.out.println("size: " + queue.size() + " should be 4");
		System.out.println("first element: " + queue.getFirst().toString() + " should be (5,6)");
		
		System.out.println("queue dequeued " + queue.removeLocation() + " : " + queue.toString());
		System.out.println("size: " + queue.size() + " should be 3" );
		System.out.println("empty? " + queue.isEmpty() + " should be false" );
		System.out.println("first element: " + queue.getFirst().toString() + " should be (1,2)");
	
		queue.clear();
		System.out.println("our queue cleared: " + queue.toString() + " should be []" );
		System.out.println("size: " + queue.size() + " should be 0" );
		System.out.println("empty? " + queue.isEmpty());
	}	
}
