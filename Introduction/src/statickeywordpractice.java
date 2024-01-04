
public class statickeywordpractice {

	int rollno;  
    String name;  
    String college="ITS";  
	 
	
	
	statickeywordpractice (int r, String n) {
		
		
		rollno =r;
		name = n;
	}
	
	public void display() {
		
		System.out.println(rollno+" "+name+" "+college);
		
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		statickeywordpractice obj = new statickeywordpractice(1,"diksha");  
		
		obj.display();
		
	}

}
