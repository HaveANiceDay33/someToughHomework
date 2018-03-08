package com.samuel;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

public class ch9ex6BETTER {
	public static void main(String args[]) throws FileNotFoundException {
	    Vector<Character> key = new Vector<Character>(20);
	    Scanner ch9in = new Scanner(new FileReader("ch9ex6NEW.txt"));
	    String strKey;
	    
	    strKey = ch9in.nextLine();             //code for getting key
	    
	    for(int index = 0; index <20;index++) {
	    	key.insertElementAt(strKey.charAt(index), index);
	    }
	    
	    Scanner s = null;
	    FileReader inFile = new FileReader("ch9ex6NEW.txt");
	    try {
	    	s = new Scanner(inFile);
	    	s.nextLine();
	    	while(s.hasNext()) {
	    		String str = s.next();
	    		String letter = "A";
	    		char[] myChar = str.toCharArray();
	    		Vector<String> name = new Vector<String>(1);
	    		if(myChar[0] == 'T' || myChar[0] == 'F' || myChar[0] == 'n'){
	    			int score = 0;
	    			Vector<Character> answer = new Vector<Character>(20);
	    			for(int index = 0; index < 20; index++) {
	    				answer.insertElementAt(myChar[index], index);
	    			   	if(answer.elementAt(index).equals(key.elementAt(index))) {
	    		    		
	    		    		score +=2;
	    		    		//System.out.println(score1);
	    		    	}else if(answer.elementAt(index).equals("n")) {
	    		    		score+=0;
	    		    	}
	    		    	else {
	    		    		score-=1;
	    		    	}
	    			}
	    			double trans;
	    			trans = score;
	    			double percent = (trans/40)*100;
	    		    if(percent >= 90) {
	    		    	letter = "A";
	    		    }
	    		    if(percent >= 80 && percent < 90) {
	    		    	letter = "B";
	    		    }
	    		    if(percent >= 70 && percent < 80) {
	    		    	letter = "C";
	    		    }
	    		    if(percent < 60) {
	    		    	letter = "F";
	    		    }
	    		    if(percent>= 60 && percent < 70) {
	    		    	letter = "D";
	    		    }
	    		    System.out.println(letter);
	    		}
	    		else {
	    			
	    			for(int index = 0; index < 1; index++) {
	    				String ID = new String(myChar);
	    				name.insertElementAt(ID, index);
	    			}
	    			System.out.print(name.toString() + "'s test got a(n): ");
	    		}
	    		
	    	}
	    }finally {
	    	if(s != null) {
	    		s.close();
	    	}
	    }
	}
}
