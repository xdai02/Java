public class Person {
	private int age;
	
	public void setAge(int age) throws AgeException {
		if(age < 0 || age > 130) {
			throw new AgeException(age);
		}
		this.age = age;
	}
	
	public static void main(String[] args) {
		try {
			Person person = new Person();
			person.setAge(-1);
		} catch(AgeException e) {
			e.printStackTrace();
		}
	}
}
