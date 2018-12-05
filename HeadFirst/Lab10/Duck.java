public class Duck {
	private in size;
	
	public static void main(String[] args) {
		System.out.println("Размер равен" + getSize());
	}
	
	public void setSize(int s) {
		size = s;
	}
	public int getSize() {
		return size;
	}
}