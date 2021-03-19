import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
	    
		System.out.print("输入一个正整数：");
		num = scanner.nextInt();
	    
	    if(num > 0) {
	        if(num % 2 == 0) {
	        	System.out.println(num + "是偶数");
	        } else {
	        	System.out.println(num + "是奇数");
	        }
	    }
	    
	    scanner.close();
	}
}
