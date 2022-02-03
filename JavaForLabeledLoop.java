package javaforeveryone;

public class JavaForLabeledLoop {

	public static void main(String[] args) {
		
		FirstLoop:  //Label Declaration
	        for(int i=1;i<=3;i++){  
	            SecondLoop:  //Label Declaration
	                for(int j=1;j<=3;j++){  
	                    if(i==2&&j==2){  
	                        break FirstLoop;  
	                    }  
	                    System.out.println(i+" "+j);  
	                }  
	        } 
	}

}
/* Output:
 			1 1
			1 2
			1 3
			2 1
*/
