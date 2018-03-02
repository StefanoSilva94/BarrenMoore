import java.lang.reflect.Array;

public class Swamp {
	private int horizontalPosition;
	private int verticalPosition;

	// This will tell you the coordinates of where you are.
	
	private int [][] swampGrid = new int[10][2];
	
	public int[][] populateGrid() {
		for (int i = 0; i < 10; i++) {
			
			swampGrid[0][i] = i + 1;
			swampGrid[1][i] = i + 1;
			
		}
		return swampGrid;
		
	}
	
	int[][] treasurePosition = {{2},{3}};
	int[][] startPosition = {{5},{5}};
	
	
	
	public boolean foundTreasure() {
		if (treasurePosition == startPosition) {
			return true;
			
			 
		}
		return false;
	}
	
	
	

	
	
	

}
