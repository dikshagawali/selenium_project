//one try can be followed by multiple catch
// catch should be an immediate catch block


public class ExceptionDemo {

	
	 int a = 4;
	 
	
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int b = 7;
		 int c = 0;
		 
		 try {
		 
		 int k = b/c;
		 
		 }
		 
		 catch(Exception e)
		 {
			 System.out.println("I  catch the error");
			 
		 }
		
		 finally{
			 
			 System.out.println("delete coockies");
			 
		 }
		
	}

}
