public class InstantiateString {
	public static void main(String[] args) {
		// �ڶ��Ͽ�����һ��String����Ŀռ䣬���ѵĵ�ַ����s1
		// �ѿռ�����һ���ڲ������ԣ�ָ�������е�"hello world"
		String s1 = new String("hello world");
		// �ڶ��Ͽ�����һ��String����Ŀռ䣬���ѵĵ�ַ����s2
		// �ѿռ�����һ���ڲ������ԣ�ָ�������е�"hello world"
		String s2 = new String("hello world");
		
		// ��ʱs1��s2������ѿռ�ĵ�ַ
		System.out.println(s1 == s2);
		// String������д��equals()��ʵ���˱Ƚ�ʵ��ָ�������е��ַ���
		System.out.println(s1.equals(s2));
	}
}
