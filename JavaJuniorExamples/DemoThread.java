public class DemoThread {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			new HelloThread().start();
		}
		
		System.out.println("Hello from main fread");
	}
	
	private static class HelloThread extends Thread {
		
		@Override
		public void run() {
			System.out.println("Hello from " + getName());
		}
	}
}