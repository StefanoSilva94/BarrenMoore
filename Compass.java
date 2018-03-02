import java.util.Scanner;

public class Compass {
	
	private int[][] personPosition = { { 3 }, { 3 } };
	
	public static int[][] movePersonNorth() {
		personPosition[1][0] = personPosition[1][0] + 1;
		return personPosition;
	}

	public static int[][] movePersonSouth() {
		personPosition[1][0] = personPosition[1][0] - 1;
		return personPosition;
	}

	public static int[][] movePersonEast() {
		personPosition[0][0] = personPosition[0][0] + 1;
		return personPosition;
	}

	public static int[][] movePersonWest() {
		personPosition[0][0] = personPosition[0][0] - 1;
		return personPosition;
	}
	

	

	
}