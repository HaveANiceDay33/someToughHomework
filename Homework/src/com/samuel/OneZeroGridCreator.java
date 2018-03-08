package com.samuel;

import java.util.Scanner;

public class OneZeroGridCreator {
	public static void main(String args []) {
		System.out.println("How many rows would you like?");
		Scanner input = new Scanner(System.in);
		int rows;
		rows = input.nextInt();
		System.out.println("How many columns would you like?");
		int columns;
		columns = input.nextInt();
		String[] columnCount = new String[columns];
		String[] rowArray= new String[rows];
		String columnEntry = "0";
		for(int index =0; index < rows; index ++) {
			if(columnEntry.equals("0")) {
				columnEntry= "1";
			}else if(columnEntry.equals("1")){
				columnEntry = "0";
			}
			
			for(int indexC =0; indexC < columns-1; indexC++) {
				
				if(columnEntry.equals("0")) {
					columnEntry= "1";
				}else if(columnEntry.equals("1")){
					columnEntry = "0";
				}
				columnCount[indexC] = columnEntry;
				System.out.print(columnCount[indexC]);
			}
			rowArray[index] = columnEntry;
			System.out.println(rowArray[index]);
		}
	}
}
