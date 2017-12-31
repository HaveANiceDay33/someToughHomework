package com.samuel;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

public class ch10ex3SamuelMunro {
	
	
	public static int removeNum(Vector<Integer> array, int length, int removable) {
		int loc;
		boolean found = false;
		
		for(loc =0; loc < length;loc++) {
			if(array.elementAt(loc) == removable) {
				found = true;
				break;
			}
		}
		if( found == true ) {
			return loc;
		}else {
			return -1;
		}
	}
	
	public static void main (String [] args) throws FileNotFoundException {
		Scanner ex10in = new Scanner(new FileReader("ch10ex3in.txt"));
		Vector<Integer> list = new Vector<Integer>(11);
		int index;
		for(index = 0; index < 11; index++) {
			list.insertElementAt(ex10in.nextInt(), index);	
		}
	
		int remove = removeNum(list, 12, 4);
		if (remove == -1) {
			System.out.println("Did not find the selected number");
		}else {
			System.out.println("Removed: "+list.elementAt(remove)+ ". The new list is:");
			list.removeElementAt(remove);
			
			System.out.println(list);
		}
	}
}
