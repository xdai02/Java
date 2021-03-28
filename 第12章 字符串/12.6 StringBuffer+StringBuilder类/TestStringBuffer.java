public class TestStringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb);
		
		sb.append("world!");
		System.out.println(sb);
		
		sb.insert(5, ", ");
		System.out.println(sb);
		
		sb.delete(5, 7);
		System.out.println(sb);
		
		sb.replace(0, 5, "Hi");
		System.out.println(sb);
		
		sb.setCharAt(2, 'W');
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}
}
