package javaforeveryone;

public class JavaShift {

	public static void main(String[] args) {
		
		//Left Shift
		System.out.println(10<<2);//10*2^2=10*4=40  
		System.out.println(10<<3);//10*2^3=10*8=80  
		//Right Shift
		System.out.println(20>>2);//20/2^2=20/4=5  
		System.out.println(20>>3);//20/2^3=20/8=2  
		//Unsigned Right Shift
		 //For positive number, >> and >>> works same  
	    System.out.println(20>>2);  
	    System.out.println(20>>>2);  
	    //For negative number, >>> changes parity bit (MSB) to 0  
	    System.out.println(-20>>2);  
	    System.out.println(-20>>>2);  

	}

}

/* Output:
	  		40
	  		80
	  		5
	  		2
	  		5
	  		5
	  		-5
	  		1073741819
 */
