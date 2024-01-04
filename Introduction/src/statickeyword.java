
public class statickeyword {
	
	String name; // instance variable
	String address;
	static String city =  "Pune"; //class variables
	static int i =0;
	
	// static block
	
	static {
		
		city =  "Pune";
		
	}
	
	
	statickeyword(String name,String address)
	
	{
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
	
	}
	
	public void getAddress() {
		
		System.out.println(address+ "  " +city);
		
	}
	
	public static void getCity() // static method
	{
		
		System.out.println(city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		statickeyword obj = new statickeyword("Bob", "Marthalli");
		statickeyword obj1 = new statickeyword("ram", "mithanagar");
		obj.getAddress();
		obj1.getAddress();
		statickeyword.getCity();
		
	}

}
