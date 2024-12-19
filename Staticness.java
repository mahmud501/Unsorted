package classwork;
public class Staticness {
	
	private int a = 0;
	private static int b = 0;
	
	public void increment() {
			a++;
			b++;
	}

	public String toString() {
			return "(a=" + a + ",b=" + b + ")";
	}
		
}