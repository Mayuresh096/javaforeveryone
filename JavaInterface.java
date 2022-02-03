package javaforeveryone;

interface abstractionInterface{
	public void displayMsg();
}

public class JavaInterface implements abstractionInterface {

	@Override
	public void displayMsg() {
		
		System.out.println("Hello do follow @java_for_everyone");
		
	}
	
	public static void main(String[] args) {
		
		JavaInterface object=new JavaInterface();
		object.displayMsg();

	}	

}
/* Output:
			Hello do follow @java_for_everyone
*/