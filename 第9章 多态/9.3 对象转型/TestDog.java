public class TestDog {
	public static void main(String[] args) {
		Animal animal = new Dog("¹·×Ó");
		if(animal instanceof Dog) {
			Dog dog = (Dog)animal;
			dog.makeSound();
		}
	}
}
