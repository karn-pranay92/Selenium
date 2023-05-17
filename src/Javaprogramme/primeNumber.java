package Javaprogramme;

public class primeNumber {
	
	public static void main(String[] args) {
		
		int i=0;
		
		int num=0;
		                                                                                                                                                       
		String primeNumbers="";
		
		int counter=0;
		
		for(i=1;i<=100;i++){
			
			int counter1=0;
			
			for(num =i; num>=1; num--){
			
			if(i%num==0){
				
			counter1=counter1+1;	
				
				
			}
			
			 if (counter1 ==2)
			  {
			     //Appended the Prime number to the String
			     primeNumbers = primeNumbers + i + " ";
			  }	
		       }	
		       System.out.println("Prime numbers from 1 to 100 are :");
		       System.out.println(primeNumbers);
		
		}
			
		}
		
		

}
	

