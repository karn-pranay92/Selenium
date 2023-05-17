package Javaprogramme;

public class SwapStringWithoutTempandThirdVaiable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String a="hello";
		
		String b="world";
		
		
		System.out.println("Before Swaping");
		
		System.out.println("the value a is " +a);
		
		System.out.println("the value  b is " +b);
		
		
		//1. Appebnd a and b 
		
		a=a+b; //helloworld
		
		//2.store initial value String b in String a
		
		
		b=a.substring(0, a.length()-b.length());
		
		
		//3.stroe initial String B in string a
		
		a=a.substring(b.length());
		
		System.out.println("After Swaping");
		
		System.out.println("the value a is " +a);

		
		System.out.println("the value b is " +b);

	}
	
}
