class Animal {
	Animal() {
		System.out.println("Creating the Animal");
	}
}
class Hippo extends Animal{
	Hippo() {
		System.out.println("Creating the Hippo");
	}
}

public class TestHippo {
	public static void main(String[] args) {
		System.out.println("Beginning...");
		Hippo h = new Hippo();
	}
}