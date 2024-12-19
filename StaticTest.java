package classwork;
public class StaticTest {	

	public static void main (String[] args) {
		Staticness s = new Staticness();
		Staticness t = new Staticness();
		
		s.increment();
		t.increment();
		t.increment();
		
		System.out.println (s);
		System.out.println (t);

	}
}