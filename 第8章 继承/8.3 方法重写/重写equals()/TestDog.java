public class TestDog {
	public static void main(String[] args) {
		Dog dog1 = new Dog("狗子", 3, "哈士奇");
		Dog dog2 = new Dog("狗子", 3, "哈士奇");
		
		System.out.println(dog1 == dog2);
		System.out.println(dog1.equals(dog2));
	}
}
