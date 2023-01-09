public class FibonacciIterative {
	public static void main(String[] args) {
		int n = 7;
		System.out.println(
			"쳲��������е�" + n + "λ��"+ fibonacci(n)
		);
	}
	
	public static int fibonacci(int n) {
	    int[] f = new int[n];
	    f[0] = f[1] = 1;
	    for(int i = 2; i < n; i++) {
	        f[i] = f[i-2] + f[i-1];
	    }
	    return f[n-1];
	}
}