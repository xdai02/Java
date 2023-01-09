public class StringMethod {
	public static void main(String[] args) {
		// 1. �жϿ��ַ���
		System.out.println("".isEmpty());
		
		// 2. �ַ�������
		System.out.println("Hello World".length());
		
		// 3. �ַ���ƴ��
		System.out.println("Hello".concat("World"));
		
		// 4. �ַ�����ȡ
		System.out.println("Hello World".substring(4));
		System.out.println("Hello World".substring(4, 8));
		
		// 5. �ַ����滻
		System.out.println("Hello World".replace('l', 'L'));
		System.out.println("Hello World".replace("Hello", "Bye"));
		
		// 6. ��ȡָ��λ���ַ�
		System.out.println("Hello".charAt(1));
		
		// 7. ��ѯ�ַ�λ��
		System.out.println("Hello World".indexOf('l'));
		System.out.println("Hello World".indexOf('l', 5));
		System.out.println("Hello World".lastIndexOf('l'));
		System.out.println("Hello World".lastIndexOf('l', 5));
		
		// 8. ȥ���ַ�����λ�հ��ַ�
		System.out.println("   Hello World   ".trim());
		
		// 9. ��Сдת��
		System.out.println("Hello World".toLowerCase());
		System.out.println("Hello World".toUpperCase());
		
		// 10. �ж��Ƿ������Ӵ�
		System.out.println("Hello World".contains("llo"));
		
		// 11. �ж��Ƿ���ָ���ַ�����ͷ/��β
		System.out.println("Hello World".startsWith("Hell"));
		System.out.println("Hello World".endsWith("ld"));
		
		// 12. �ж������ַ��������Ƿ���ͬ
		System.out.println("Hello".equals("Hello"));
		System.out.println("Hello".equalsIgnoreCase("hello"));
		
		// 13. �Ƚ������ַ�����С
		System.out.println("Hello".compareTo("Hall"));
		System.out.println("Hello".compareToIgnoreCase("HELLO"));
	}
}
