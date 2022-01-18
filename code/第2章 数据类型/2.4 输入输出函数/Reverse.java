import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		int a, b, c;
		
		System.out.print("输入一个三位数：");
		num = scanner.nextInt();
		
		a = num / 100;
		b = num / 10 % 10;
		c = num % 10;
		
		System.out.println("逆序：" + (c*100 + b*10 + a));
		scanner.close();
	}
}