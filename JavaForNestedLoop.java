package javaforeveryone;

public class JavaForNestedLoop {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++){ 
			
				for(int j=1;j<=i;j++){  
				        System.out.print("* ");  
				}  //End of Second For loop
				
			System.out.println();//new line  
		}  //End of First For Loop

	}

}
/* Output:
 			* 
			* * 
			* * * 
			* * * * 
			* * * * * 
*/
