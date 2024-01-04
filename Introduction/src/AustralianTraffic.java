
public class AustralianTraffic implements CentralTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CentralTraffic a = new AustralianTraffic();
		a.flashYellow();
		a.greenGo();
		a.redStop();
		

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greenGo implementation");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		
		System.out.println("redStop implementation");
		
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		
		System.out.println("flashYellow implementation");
		
	}

}
