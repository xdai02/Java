public class Verification {
	public static void main(String[] args) {
		// 1. 验证QQ账号：长度5-11，首位不为0
		System.out.println("2513276112".matches("[1-9]\\d{4,10}"));
		
		// 2. 验证QQ邮箱：QQ号码@qq.com
		System.out.println("2513276112@qq.com".matches("[1-9]\\d{4,10}@qq\\.com"));
		
		// 3. 验证手机号
		System.out.println("13671712345".matches("1[356789]\\d{9}"));
		
		// 4. 验证固定电话：区号（3-4位）-电话号码（8位）
		System.out.println("021-55031234".matches("\\d{3,4}-\\d{8}"));
		
		// 5. 验证126或163邮箱：邮箱名（4-12位有效字符）@126/163.com
		System.out.println("admin123@163.com".matches("\\w{4,12}@(126|163)\\.com"));
	}
}
