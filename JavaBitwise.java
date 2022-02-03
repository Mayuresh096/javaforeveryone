package javaforeveryone;

public class JavaBitwise {

	public static void main(String[] args) {
		
		  int a = 60;	/* 60 = 0011 1100 */
	      int b = 13;	/* 13 = 0000 1101 */
	      int c = 0;
	      //Bitwise AND
	      c = a & b;         /* 12 = 0000 1100 */  
	      System.out.println("a & b = " + c );
	      //Bitwise OR
	      c = a | b;        /* 61 = 0011 1101 */  
	      System.out.println("a | b = " + c );
	      //Bitwise XOR
	      c = a ^ b;        /* 49 = 0011 0001 */  
	      System.out.println("a ^ b = " + c );
	      //Bitwise Complement
	      c = ~a;           /*-61 = 1100 0011 */  
	      System.out.println("~a = " + c );
		
	}

}
/* Output:
  			a & b = 12
  			a | b = 61
  			a ^ b = 49
  			~a = -61
 */
