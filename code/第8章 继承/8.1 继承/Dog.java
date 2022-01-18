public class Dog extends Animal {
	private String type;
	
	public Dog(String name, int age, String type) {
		super(name, age);
		this.type = type;
	}
	
	public void bite() {
		System.out.println("“ß»À");
	}
}