package se.miun.dt015a.guesser;

import se.miun.dt015a.guesser.Oracle.Answer;

/**
 * Implements a logarithmic guessing algorithm. Complete this implementation so
 * that findNumber returns the secret number in time Ο(log n).
 *
 * @author Christoffer Fink
 */
public class LogGuesser implements Guesser {
	// Do not add any instance variables or constructors.

	@Override
	public int findNumber(int max, Oracle oracle) {

		// Answer enum to hold the answer from the Oracle
		Answer answer;

		// Holds the guess
		int guess;

		// Holds the upper limit
		int upperLimit = max;

		// Holds the lower limit
		int lowerLimit = 1;

		// Goes forever
		while (1 < 2) {

			// Get a guess in the middle of the range left to guess in
			guess = lowerLimit + Math.round((upperLimit - lowerLimit) / 2);

			// Ask the Oracle of i is correct
			answer = oracle.test(guess);

			// Check answer and act accordingly
			if (answer.equals(Answer.TOO_HIGH)) {

				// Set upperLimit to guess - 1, since the limit is inclusive
				upperLimit = guess - 1;

			} else if (answer.equals(Answer.TOO_LOW)) {

				// Set lowerLimitLimit to guess + 1, since the limit is
				// inclusive
				lowerLimit = guess + 1;

			} else if (answer.equals(Answer.MATCH)) {

				// Return i if so
				return guess;

			} else {

				// Return -1 of nothing was found
				return -1;
			}
		}
	}
}
