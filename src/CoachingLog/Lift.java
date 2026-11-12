package CoachingLog;

/**
 * Lift.java
 * 
 * Parent class for the three lifts (Bench, Squat, Deadlift). Holds the
 * percentage breakdown and Epley formula for calculating one-rep max
 * 
 * @author David Barron
 */

// LO 8: Custom class
// LO 9: Inheritance

public abstract class Lift {

	// LO 4: Single dimensional array storing percentages for all lifts
	public static final double[] PERCENTAGES = { 50.0, 55.0, 60.0, 65.0, 70.0, 75.0, 80.0, 85.0, 90.0, 95.0, 100.0 };

	// LO 1: Each lift has its own name ("Bench", "Squat", "Deadlift")
	private String name;

	/**
	 * Constructs a Lift via Super().
	 * 
	 * @param name the name of the lift
	 */
	public Lift(String name) {
		this.name = name;
	}

	/**
	 * Calculate the projected one-rm using Epley formula. 1RM = weight * (1 + reps
	 * / 30).
	 * 
	 * @param weight the weight lifted in pounds
	 * @param reps   the number of reps performed
	 * @return thr projected one-rep max in poinds
	 */
	// LO 3: Writes a method with params.
	public double calculate1RM(double weight, int reps) {
		// return the formula result
		return weight * (1 + reps / 30.0);
	}

	/**
	 * Returns the name of lift
	 * 
	 * @return name of lift
	 */
	// LO 3: Return value
	public String getName() {
		// return the name field
		return name;
	}

	/**
	 * Prints the percentage table for console
	 * 
	 * @param oneRM the projected one-rm in pounds.
	 */
	public void printPercentageTable(double oneRM) {
		for (int i = PERCENTAGES.length - 2; i >= 0; i--) {
			double weight = oneRM * (PERCENTAGES[i] / 100.0);
			// got help from Claude to restrict output to two decimal places
			System.out.println(PERCENTAGES[i] + "% - " + String.format("%.2f", weight) + " lbs");
		}
		System.out.println(); // blank line
	}

	/**
	 * Builds the percentage table for GUI.
	 * 
	 * @param oneRM
	 * @return
	 */
	// LO 3
	public String getPercentageTable(double oneRM) {
		String result = "";
		for (int i = PERCENTAGES.length - 2; i >= 0; i--) {
			double weight = oneRM * (PERCENTAGES[i] / 100.0);
			result += PERCENTAGES[i] + "% - " + String.format("%.2f", weight) + " lbs\n";
		}
		return result;

	}
}