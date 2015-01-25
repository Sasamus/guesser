package se.miun.dt015a.guesser;

/**
 * The Oracle is all-knowing, and it will use its wisdom to guide your search. 
 * @author Christoffer Fink
 */
public interface Oracle  {

  /** An answer from an Oracle. */
  public enum Answer {
    /** Your guess was too low - the secret number is bigger. */
    TOO_LOW,
    /** Your guess is spot on. */
    MATCH,
    /** Your guess was too high - the secret number is smaller. */
    TOO_HIGH,
  }

  /** Propose a number to the Oracle and use the answer to refine your guess. */
  public Answer test(int guess);
}
