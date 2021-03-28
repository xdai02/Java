public class StringMethod {
	public static void main(String[] args) {
		// 1. 判断空字符串
		System.out.println("".isEmpty());
		
		// 2. 字符串长度
		System.out.println("Hello World".length());
		
		// 3. 字符串拼接
		System.out.println("Hello".concat("World"));
		
		// 4. 字符串截取
		System.out.println("Hello World".substring(4));
		System.out.println("Hello World".substring(4, 8));
		
		// 5. 字符串替换
		System.out.println("Hello World".replace('l', 'L'));
		System.out.println("Hello World".replace("Hello", "Bye"));
		
		// 6. 获取指定位置字符
		System.out.println("Hello".charAt(1));
		
		// 7. 查询字符位置
		System.out.println("Hello World".indexOf('l'));
		System.out.println("Hello World".indexOf('l', 5));
		System.out.println("Hello World".lastIndexOf('l'));
		System.out.println("Hello World".lastIndexOf('l', 5));
		
		// 8. 去除字符串首位空白字符
		System.out.println("   Hello World   ".trim());
		
		// 9. 大小写转换
		System.out.println("Hello World".toLowerCase());
		System.out.println("Hello World".toUpperCase());
		
		// 10. 判断是否存在子串
		System.out.println("Hello World".contains("llo"));
		
		// 11. 判断是否以指定字符串开头/结尾
		System.out.println("Hello World".startsWith("Hell"));
		System.out.println("Hello World".endsWith("ld"));
		
		// 12. 判断两个字符串内容是否相同
		System.out.println("Hello".equals("Hello"));
		
		// 13. 判断两个字符串内容是否相同（忽略大小写）
		System.out.println("Hello".equalsIgnoreCase("hello"));
		
		// 14. 比较两个字符串大小
		System.out.println("Hello".compareTo("Hall"));
		
		// 15. 比较两个字符串大小（忽略大小写）
		System.out.println("Hello".compareToIgnoreCase("HELLO"));
	}
}
