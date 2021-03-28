public class StringToBasic {
	public static void main(String[] args) {
		// 1. 使用包装类的静态方法valueOf()完成
		Integer num1 = Integer.valueOf("10");
		System.out.println(num1);
		
		// 2. 使用包装类的静态方法parseXXX()完成
		int num2 = Integer.parseInt("10");
		System.out.println(num2);
	}
}
