public class Verification {
	public static void main(String[] args) {
		// 1. ��֤QQ�˺ţ�����5-11����λ��Ϊ0
		System.out.println("2513276112".matches("[1-9]\\d{4,10}"));
		
		// 2. ��֤QQ���䣺QQ����@qq.com
		System.out.println("2513276112@qq.com".matches("[1-9]\\d{4,10}@qq\\.com"));
		
		// 3. ��֤�ֻ���
		System.out.println("13671712345".matches("1[356789]\\d{9}"));
		
		// 4. ��֤�̶��绰�����ţ�3-4λ��-�绰���루8λ��
		System.out.println("021-55031234".matches("\\d{3,4}-\\d{8}"));
		
		// 5. ��֤126��163���䣺��������4-12λ��Ч�ַ���@126/163.com
		System.out.println("admin123@163.com".matches("\\w{4,12}@(126|163)\\.com"));
	}
}
