package com.test;
import static org.junit.Assert.*;

import org.junit.Test;
public class TestPalindrome {
	 @Test
	    public void checkPalindromeTest1() {
	        boolean result = Palindrome.checkPalindrome("2222");
	        assertEquals(true, result);
	    }

	    @Test
	    public void checkPalindromeTest2() {
	        boolean result = Palindrome.checkPalindrome("19395");
	        assertEquals(false, result);
	    }

	    @Test
	    public void checkPalindromeTest3() {
	        boolean result = Palindrome.checkPalindrome("manam");
	        assertEquals(true, result);
	    }

	    @Test
	    public void checkPalindromeTest4() {
	        boolean result = Palindrome.checkPalindrome("abc Aaa aAa cBa");
	        assertEquals(true, result);
	    }

	    @Test
	    public void checkPalindromeTest5() {
	        boolean result = Palindrome.checkPalindrome("Manam");
	        assertTrue(result);
	    }

	    @Test
	    public void checkPalindromeTest6() {
	        boolean result = Palindrome.checkPalindrome("Ma nam");
	        assertTrue(result);
	    }

	    @Test
	    public void checkPalindromeTest7() {
	        boolean result = Palindrome.checkPalindrome(";:");
	        assertEquals(false, result);
	    }

	    @Test
	    public void checkPalindromeTest8() {
	        boolean result = Palindrome.checkPalindrome("");
	        assertEquals(true, result);
	    }

	    @Test (expected= NullPointerException.class)
	    public void checkPalindromeTest9() throws Exception {
	        String st = null;
	        Palindrome.checkPalindrome(st);
	    }
	    @Test
	    public void checkPalindromeTest10() {
	        boolean result = Palindrome.checkPalindrome("33333");
	        assertEquals(true, result);
	    }
	    @Test
	    public void checkPalindromeTest11() {
	        boolean result = Palindrome.checkPalindrome("::");
	        assertEquals(false, result);
	    }
	    @Test
	    public void checkPalindromeTest12() {
	        boolean result = Palindrome.checkPalindrome("ab::ba");
	        assertEquals(false, result);
	    }

}
