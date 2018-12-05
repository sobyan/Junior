public class TestFormats {
	public static void main(String[] args) {
		String s = String.format("I can fix %,9.2f mistakes.", 476578.09876);
		System.out.println(s);
	}
}