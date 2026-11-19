package CoachingLog;

/**
 * Lead Author(s):
 *
 * @author David Barron
 *
 *         References: Follows the pattern of my own Tester class from my 1RM Calculator. 
 *         try/catch from Java, Java, Java, Section 10.4.
 *
 *         Version/date: 1.0, November 18, 2026
 *
 *         Responsibilities of class: Tests LoggedSet with normal and invalid
 *         inputs and prints the volume or the error message for each one.
 */

public class LoggedSetTester {
	public static void main(String[] args) {
		// LO7: each test is in its own try/catch, so a bad entry prints a
		// message instead of crashing the program.
		// Normal Set
		try {
			LoggedSet set1 = new LoggedSet(5, 5, 225.0);
			System.out.println("Volume: " + set1.getVolume());
		} catch (InvalidEntryException e) {
			System.out.println("Error: " + e.getMessage());
		}

		// Failed Set: Actual Reps is 0
		try {
			LoggedSet set2 = new LoggedSet(5, 0, 225.0);
			System.out.println("Volume: " + set2.getVolume());
		} catch (InvalidEntryException e) {
			System.out.println("Error: " + e.getMessage());
		}

		// Bad Target Reps: Target Reps is 0
		try {
			LoggedSet set3 = new LoggedSet(0, 5, 225.0);
			System.out.println("Volume: " + set3.getVolume());
		} catch (InvalidEntryException e) {
			System.out.println("Error: " + e.getMessage());
		}

		// Bad Actual Reps: Actual Reps is less than 0
		try {
			LoggedSet set4 = new LoggedSet(5, -1, 225.0);
			System.out.println("Volume: " + set4.getVolume());
		} catch (InvalidEntryException e) {
			System.out.println("Error: " + e.getMessage());
		}

		// Bad Weight: Weight is less than 0
		try {
			LoggedSet set5 = new LoggedSet(5, 5, -225.0);
			System.out.println("Volume: " + set5.getVolume());
		} catch (InvalidEntryException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}
}
