package CastObject;

public class CastObjectDemo
{
	public void printUserType(User u)
	{
	    u.printUserType();
	}
	
	public void approveReview(Staff s)
	{
		if (s instanceof Editor) 
		{
			((Editor) s).approveReview(); 
        } else {
        	System.out.println("Invalid object passed!!");
        }
	}

	
	public static void main(String[] args) {
		// Part 1
		User user = new User();
		User staff = new Staff();
		User editor = new Editor();
		
		CastObjectDemo ut = new CastObjectDemo();
		ut.printUserType(user);
		ut.printUserType(staff);
		ut.printUserType(editor);
		
		// Part 2
		//editor.approveReview();
		editor.postAReview();
		editor.saveWebLink();	
		
		// Casting & instanceof demo
		CastObjectDemo ut1 = new CastObjectDemo();
		ut1.approveReview(new Staff());
		ut1.approveReview(new Editor());		
	}

}
