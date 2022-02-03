package javaforeveryone;
public class JavaEncapsulation {

	private String pageName;
	private int postNum;
	
	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public int getPostNum() {
		return postNum;
	}

	public void setPostNum(int postNum) {
		this.postNum = postNum;
	}

	public static void main(String[] args) {
		
		JavaEncapsulation object=new JavaEncapsulation();
		object.setPageName("java_for_everyone");
		object.setPostNum(51);
		System.out.println("Page Name is "+ object.getPageName() +" post number is "+object.postNum);
	}

}
