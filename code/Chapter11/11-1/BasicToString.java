public class BasicToString {
	public static void main(String[] args) {
		int num = 10;
		
		// 1. 利用字符串拼接运算完成
		String s1 = num + "";
		System.out.println(s1);
		
		// 2. 【推荐使用】使用字符串的静态方法valueOf()完成
		String s2 = String.valueOf(num);
		System.out.println(s2);
		
		// 3. 借助包装类的实例方法toString()完成
		String s3 = Integer.valueOf(num).toString();
		System.out.println(s3);
		
		// 4. 借助包装类的静态方法toString()完成
		String s4 = Integer.toString(10);
		System.out.println(s4);
	}
}
