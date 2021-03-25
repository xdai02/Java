public class Person {
	private String name;
	private int age;
	
	/**
	 * 无参构造方法
	 */
	public Person() {
		this.name = "";
		this.age = 0;
	}

	/**
	 * 有参构造方法
	 */
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}