public class Person {
	private int age;
	
	public void setAge(int age) throws Exception {
		if(age < 0 || age > 130) {
			throw new Exception();
		}
		this.age = age;	
	}
	
	public static void main(String[] args) {
		try {
			Person person = new Person();
			person.setAge(-1);
		} catch(Exception e) {
			System.out.println("ƒÍ¡‰“Ï≥£");
		}
	}
}