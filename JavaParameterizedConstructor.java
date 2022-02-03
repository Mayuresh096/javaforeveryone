package javaforeveryone;

public class JavaParameterizedConstructor {

	JavaParameterizedConstructor(String PageName, int PostNo) {
		
		System.out.println("Page Name is "+PageName);
		System.out.println("This is my "+ PostNo +" post");
		
	}
	
	public static void main(String[] args) {
		
		//Create Object
		JavaParameterizedConstructor obj= new JavaParameterizedConstructor("@java_for_everyone",38);

	}

}
/* Output:
			Page Name is @java_for_everyone
			This is my 38 post
*/
