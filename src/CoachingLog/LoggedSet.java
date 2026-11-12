package CoachingLog;

/**
 * Lead Author(s):
 *
 * @author David Barron
 *
 *         References: The constructor and getters follow the pattern of my own
 *         Lift class from the CISC 190 1RM Calculator.
 *
 *         Version/date: 1.0, November 11, 2026
 *
 *         Responsibilities of class: Represents one performed set (target reps,
 *         actual reps, and weight) and reports its volume (actual reps *
 *         weight).
 */
public class LoggedSet {
	private int targetReps;
	private int actualReps;
	private double weight;

	public LoggedSet(int targetReps, int actualReps, double weight) {
		this.targetReps = targetReps;
		this.actualReps = actualReps;
		this.weight = weight;
	}

	public int getTargetReps() {
		return targetReps;
	}

	public int getActualReps() {
		return actualReps;
	}

	public double getWeight() {
		return weight;
	}

	public double getVolume() {
		return weight * actualReps;
	}
}