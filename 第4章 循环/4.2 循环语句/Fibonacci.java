import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		int num1, num2, val;
		
		System.out.print("输入斐波那契数列长度：");
		n = scanner.nextInt();
		
		if(n == 1) {
			System.out.println("1");
		} else if(n == 2) {
			System.out.println("1, 1");
		} else {
			num1 = 1;
			num2 = 1;
			System.out.print("1, 1");
			for(int i = 3; i <= n; i++) {
				val = num1 + num2;
				System.out.print(", " + val);
				num1 = num2;
				num2 = val;
			}
			System.out.println();
		}
		scanner.close();
	}
}
