package com.samuel;
import java.util.Scanner;

public class ch7ex1SamuelMunro {
	public static boolean isVowel(String letter) {
		
		if(letter.equals("a") || letter.equals("e") || letter.equals("i")||letter.equals("o")|| letter.equals("u") ) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static void main(String [] args) {
		System.out.println("Enter a letter:");
		Scanner input = new Scanner(System.in);
		
		String letter = input.nextLine().toLowerCase();
		boolean vowel = isVowel(letter);
		
		System.out.println("Your letter is a vowel: "+vowel);
	}
}
