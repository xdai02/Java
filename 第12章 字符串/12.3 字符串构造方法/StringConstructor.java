public class StringConstructor {
	public static void main(String[] args) {
		String s1 = new String();
		System.out.println("s1: " + s1);
		
		String s2 = new String("hello");
		System.out.println("s2: " + s2);
		
		String s3 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
		System.out.println("s3: " + s3);
		
		String s4 = new String(new char[] {'h', 'e', 'l', 'l', 'o'}, 1, 3);
		System.out.println("s4: " + s4);
		
		String s5 = new String(new byte[] {65, 66, 67});
		System.out.println("s5: " + s5);
		
		String s6 = new String(new byte[] {65, 66, 67}, 0, 2);
		System.out.println("s6: " + s6);
	}
}
