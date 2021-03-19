import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int answer = (int)(Math.random() * 100) + 1;	// [1, 100]
		int guess;
		int cnt = 0;		// 猜测次数
		
		do {
			System.out.print("猜一个1-100之间的数：");
			guess = scanner.nextInt();
			cnt++;
			if(guess < answer) {
				System.out.println("猜小啦！");
			} else if(guess > answer) {
				System.out.println("猜大啦！");
			}
		} while(guess != answer);
		
		System.out.println("猜对啦！一共猜了" + cnt + "次！");
		scanner.close();
	}
}
