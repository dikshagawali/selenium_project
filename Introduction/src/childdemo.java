
public class childdemo extends parentdemo{

	
	public void getdata(int a, String b) {
		  
		   super.getdata(a, b); // super keyword use with method
		   System.out.println(super.a);
		   System.out.println(super.b);//super keyword use with variable
		 
	   }


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		childdemo cd = new childdemo();
		cd.getdata(5, "Diksha");
		
		
	}

}
