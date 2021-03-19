import java.util.Scanner;

public class InverseSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		double sum = 0.0;
		
		System.out.print(" ‰»În£∫");
		n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {
			sum += 1.0 / i;
		}
		
		System.out.println(sum);
		scanner.close();
	}
}
