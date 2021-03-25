public class Ackermann {
	public static void main(String[] args) {
		System.out.println(A(3, 4));
	}
	
	/**
	 * Ackermann's Function 
	 *           ?        n + 1             m = 0
	 * A(m, n) = ?      A(m-1, 1)           m > 0, n = 0
	 *           ?  A(m-1, A(m, n-1))       m > 0, n > 0
	 */
	public static int A(int m, int n) {
	    if(m == 0) {
	        return n + 1;
	    } else if(m > 0 && n == 0) {
	        return A(m-1, 1);
	    } else {
	        return A(m-1, A(m, n-1));
	    }
	}
}