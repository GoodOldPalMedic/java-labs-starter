package edu.course.lab01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


class CourseToolkitTest {

    @Test
    void returnsTrueForEvenNumber() {
        boolean result = CourseToolkit.isEven(8);

        assertTrue(result);
    }

    @Test
    void returnsFalseForOddNumber() {
        boolean result = CourseToolkit.isEven(7);

        assertFalse(result);
    }

    @Test
    void isEven_returnsTrueForEvenNumber() {
        boolean result = CourseToolkit.isEven(-8);

        assertTrue(result);
    }

    @Test
    void isPrime_returnsFalseForNumbersBelowTwo() {
        assertFalse(CourseToolkit.isPrime(-5));
        assertFalse(CourseToolkit.isPrime(0));
        assertFalse(CourseToolkit.isPrime(1));
    }

    @Test
    void isPrime_returnsTrueForTwo() {
        assertTrue(CourseToolkit.isPrime(2));
    }

    @Test
    void isPrime_returnsTrueForPrimeNumber() {
        assertTrue(CourseToolkit.isPrime(19));
    }

    @Test
    void isPrime_returnsFalseForCompositeNumber() {
        assertFalse(CourseToolkit.isPrime(21));
    }

    @Test
    void isPrime_returnsFalseForSquareOfPrime() {
        assertFalse(CourseToolkit.isPrime(49));
    }

    @Test
    void isPalindrome_returnsTrueForPalindrome() {
        assertTrue(CourseToolkit.isPalindrome("12321"));
    }

    @Test
    void isPalindrome_returnsFalseForNonPalindrome() {
        assertFalse(CourseToolkit.isPalindrome("12345"));
    }

    @Test
    void isPalindrome_isCaseSensitive() {
        assertFalse(CourseToolkit.isPalindrome("Aa"));
    }

    @Test
    void average_returnsCorrectResult() {
        assertEquals(3.0, CourseToolkit.average(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void average_returnsNegativeResult() {
        assertEquals(-3.0, CourseToolkit.average(new int[]{-2, -4}));
    }

    @Test
    void average_returnsFractionalResult() {
        assertEquals(2.5, CourseToolkit.average(new int[]{2, 3}));
    }


}
