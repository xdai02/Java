import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		int a, b, c;
		
		System.out.print("����һ����λ����");
		num = scanner.nextInt();
		
		a = num / 100;
		b = num / 10 % 10;
		c = num % 10;
		
		System.out.println("����" + (c*100 + b*10 + a));
		scanner.close();
	}
}