package Morse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestLogik {

    @Test
    public void testConvertToMorse() {

        String testdata = "c";
        StartMorse.sentence = testdata;
        Logik logisk = new Logik();

        String actual = logisk.converterSB(testdata);

        String expected = "_*_* ";
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertToEnglish() {
        String testdata = "*";
        StartMorse.sentence = testdata;
        Logik logisk = new Logik();

        String actual = logisk.converterSB(testdata);

        String expected = "e";
        assertEquals(expected, actual);

    }

    @Test
    public void testOrd() {
        String testdata = "hej";
        StartMorse.sentence = testdata;
        Logik logisk = new Logik();

        String expected = "**** * *___ ";

        String actual = logisk.converterSB(testdata);
        assertEquals(expected, actual);

    }

    @Test
    public void testOrdMorse() {
        String testdata = "**** * *___";
        StartMorse.sentence = testdata;
        Logik logisk = new Logik();

        String expected = "hej";

        String actual = logisk.converterSB(testdata);
        assertEquals(expected, actual);

    }


}
