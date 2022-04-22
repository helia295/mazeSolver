/* StackAgenda.java
 * 
 * This file implements the stack structure using Linkedlist
 * 
 * Part of HW3
 */

import java.util.LinkedList;

public class StackAgenda extends Agenda{
	// Your code goes here
	
	private LinkedList<MazeGridLocation> stack;
	
	public StackAgenda() {
		stack = new LinkedList<MazeGridLocation>();
		
	}	
	
	//to get first element in the stack 
	public MazeGridLocation getFirst() {
		
		return stack.getFirst();
		
	}
	
	//to add to the top of the stack
	public void addLocation(MazeGridLocation s) {
		
		stack.push(s);
		
	}	
	
	//to remove from top of the stack
	public MazeGridLocation removeLocation() {
		
		return stack.pop();
		
	}	

	//to read into string
	public String toString() {
		
		return stack.toString();
	}
	
	
	//to check if the list is empty
	public boolean isEmpty() {
		
		return stack.isEmpty();
	}	
	
	
	//to clear out the content of the list
	public void clear() {
		
		stack.clear();
	}			
	
	
	//to return the size of list
	public int size() {
		
		return stack.size();
	}

	public static void main(String[] args) {
		
		StackAgenda stack = new StackAgenda();
		MazeGridLocation s1 = new MazeGridLocation(5, 6, '.');
		MazeGridLocation s2 = new MazeGridLocation(1, 2, '.');
		MazeGridLocation s3 = new MazeGridLocation(4, 3, '.');
		MazeGridLocation s4 = new MazeGridLocation(0, -1, '.');
		
		System.out.println("our stack: " + stack.toString() + " should be []" );
		System.out.println("size: " + stack.size() + "should be 0" );
		System.out.println("empty? " + stack.isEmpty());
		
		stack.addLocation(s1);
		System.out.println("stack added " + s1.toString() + " : " + stack.toString());
		
		stack.addLocation(s2);
		System.out.println("stack added " + s2.toString() + " : " + stack.toString());
		
		stack.addLocation(s3);
		System.out.println("stack added " + s3.toString() + " : " + stack.toString());
		
		stack.addLocation(s4);
		System.out.println("stack added " + s4.toString() + " : " + stack.toString());
		
		System.out.println("our stack: " + stack.toString() + " should be [(0,-1), (4,3), (1,2), (5,6)]");
		System.out.println("size: " + stack.size() + " should be 4");
		System.out.println("first element: " + stack.getFirst().toString() + " should be (0,-1)");
		
		System.out.println("stack popped " + stack.removeLocation() + " : " + stack.toString());
		System.out.println("size: " + stack.size() + " should be 3" );
		System.out.println("empty? " + stack.isEmpty() + " should be false" );
		System.out.println("first element: " + stack.getFirst().toString() + " should be (4,3)");
	
		stack.clear();
		System.out.println("our stack cleared: " + stack.toString() + " should be []" );
		System.out.println("size: " + stack.size() + " should be 0" );
		System.out.println("empty? " + stack.isEmpty());
	}	

}
