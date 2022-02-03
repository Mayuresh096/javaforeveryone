package javaforeveryone;

public class JavaLogical {

	public static void main(String[] args) {
		   boolean a = true;
		   boolean b = false;
		   //Logical AND
		   System.out.println("a && b = " + (a&&b));
		   //Logical OR
		   System.out.println("a || b = " + (a||b) );
		   System.out.println("!(a && b) = " + !(a && b));

	}

}

/* Output:
 			a && b = false
 			a || b = true
 			!(a && b) = true
 */
