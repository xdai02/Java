public class StringStaticMethod {
	public static void main(String[] args) {
		// join()���ַ���ƴ��
		String[] info = {"2021", "3", "28"};
		String date = String.join("/", info);
		System.out.println(date);

		// format()���ַ�����ʽ��
		String name = "С��";
		int age = 18;
		char gender = 'M';
		double height = 178.2;
		System.out.println(String.format(
				"������%s�����䣺%d���Ա�%c����ߣ�%.2f", 
				name, age, gender, height));
	}
}
