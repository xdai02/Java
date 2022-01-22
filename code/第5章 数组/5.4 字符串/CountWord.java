import java.util.Scanner;

public class CountWord {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����Ӣ�����ӣ�");
		String str = scanner.nextLine();
		// "\\s+"��ʾһ���������ո񡢻س����Ʊ����ȿհ׷�
		String[] words = str.split("\\s+");
		System.out.println("���ʸ�����" + words.length);
		for(String word : words) {
			System.out.println("\t" + word);
		}
		scanner.close();
	}
}
