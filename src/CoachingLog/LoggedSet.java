package CoachingLog;

/**
 * Lead Author(s):
 *
 * @author David Barron
 *
 *         References: The constructor and getters follow the pattern of my own
 *         Lift class. 
 *         Validation follows Java, Java, Java, Section 10.6.
 *
 *         Version/date: 1.1, November 18, 2026
 *
 *         Responsibilities of class: Represents one performed set (target reps,
 *         actual reps, and weight), rejects invalid entries, and reports its
 *         volume (actual reps * weight).
 */
public class LoggedSet {
	private int targetReps;
	private int actualReps;
	private double weight;
	
	/**
	 * Creates one set after checking that each entry is valid.
	 *
	 * @param targetReps the reps planned for the set (at least 1)
	 * @param actualReps the reps the client completed (0 or more; 0 means a
	 *                   failed set)
	 * @param weight     the weight used, in pounds (cannot be negative)
	 * @throws InvalidEntryException if any entry is out of range
	 */
	// LO7: throws my custom exception instead of storing a bad entry.
	public LoggedSet(int targetReps, int actualReps, double weight) throws InvalidEntryException {
		if (targetReps <= 0) {
			throw new InvalidEntryException("Target reps cannot be 0 or less.");
		}
		if (actualReps < 0) {
			throw new InvalidEntryException("Actual reps cannot be negative.");
		}
		if (weight < 0) {
			throw new InvalidEntryException("Weight cannot be negative.");
		}
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