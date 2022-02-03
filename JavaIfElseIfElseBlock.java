package javaforeveryone;

public class JavaIfElseIfElseBlock {

	public static void main(String[] args) {
		
		int age=17;
		if(age>=18) {
			System.out.println("You can now get a driving license of gear vehicle!");
		}else if(age<18 && age>=16) {
			System.out.println("You can now get a driving license of non-gear vehicle!");
		}else {
			System.out.println("You are not allowed to drive a vehicle!");
		}

	}

}
/* Output:
 			You can now get a driving license of non-gear vehicle!
*/
