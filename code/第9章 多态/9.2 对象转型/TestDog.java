public class TestDog {
	public static void main(String[] args) {
		Animal animal = new Dog("����");
		if(animal instanceof Dog) {
			Dog dog = (Dog)animal;
			dog.makeSound();
		}
	}
}
