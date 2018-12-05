class GoodDog {
	private int size;
	
	public int getSize(){
		return size;
	}

	public void setSize(int s) {
		size = s;
	}
	
	void bark(int x) {
		while(x > 0) {		
			if(size > 60) {
				System.out.println("Guf Guf!");
			} else if(size > 14) {
				System.out.println("Wuf Wuf!");
			} else {
				System.out.println("Tyaf Tyaf!");
			}
			x--;
		}
	}
}

class GoodDogTestDrive {
	public static void main(String[] args) {
		GoodDog one = new GoodDog();
		one.setSize(70);
		GoodDog two = new GoodDog();
		two.setSize(8);
		GoodDog three = new GoodDog();
		three.setSize(35);
		
		System.out.println("The first dog: " + one.getSize());
		System.out.println("The second dog: " + two.getSize());
		System.out.println("The third dog: " + three.getSize());
		
		one.bark(3);
		two.bark(5);
		three.bark(10);
	}
}