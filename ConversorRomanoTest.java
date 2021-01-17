package roman;

import org.junit.Test;
import roman.ConversorRomano;

import static org.junit.Assert.assertEquals;

public class ConversorRomanoTest {
    @Test
    public void testIntToRoman() {
        assertEquals("", ConversorRomano.intToRoman(0));
        assertEquals("I", ConversorRomano.intToRoman(1));
        assertEquals("II", ConversorRomano.intToRoman(2));
        assertEquals("III", ConversorRomano.intToRoman(3));
        assertEquals("IV", ConversorRomano.intToRoman(4));
        assertEquals("V", ConversorRomano.intToRoman(5));
        assertEquals("VI", ConversorRomano.intToRoman(6));
        assertEquals("VII", ConversorRomano.intToRoman(7));
        assertEquals("VIII", ConversorRomano.intToRoman(8));
        assertEquals("IX", ConversorRomano.intToRoman(9));
        assertEquals("X", ConversorRomano.intToRoman(10));
        assertEquals("XI", ConversorRomano.intToRoman(11));
        assertEquals("XII", ConversorRomano.intToRoman(12));
        assertEquals("XIII", ConversorRomano.intToRoman(13));
        assertEquals("XIV", ConversorRomano.intToRoman(14));
        assertEquals("XV", ConversorRomano.intToRoman(15));
        assertEquals("XIX", ConversorRomano.intToRoman(19));
        assertEquals("XX", ConversorRomano.intToRoman(20));
        assertEquals("XXV", ConversorRomano.intToRoman(25));
        assertEquals("XXIX", ConversorRomano.intToRoman(29));
        assertEquals("XXX", ConversorRomano.intToRoman(30));
        assertEquals("XL", ConversorRomano.intToRoman(40));
        assertEquals("LXXXVII", ConversorRomano.intToRoman(87));
        assertEquals("XCIX", ConversorRomano.intToRoman(99));
        assertEquals("C", ConversorRomano.intToRoman(100));
        assertEquals("CXI", ConversorRomano.intToRoman(111));
        assertEquals("CL", ConversorRomano.intToRoman(150));
        assertEquals("CCCXCIX", ConversorRomano.intToRoman(399));
        assertEquals("CDLXXXVI", ConversorRomano.intToRoman(486));
        assertEquals("D", ConversorRomano.intToRoman(500));
        assertEquals("DCCCLIV", ConversorRomano.intToRoman(854));
        assertEquals("CMXCIX", ConversorRomano.intToRoman(999));
    }
}
