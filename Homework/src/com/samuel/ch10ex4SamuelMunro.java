package com.samuel;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

public class ch10ex4SamuelMunro {
	
	
	public static void removeAt(Vector<Integer> array, int length, int index) {
		if(index > length) {
			System.out.println("Index indicated is too large");
		}else {
		array.removeElementAt(index);
		}
	}
	
	public static void main (String [] args) throws FileNotFoundException {
		Scanner ex10in = new Scanner(new FileReader("ch10ex3in.txt"));
		Vector<Integer> list = new Vector<Integer>(11);
		int index;
		for(index = 0; index < 11; index++) {
			list.insertElementAt(ex10in.nextInt(), index);	
		}
		removeAt(list, 11, 4);
		System.out.println("The new array is: "+list);
	}
}

