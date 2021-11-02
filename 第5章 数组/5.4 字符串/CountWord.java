import java.util.Scanner;

public class CountWord {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("输入英语句子：");
		String str = scanner.nextLine();
		
		//"\\s+"表示一个或多个空格、回车、制表符等空白符
		String[] words = str.split("\\s+");
		System.out.println("单词个数：" + words.length);
		for(String word : words) {
			System.out.println("\t" + word);
		}
		
		scanner.close();
	}
}
