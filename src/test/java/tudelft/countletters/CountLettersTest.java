package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWordsS() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void lastWordMatchWithR() {
        int words = new CountLetters().count("cat|corner");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void multipleMatchingWordsR() {
        int words = new CountLetters().count("corner|ledger");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void firstWordMatchWithR() {
        int words = new CountLetters().count("corner|cat");
        Assertions.assertEquals(1, words);
    }

}