public class AgeException extends RuntimeException {
	public AgeException() {
		super("�����쳣");
	}
	
	public AgeException(int age) {
		super("�����쳣��" + age);
	}
}
