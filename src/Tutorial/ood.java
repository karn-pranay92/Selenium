package Tutorial;

import java.util.Scanner;

public class ood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inital, Rev= ""; 
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter String");
		
		inital= sc.nextLine();
		
		int length=inital.length();
		
		for(int i=length-1;i>=0;i--)
		{
			
			Rev=Rev+inital.charAt(i);
		}
		
		
		System.out.println("Reverse String :" + Rev);
	

	}

}
