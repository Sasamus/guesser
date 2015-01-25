package se.miun.dt015a.guesser;

/**
 * Uses an Oracle to find a secret number in [1,max].
 *
 * @author Christoffer Fink
 */
public interface Guesser {
  /**
   * Find a secret number by proposing guesses to an Oracle.
   * @param max the (inclusive) max for the secret number (min is always 1).
   * @param oracle knows everything and will help you learn the secret.
   * @return the secret number
   */
  public int findNumber(int max, Oracle oracle);
}
