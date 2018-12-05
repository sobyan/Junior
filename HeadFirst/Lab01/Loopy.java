public class Loopy {
	public static void main (String[] args) {
		int x = 1;
		System.out.println("Before the circle begins");
		while (x < 4) {
			System.out.println("Inside of the circle");
			System.out.println("the value of x equals " + x);
			x = x + 1;
		}
		System.out.println("After the end of the circle");
	}
	
}