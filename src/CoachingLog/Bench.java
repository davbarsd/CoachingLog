package CoachingLog;

/**
 * Bench.java
 * 
 * Subclass of Lift representing Bench Press. Inherits calculate1RM, getName,
 * and percentage table from Lift. Sets its own display name.
 * 
 * @author David Barron
 */
// LO 9; Inheritance — extends Lift parent class.
public class Bench extends Lift {

	/**
	 * Constructs a Bench instance.
	 */
	public Bench() {
		super("Bench Press");
	}
}
