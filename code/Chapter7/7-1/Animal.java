public class Animal {
	private String name;
	private int age;

	public Animal() {
		this.name = "";
		this.age = 0;
	}

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void eat() {
		System.out.println("³Ô·¹");
	}

	public void sleep() {
		System.out.println("Ë¯¾õ");
	}
}
