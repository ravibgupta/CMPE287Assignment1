package com.test;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
	 public static void main(String[] args) {
	        // write your code here
	        Scanner input = new Scanner(System.in);
	        String s;

	        do
	        {
	            System.out.print("Enter either a Number or Phrase or a String:");
	            s = input.nextLine();
	            if (checkPalindrome(s))
	                System.out.println("Palindrome");
	            else
	                System.out.println("Not a palindrome");
	        }
	        while (s.length( ) != 0);
	        
	    }

	    public static boolean checkPalindrome(String temp)
	    {
	        String in  =  temp.toLowerCase().replaceAll("\\s","");
	        Queue<Character> q1 = new LinkedList<Character>( );
	        Stack<Character> s1 = new Stack<Character>( );
	        Character ch;
	        int diff = 0;
	        int j;
	        for (j = 0; j < in.length( ); j++)
	        {
	            ch = in.charAt(j);
	            if (Character.isLetter(ch)|| Character.isDigit(ch))
	            {
	                q1.add(ch);
	                s1.push(ch);
	            }
	            else
	            {
	                return false;
	            }

	        }

	        while (!q1.isEmpty( ))
	        {
	            if (q1.remove( ) != s1.pop( ))
	                diff++;
	        }

	        return (diff == 0);
	    }
}
