public class Mobile {
	public static void main(String[] args) {
		// $1表示获取第1个分组的值
		// $3表示获取第3个分组的值
		System.out.println("13671712345".replaceAll(
			"(\\d{3})(\\d{4})(\\d{3})", 
			"$1****$3"));
	}
}
