class Dog {
	String name;
	public static void main (String[] args) {
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "Bart";
		
		Dog[] myDogs = new Dog[3];
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;
		
		myDogs[0].name = "Fred";
		myDogs[1].name = "George";
		
		System.out.println("The name of last dog is " + myDogs[2].name);
		
		// перебор элементов массива
		int x = 0;
		while(x < myDogs.length) {
			myDogs[x].bark();
			x++;
		}
		
	}
	
	public void bark() {
		System.out.println(name + " said Guf!");
	}
}