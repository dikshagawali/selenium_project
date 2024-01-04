import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class JavaStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Ram");
		names.add("Don");
		names.add("Adam");
		names.add("Alok");
		int count = 0;

		for (int i = 0; i < names.size(); i++) {

			String actual = names.get(i);
			// System.out.println(actual);

			if (actual.startsWith("A")) {

				count++;
			}

		}

		System.out.println(count);

	}
	
	@Test
	public void streamFilter() {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Ram");
		names.add("Don");
		names.add("Adam");
		names.add("Alok");
		
		Long c = names.stream().filter(s->s.startsWith("A")).count();
		
		System.out.println(c);
		
		long d = Stream.of("Abhijeet","Ram","Don","Adam","Alok").filter(s->{
			
			s.startsWith("A");
			return true;
		}).count();
		
		System.out.println(d);
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	}

}
