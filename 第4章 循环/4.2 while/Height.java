import java.util.Scanner;

public class Height {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double height;
		double total = 0;
		double average;
		int i = 1;
		
		while(i <= 5) {
			System.out.print("�����" + i + "���˵���ߣ�");
			height = scanner.nextDouble();
			total += height;
			i++;
		}
		
		average = total / 5;
		System.out.println(String.format("ƽ����ߣ�%.2f", average));		
		scanner.close();
	}
}
