package javaforeveryone;

public class JavaUserDefined {
	//AccessSpecifier ReturnType MethodName ParameterList
	public String displayNamePage(String str) {
		
		return str; //Return value
		
	}
	
	public static void main(String[] args) {
		
		String str="javaforeveryone";
		//Create Object
		JavaUserDefined obj=new JavaUserDefined();
		//Method Calling, we use "." operator
		System.out.println("Name of Page is :"+obj.displayNamePage(str)); /* Here + operator 
																			 is used for concatenation */	
	}

}
