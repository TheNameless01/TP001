import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralTest {

    @Test
    void givenNumberWithinRangeWhenConvertingToRomanThenCorrectRomanNumeral() throws FileNotFoundException {
        assertEquals("IV", RomanNumeral.toRoman(4));
        assertEquals("IX", RomanNumeral.toRoman(9));
        assertEquals("XLII", RomanNumeral.toRoman(42));
        assertEquals("XCIX", RomanNumeral.toRoman(99));
        assertEquals("MMXXIV", RomanNumeral.toRoman(2024));
        }

    @Test
    void givenNumberOutOfRangeWhenConvertingToRomanThenIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(0));
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(4000));
    }



        @ParameterizedTest
        @CsvFileSource(resources = "/RomanTest.csv", numLinesToSkip = 1)
        void testToRoman(int number, String expectedRoman) {
            assertEquals(expectedRoman, RomanNumeral.toRoman(number));
        }
}
