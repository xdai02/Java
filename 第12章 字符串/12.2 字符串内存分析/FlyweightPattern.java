public class FlyweightPattern {
	public static void main(String[] args) {
		// ��һ��ʹ��"hello world"ʱ���������в�û������ڴ�
		// ��ʱ����һ���¿ռ�洢"hello world"�������ַ����s1
		String s1 = "hello world";
		// �ٴ�ʹ��"hello world"ʱ�����������Ѿ���������ڴ�
		// ��ʱ���迪���¿ռ䣬ֱ�ӽ����пռ��ַ����s2
		String s2 = "hello world";
		// s1��s2��ָ��"hello world"
		System.out.println(s1 == s2);
	}
}
