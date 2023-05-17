package Javaprogramme;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		String initial, rev=" ";
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter a string");
		
		initial =scan.nextLine();
		
		int length=initial.length();
		
		for(int i=length-1;i>=0;i--){
			
			rev=rev+initial.charAt(i);
			
			
		}
		
	  	System.out.println("resverse String:  "+rev);
		

	}
}


