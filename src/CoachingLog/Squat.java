package CoachingLog;
/**
 * Squat.java
 * 
 * Subclass of Lift representing Back Squat.
 * Inherits calculate1RM, getName, and percentage table from Lift.
 * Sets its own display name.
 * 
 * @author David Barron
 */
// LO 9: Inheritance — extends Lift parent class.
public class Squat extends Lift {
	
	/**
	 * Constructs a Back Squat instance.
	 */
	public Squat() {
		super("Back Squat");
	}
}
