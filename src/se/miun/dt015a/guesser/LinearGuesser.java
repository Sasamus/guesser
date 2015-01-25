package se.miun.dt015a.guesser;

import se.miun.dt015a.guesser.Oracle.Answer;

/**
 * Implements a linear guessing algorithm.
 * Complete this implementation so that findNumber returns the secret number
 * in time O(n).
 *
 * If you want to be precise, then LinearGuesser should run in time Θ(log n),
 * but if you don't know the difference between Ο, Θ, and Ω, then ignore this
 * part. ;)
 *
 * @author Christoffer Fink
 */
public class LinearGuesser implements Guesser {
	// Do not add any instance variables or constructors.

	@Override
	public int findNumber(int max, Oracle oracle) {
		
		// Answer enum to hold the answer from the Oracle
		Answer answer;
		
		// Answer enum that corresponds to a correct match
		Answer answerCorrect = Answer.MATCH;
		 
		// Iterate to max
		for(int i = 1; i < max; i++){
			
			// Ask the Oracle of i is correct
			answer = oracle.test(i);
			
			// Check if answer equals answerCorrect
			if(answer.equals(answerCorrect)){
				
				// Return i if so
				return i;
			}
		}
		
		// Return -1 of nothing was found
		return -1;
	}
}
