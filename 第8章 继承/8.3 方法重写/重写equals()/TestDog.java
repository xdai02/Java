public class TestDog {
	public static void main(String[] args) {
		Dog dog1 = new Dog("����", 3, "��ʿ��");
		Dog dog2 = new Dog("����", 3, "��ʿ��");
		
		System.out.println(dog1 == dog2);
		System.out.println(dog1.equals(dog2));
	}
}
