import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		int n = 0;		// 位数
		
		System.out.print("输入一个整数：");
		num = scanner.nextInt();
		
		do {
			num /= 10;
			n++;
		} while(num != 0);
		
		System.out.println("位数：" + n);
		scanner.close();
	}
}
