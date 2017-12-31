package com.samuel;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

public class ch10ex8SamuelMunro {
	public static int stringSearch(Vector<String> array, int length, String removable) {
		int loc;
		boolean found = false;
		
		for(loc =0; loc < length;loc++) {
			if(array.elementAt(loc).equals(removable)) {
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
	public static void main(String []args) throws FileNotFoundException {
		Scanner ex10in = new Scanner(new FileReader("ch10ex8in.txt"));
		Scanner input = new Scanner(System.in);
		Vector<String> list = new Vector<String>(12);
		System.out.print("Input the item you're searching for: ");
		String choose = input.nextLine();
		int index;
		for(index = 0; index < 12; index++) {
			list.insertElementAt(ex10in.nextLine(), index);	
		}
		int identify = stringSearch(list, 12, choose);
		if(identify == -1) {
		
			
			System.out.println("That occurance doesn't exist");
	
		
		}else {
			System.out.println(choose+ " is at index: "+identify);
			}
	}
	
}
