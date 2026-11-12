package CoachingLog;
/**
 * Deadlift.java
 * 
 * Subclass of Lift representing Deadlift.
 * Inherits calculate1RM, getName, and percentage table from Lift.
 * Sets its own display name.
 * 
 * @author David Barron
 */
// LO 9: Inheritance — extends Lift parent class.
public class Deadlift extends Lift {
	/**
	 * Constructs a Deadlift instance.
	 */
	public Deadlift() {
		super("Deadlift");
	}
}
