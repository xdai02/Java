public class BasicToString {
	public static void main(String[] args) {
		int num = 10;
		
		// 1. �����ַ���ƴ���������
		String s1 = num + "";
		System.out.println(s1);
		
		// 2. ���Ƽ�ʹ�á�ʹ���ַ����ľ�̬����valueOf()���
		String s2 = String.valueOf(num);
		System.out.println(s2);
		
		// 3. ������װ���ʵ������toString()���
		String s3 = Integer.valueOf(num).toString();
		System.out.println(s3);
		
		// 4. ������װ��ľ�̬����toString()���
		String s4 = Integer.toString(10);
		System.out.println(s4);
	}
}
