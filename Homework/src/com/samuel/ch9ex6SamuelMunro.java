package com.samuel;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class ch9ex6SamuelMunro {
	
	public static void main(String [] args) throws FileNotFoundException {
	    Vector<Character> key = new Vector<Character>(20);
	    Scanner ch9in = new Scanner(new FileReader("ch9ex6in.txt"));
	    String strKey;
	    
	    strKey = ch9in.nextLine();             //code for getting key
	    
	    for(int index = 0; index <20;index++) {
	    	key.insertElementAt(strKey.charAt(index), index);
	    }
		//System.out.println(key);
	    char[] stud1 = new char[8]; 
	    String strstud1;
	    
	    strstud1 = ch9in.nextLine();             //code for getting student 1 ID
	    
	    for(int index = 0; index <8;index++) {
	    	stud1[index] = strstud1.charAt(index);
	    }
	    
	    Vector<Character> answer1 = new Vector<Character>(20);
	    String strAns1;
	    
	    strAns1 = ch9in.nextLine();             //code for getting student 1 test
	    
	    for(int index = 0; index <20;index++) {
	    	answer1.insertElementAt(strAns1.charAt(index), index);
	    }
	    
	    char[] stud2 = new char[8]; 
	    String strstud2;
	    
	    strstud2 = ch9in.nextLine();             //code for getting student 2 ID
	    
	    for(int index = 0; index <8;index++) {
	    	stud2[index] = strstud2.charAt(index);
	    }
	    
	    Vector<Character> ans2 = new Vector<Character>(20); 
	    String strAns2;
	    
	    strAns2 = ch9in.nextLine();             //code for getting student 2 test
	    
	    for(int index = 0; index <20;index++) {
	    	ans2.insertElementAt(strAns2.charAt(index), index);
	    }
	    char[] stud3 = new char[8]; 
	    String strstud3;
	    
	    strstud3 = ch9in.nextLine();             //code for getting student 3 ID
	    
	    for(int index = 0; index <8;index++) {
	    	stud3[index] = strstud3.charAt(index);
	    }
	    
	    Vector<Character> ans3 = new Vector<Character>(20); 
	    String strAns3;
	    
	    strAns3 = ch9in.nextLine();             //code for getting student 3 test
	    
	    for(int index = 0; index <20;index++) {
	    	ans3.insertElementAt(strAns3.charAt(index), index);
	    }
	    char[] stud4 = new char[8]; 
	    String strstud4;
	    
	    strstud4 = ch9in.nextLine();             //code for getting student 3 ID
	    
	    for(int index = 0; index <8;index++) {
	    	stud4[index] = strstud4.charAt(index);
	    }
	    
	    Vector<Character> ans4 = new Vector<Character>(20); 
	    String strAns4;
	    
	    strAns4 = ch9in.nextLine();             //code for getting student 3 test
	    
	    for(int index = 0; index <20;index++) {
	    	ans4.insertElementAt(strAns4.charAt(index), index);
	    }
	    
	    int score1 = 0, score2 = 0, score3= 0, score4 = 0;
	    String letter = "null";
	   
	    for(int index = 0; index <20; index++) {
	    	if(answer1.elementAt(index).equals(key.elementAt(index))) {
	    		
	    		score1 +=2;
	    		//System.out.println(score1);
	    	}else if(answer1.elementAt(index).equals("n")) {
	    		score1+=0;
	    	}
	    	else {
	    		score1-=1;
	    	}
	    }
	    double trans;
	    trans = score1;
	    double percent1 = (trans/40) * 100;
	   // System.out.println(score1);
	    if(percent1 >= 90) {
	    	letter = "A";
	    }
	    if(percent1 >= 80 && percent1 < 90) {
	    	letter = "B";
	    }
	    if(percent1 >= 70 && percent1 < 80) {
	    	letter = "C";
	    }
	    if(percent1 < 60) {
	    	letter = "F";
	    }
	    if(percent1 >= 60 && percent1 < 70) {
	    	letter = "D";
	    }
	    
	    
	    System.out.println(strstud1+"'s score is: "+percent1+", which is a(n) "+letter);
	    
	    String letter2 = "null";
	   
	    for(int index = 0; index <20; index++) {
	    	if(ans2.elementAt(index).equals(key.elementAt(index))) {
	    		score2 +=2;
	    		
	    	}else if(ans2.elementAt(index).equals("n")){
	    		score2+=0;
	    	}
	    	else {
	    		score2-=1;
	    	}
	    }
	    double trans2;
	    trans2 = score2;
	    double percent2 = (trans2/40)*100;
	    if(percent2 >= 90) {
	    	letter2 = "A";
	    }
	    if(percent2 >= 80 && percent2 < 90) {
	    	letter2 = "B";
	    }
	    if(percent2 >= 70 && percent2 < 80) {
	    	letter2 = "C";
	    }
	    if(percent2 < 60) {
	    	letter2 = "F";
	    }
	    if(percent2>= 60 && percent2 < 70) {
	    	letter2 = "D";
	    }
	    
	    
	    System.out.println(strstud2+"'s score is: "+percent2+", which is a(n) "+letter2);
	    String letter3 = "null";
		   
	    for(int index = 0; index <20; index++) {
	    	if(ans3.elementAt(index).equals(key.elementAt(index))) {
	    		score3 +=2;
	    		
	    	}else if(ans3.elementAt(index).equals("n")){
	    		score3+=0;
	    	}
	    	else {
	    		score3-=1;
	    	}
	    }
	    double trans3;
	    trans3 = score3;
	    double percent3 = (trans3/40)*100;
	    if(percent3 >= 90) {
	    	letter3 = "A";
	    }
	    if(percent3 >= 80 && percent3 < 90) {
	    	letter3 = "B";
	    }
	    if(percent3 >= 70 && percent3 < 80) {
	    	letter3 = "C";
	    }
	    if(percent3 < 60) {
	    	letter3 = "F";
	    }
	    if(percent3>= 60 && percent3 < 70) {
	    	letter3 = "D";
	    }
	    
	    
	    System.out.println(strstud3+"'s score is: "+percent3+", which is a(n) "+letter3);
	    String letter4 = "null";
		   
	    for(int index = 0; index <20; index++) {
	    	if(ans4.elementAt(index).equals(key.elementAt(index))) {
	    		score4 +=2;
	    		
	    	}else if(ans4.elementAt(index).equals("n")){
	    		score4+=0;
	    	}
	    	else {
	    		score4-=1;
	    	}
	    }
	    double trans4;
	    trans4 = score4;
	    double percent4= (trans4/40)*100;
	    if(percent4 >= 90) {
	    	letter4 = "A";
	    }
	    if(percent4 >= 80 && percent4 < 90) {
	    	letter4 = "B";
	    }
	    if(percent4 >= 70 && percent4 < 80) {
	    	letter4 = "C";
	    }
	    if(percent4 < 60) {
	    	letter4 = "F";
	    }
	    if(percent4>= 60 && percent4 < 70) {
	    	letter4 = "D";
	    }
	    
	    
	    System.out.println(strstud4+"'s score is: "+percent4+", which is a(n) "+letter4);
	    
	}
}
