import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int answer = (int)(Math.random() * 100) + 1;	// [1, 100]
		int guess;
		int cnt = 0;		// �²����
		
		do {
			System.out.print("��һ��1-100֮�������");
			guess = scanner.nextInt();
			cnt++;
			if(guess < answer) {
				System.out.println("��С����");
			} else if(guess > answer) {
				System.out.println("�´�����");
			}
		} while(guess != answer);
		
		System.out.println("�¶�����һ������" + cnt + "�Σ�");
		scanner.close();
	}
}
