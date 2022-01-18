public class StringStaticMethod {
	public static void main(String[] args) {
		// join()：字符串拼接
		String[] info = {"2021", "3", "28"};
		String date = String.join("/", info);
		System.out.println(date);

		// format()：字符串格式化
		String name = "小灰";
		int age = 18;
		char gender = 'M';
		double height = 178.2;
		System.out.println(String.format(
				"姓名：%s，年龄：%d，性别：%c，身高：%.2f", 
				name, age, gender, height));
	}
}
