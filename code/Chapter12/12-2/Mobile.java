public class Mobile {
	public static void main(String[] args) {
		// $1��ʾ��ȡ��1�������ֵ
		// $3��ʾ��ȡ��3�������ֵ
		System.out.println("13671712345".replaceAll(
			"(\\d{3})(\\d{4})(\\d{3})", 
			"$1****$3"));
	}
}
