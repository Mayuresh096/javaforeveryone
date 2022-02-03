package javaforeveryone;

public class JavaUnary {

	public static void main(String[] args) {
		//Unary operators used in this program are: ++,-- & !
		int x=10,y=10,a=5,b=5;
		boolean c=true;
		//Operations on variable x
		System.out.println(x++);//Value will be 10 here as it is post-increment
		System.out.println(x);//Value becomes 11
		//Operations on variable y
		System.out.println(++y);//Value will be 11 here as it is pre-increment 
		System.out.println(y);//Value is 11
		//Operations on variable a
		System.out.println(a--);//Value will be 5 here as it is post-decremenet
		System.out.println(a);//Value becomes 4
		//Operations on variable b
		System.out.println(--b);//Value will be 4 here as it is pre-decrement 
		System.out.println(b);//Value is 4  
		//Operations on variable c
		System.out.println(!c);//false (reverse of boolean value)  
		
	}

}

/* Output:
			10
 			11
 			11
 			11
 			5
 			4
 			4
 			4
 			false		
 */		
