public class AgeException extends RuntimeException {
	public AgeException() {
		super("年龄异常");
	}
	
	public AgeException(int age) {
		super("年龄异常：" + age);
	}
}
