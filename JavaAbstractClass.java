package javaforeveryone;

//Abstract Class Declaration
abstract class AbstractClass{
	//Abstract Method Declaration
	abstract void displayMsg();
}

public class JavaAbstractClass extends AbstractClass {

	@Override
	void displayMsg() {
		
		System.out.println("Hello do follow @java_for_everyone");
	}
	
	public static void main(String[] args) {
		
		JavaAbstractClass object=new JavaAbstractClass();
		object.displayMsg();

	}
	
}
/* Output:
           Hello do follow @java_for_everyone
*/