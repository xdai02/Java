import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		int n = 0;		// λ��
		
		System.out.print("����һ��������");
		num = scanner.nextInt();
		
		do {
			num /= 10;
			n++;
		} while(num != 0);
		
		System.out.println("λ����" + n);
		scanner.close();
	}
}
