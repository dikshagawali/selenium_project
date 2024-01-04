
public class Bike extends Vehicle {

	
	public void run()
	 {
		 System.out.println("Bike is running safely");
		
		 
	 }  
	 
	 
	 
	public void getdata() 
	 {
		    super.getdata();
			System.out.println("Abhijeet");
		}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Bike obj = new Bike();//creating object  
		  obj.run();//calling method  
		  obj.getdata();
		 
		 

	}

}
