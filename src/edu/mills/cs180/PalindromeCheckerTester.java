package edu.mills.cs180;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PalindromeCheckerTester {

    @Test
    void isPalindrome_True_EmptyString() {
        assertTrue(PalindromeChecker.isPalindrome(""));
    }

    @ParameterizedTest
    @ValueSource(strings = {"AMA", "racecar", "x"})
    void isPailndrome_True_Palindromes(String input) {
        assertTrue(PalindromeChecker.isPalindrome(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Java", "abc", "spatula"})
    void isPailndrome_False_NotPalindromes(String input) {
        assertFalse(PalindromeChecker.isPalindrome(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Ama", "Wow", "reddER"})
    void isPalindrome_True_DifferingCase(String s) {
        assertTrue(PalindromeChecker.isPalindrome(s));
    }

    @ParameterizedTest
    @ValueSource(strings = {"my gym", "top spot", "step on no pets"})
    void isPalindrome_True_HavingSpaces(String s) {
        assertTrue(PalindromeChecker.isPalindrome(s));
    }

    @ParameterizedTest
    @ValueSource(strings = {"WOW!!!", "I did, did I?", "?!"})
    void isPalindrome_True_HavingPunctuationAndSpaces(String s) {
        assertTrue(PalindromeChecker.isPalindrome(s));
    }
}
