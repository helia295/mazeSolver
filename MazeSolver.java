/* MazeSolver.java
 * 
 * This program solves mazes using Agenda
 * 
 * Part of HW3
 */


import java.util.ArrayList;
import java.util.Iterator;

class MazeSolver{
	
	private Agenda list;

	public MazeSolver(Agenda a){
		// Your code goes here!
		
		list = a;
		
	}
	
	/*public boolean explore(Maze m, MazeGridLocation curr, ArrayList<MazeGridLocation> path) {
		
		if (m.isVisited(curr) == true && curr.isWall() == true) {
			return false;
		}	
		
		path.add(curr);
		m.markVisited(curr);
		
		
		if (curr.equals(m.getGoalLocation())) {

			return true;
		}
		
		
		for (MazeGridLocation next : m.getOpenNeighbors(curr)) {
			if (explore(m, next, path) == true) {
				
				return true;
			}	
			
		}
		path.remove(path.size() - 1);
		return false;
	}	*/

	public ArrayList<MazeGridLocation> solveMaze(Maze m, MazeGUI mg) {	
		// Your code goes here!
		//return null; // This is just here so your program compiles!
		
		ArrayList<MazeGridLocation> temp = new ArrayList<MazeGridLocation>();
		
		temp.add(m.getStartLocation());
		list.addLocation(m.getStartLocation());
		//System.out.println(explore(m, m.getStartLocation()));
		
		MazeGridLocation curr;
		
		while (list.isEmpty() == false) {
			
			curr = list.removeLocation();
			
			if (curr.equals(m.getGoalLocation())) {
				
				break;
			}
			
			m.markVisited(curr);
			mg.visitLoc(curr);
			
			//MazeGridLocation[] next = m.getOpenNeighbors(curr);
			for (MazeGridLocation next : m.getOpenNeighbors(curr)) {
				if (m.isVisited(next) == false && next.isWall() == false) {
					
					list.addLocation(next);
					temp.add(next);
					mg.addLocToPath(next);
					m.markVisited(next);
					mg.visitLoc(next);
					mg.addLocToAgenda(next);
					mg.pause(150);
					
				} else {
					temp.remove(next);
					temp.add(curr);
					mg.addLocToPath(curr);
					
				}
				
				//System.out.println(explore(m, next));
				/*if (explore(m, next,temp)) {
					list.addLocation(next);
					m.markVisited(next);
					mg.visitLoc(next);
					mg.addLocToAgenda(next);
					mg.pause(150);
				
					temp.add(next);
					mg.addLocToPath(next);
					return temp;
				}*/
			}
		}		
			
		return temp;
	}

}
