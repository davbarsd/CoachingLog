package CoachingLog;

/**
 * Lead Author(s):
 *
 * @author David Barron
 *
 *         References: Java, Java, Java (Morelli and Walde), Section 10.6,
 *         "Creating and Throwing Your Own Exceptions," p. 487. The
 *         super(message) call follows my own Bench class.
 *
 *         Version/date: 1.0, November 18, 2026
 *
 *         Responsibilities of class: Reports a bad entry, such as negative reps
 *         or weight, with a message the user can read.
 */
// LO4: is-a. InvalidEntryException is an Exception (it extends Exception).
// LO7: my custom exception. LoggedSet throws it when an entry is out of range.

public class InvalidEntryException extends Exception {
	/**
	 * Creates the exception with a message that says what was wrong.
	 *
	 * @param message the reason the entry was rejected
	 */
	public InvalidEntryException(String message) {
		super(message);
	}
}
