class MyAnimalList {
	private Animal[] animals = new Animal[5];
	private int nextIndex = 0;
	
	public void add(Animal a) {
		if(nextIndex < animals.length) {
			animals[nextIndex] = a;
			System.out.println("Animal is added to the cell " + nextIndex);
			nextIndex++;
		}
	}
}

public class AnimalTestDrive {
	public static void main(String[] args) {
		MyAnimalList list = new MyAnimalList();
		Animal a = new Animal();
		Animal c = new Animal();
		list.add(a);
		list.add(c);
	}
}