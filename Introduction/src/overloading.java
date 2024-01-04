
public class overloading {
	
	
	public void getdata(int a) {
		
		System.out.println(a);
	}
	
	public void getdata(String b, int a) {
		
		System.out.println(b);
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		overloading o = new overloading();
		
		o.getdata(2);
		o.getdata("Hello",7);
	}

}
