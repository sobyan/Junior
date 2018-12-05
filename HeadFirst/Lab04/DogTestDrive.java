class Dog {
	int size;
	String name;
	
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

class DogTestDrive {
	public static void main(String[] args) {
		Dog one = new Dog();
		one.size = 70;
		Dog two = new Dog();
		two.size = 8;
		Dog three = new Dog();
		three.size = 35;
		
		one.bark(3);
		two.bark(5);
		three.bark(10);
	}
}