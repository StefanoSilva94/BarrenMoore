import java.util.Scanner;

public class RunnerClass {
	public static void main(String[] args) {

		
		Swamp s = new Swamp();

		startGame();

	}

	private static Scanner sc = new Scanner(System.in);
	static int[][] treasurePosition = { { 2 }, { 3 } };
	static int[][] personPosition = { { 5 }, { 5 } };

	public static boolean foundTreasure() {
		if (treasurePosition == personPosition) {
			return true;

		}
		return false;
	}

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

	public static double treasureDistance() {
		int personXCoord = personPosition[0][0];
		int personYCoord = personPosition[1][0];
		int treasureYCoord = 3;
		int baseXCoord = 3;
		int baseYCoord = personYCoord;

		double ans = 0;

		ans = ans + (personXCoord - baseXCoord) * (personXCoord - baseXCoord);
		ans = ans + (treasureYCoord - baseYCoord) * (treasureYCoord - baseYCoord);
		ans = Math.sqrt(ans);

		return ans;

	}

	public static void startGame() {
		System.out.println("Grey foggy clouds float oppressively close to you, \r\n" + "\r\n"
				+ "reflected in the murky grey water which reaches up your shins.\r\n" + "\r\n"
				+ "Some black plants barely poke out of the shallow water.");
		System.out.println("");
		findTreasure();
	}

	public static void findTreasure() {
		while (2 == 2) {
			if (treasureDistance() == 0) {
				System.out.println("Well Done, you found it!");
				break;
			} else {
				System.out.println("Which direction do you want to move: North, South, East or West?");
				String input = sc.next();
				if (input.equals("north") || input.equals("n") || input.equals("N") || input.equals("North")) {
					movePersonNorth();
				} else if (input.equalsIgnoreCase("south") || input.equalsIgnoreCase("s")) {
					movePersonSouth();
				} else if (input.equalsIgnoreCase("east") || input.equalsIgnoreCase("e")) {
					movePersonEast();
				} else if (input.equalsIgnoreCase("west") || input.equalsIgnoreCase("w")) {
					movePersonWest();
				} else {
					System.out.println("That was an invalid direction!");
				}

			}

			System.out.println("" + "Your distance from the treasure is: " + treasureDistance() + " metres");
			System.out.println("");

		}
	}

}
