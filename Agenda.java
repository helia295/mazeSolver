/* Agenda.java
 * 
 * This is the abstract class which Stack and Queue both extend
 * 
 * Part of HW3
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;


abstract class Agenda{
	// Your code goes here
	
	public LinkedList<MazeGridLocation> list;
	
	//add a class to the stack or the queue
	abstract public void addLocation(MazeGridLocation s);
	
	
	//remove the first element of the list
	abstract public MazeGridLocation removeLocation();
	
	//get the first element of the list
	abstract public MazeGridLocation getFirst();
	
	//to read into string
	public String toString() {
		
		String str = "[";
		Iterator<MazeGridLocation> iter = list.iterator();
		
		if (iter.hasNext()) {
			
			str += iter.next().toString();
		}
		while (iter.hasNext()) {
			
			str += ", " + iter.next().toString();
		}
		str += "]";
		
		return str;
	}
	
	//to check if the list is empty
	public boolean isEmpty() {
		
		return list.isEmpty();
	}	
	
	//to clear out the content of the list
	public void clear() {
		
		list.clear();
	}			
	
	//to return the size of list
	public int size() {
		
		return list.size();
	}

}
