package com.samuel;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class ch7ex6SamuelMunro {

	public static void openFiles() throws IOException {
		FileReader inFile = new FileReader("ch7in.txt");
		FileWriter outFile = new FileWriter("ch7out.txt");
		Scanner ex7in = new Scanner(new FileReader("ch7in.txt"));
		String gender = null;
		
		Vector<Double> gpaMale = new Vector<Double>(1);
		Vector<Double> gpaFemale = new Vector<Double>(1);
		
		int males = 0;
		int females = 0;
		
        Scanner s = null;
        try {
            s = new Scanner(inFile);
            while (s.hasNext())
            {
               String str = s.next(); 
               char[] myChar = str.toCharArray();
               if(myChar[0] == 'f') {
            	   gender = "Female";
            	   females++;
            	  //System.out.println(gender);
               }else if(myChar[0] == 'm') {
            	   gender = "Male";
            	   males++;
            	  // System.out.println(gender);
               }else {
            	   for(int index = 0; index<1; index ++) {
            		  double combo = Double.parseDouble(new String(myChar));
            		  if(gender == "Male") {
            			  
            			  gpaMale.insertElementAt(combo, index);
            		  }
            		  if(gender =="Female") {
            			  gpaFemale.insertElementAt(combo, index);
            		  }
            		  
            	   }
            	   
               }
            }
           // System.out.println("Female GPA's: "+gpaFemale);
            //System.out.println("Male GPA's: "+gpaMale);
            initialize(gpaMale, gpaFemale, males, females);
            
        } finally {
            if (s != null) {
                s.close();
            }
        }
		
	}
	public static void initialize(Vector<Double> males, Vector<Double> wehmans, int malesCount, int femaleCount) throws IOException {
		int countMale = malesCount;
		int countFemale = femaleCount;
		double sumMaleGPA = 0;
		double sumFemaleGPA = 0;
		
		sumGrades(males, wehmans, sumMaleGPA, sumFemaleGPA, countMale, countFemale);
		
			
	}
	public static void sumGrades(Vector<Double> males, Vector<Double> wehmans, double sumMaleGPA, double sumFemaleGPA, int maleCount, int femaleCount) throws IOException {
		for(int i = 0; i < males.size(); i++) {
			sumMaleGPA+=males.elementAt(i);
		}
		for(int i = 0; i < wehmans.size(); i++) {
			sumFemaleGPA+=wehmans.elementAt(i);
		}
		int malesCnt = maleCount;
		int feCnt = femaleCount;
		averageGrades(sumMaleGPA, sumFemaleGPA, malesCnt, feCnt);
		
	}
	public static void averageGrades(double sumMaleGPA, double sumFemaleGPA, int maleCount, int wehmanCount) {
		double avgMale = sumMaleGPA/maleCount;
		double avgFemale = sumFemaleGPA/wehmanCount;
		printResults(avgMale, avgFemale);
	}
	public static void printResults(double avgMale, double avgFemale) {
		System.out.print("Avg male GPA: ");
		System.out.printf("%.2f", avgMale);
		System.out.println("");
		System.out.print("Avg female GPA: ");
		System.out.printf("%.2f", avgFemale);
	}
	public static void main(String [] args) throws IOException {
		openFiles();
	}
}
