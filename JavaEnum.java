package javaforeveryone;

public class JavaEnum {

	enum Days{
		Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
	}
	
	public static void main(String[] args) {
	      Days today = Days.Monday;
	      Days testDay = Days.Saturday;
	      System.out.println("Today is " + today);
	      System.out.println(testDay+ " is test day.");
	}

}
/* Output:
 			Today is Monday
			Saturday is test day.
 */
