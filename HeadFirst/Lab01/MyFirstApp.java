public class MyFirstApp {
	public static void main (String[] args) {
		int x = 3;
		String name = "Knife";
		x = x * 17;
		System.out.println("x equals " + x);
		double d = Math.random();
		
		while (x > 12) {
			x--;	
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("Now x equals " + x);
		}
		
		if (x == 10) {
			System.out.println("x must be equals 10");
		} else {
			System.out.println("x is not 10");
		}
		if ((x < 3) & (name.equals("Knife"))) {
			System.out.println("Be careful!");
		}
		System.out.print("This line is executed in any case");
	}
}