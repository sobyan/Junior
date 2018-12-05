public class TestExceptions {
	
	public static void main(String[] args) {
		
		String test = "yes";
		try {
			System.out.println("Start of try");
			doRisky(test);
			System.out.println("End of try");
		} catch (Exception e) {
			System.out.println("Creepy exception");
		} finally {
			System.out.println("finally");
		}
		System.out.println("End of main");
	}
	
	static void doRisky(String test) throws Exception {
		System.out.println("Start of a dangerous method");
		
		if("yes".equals(test)) {
			throw new Exception();
		}
		System.out.println("End of a dangerous method");
		return;
	}
}