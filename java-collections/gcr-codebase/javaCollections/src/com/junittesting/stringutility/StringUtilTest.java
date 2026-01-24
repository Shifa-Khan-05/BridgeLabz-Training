package com.junittesting.stringutility;

import static org.junit.Assert.*;
import org.junit.Test;

// JUnit 4 test class for StringUtils
public class StringUtilTest {

    StringUtils utils = new StringUtils();

    @Test
    public void testReverse() {
        assertEquals("olleh", utils.reverse("hello"));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(utils.isPalindrome("madam"));
        assertFalse(utils.isPalindrome("java"));
    }

    @Test
    public void testToUpperCase() {
        assertEquals("HELLO", utils.toUpperCase("hello"));
    }
}
