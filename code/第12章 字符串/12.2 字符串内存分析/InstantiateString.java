public class InstantiateString {
	public static void main(String[] args) {
		// 在堆上开辟了一个String对象的空间，将堆的地址赋给s1
		// 堆空间中有一个内部的属性，指向常量池中的"hello world"
		String s1 = new String("hello world");
		// 在堆上开辟了一个String对象的空间，将堆的地址赋给s2
		// 堆空间中有一个内部的属性，指向常量池中的"hello world"
		String s2 = new String("hello world");
		
		// 此时s1和s2是两块堆空间的地址
		System.out.println(s1 == s2);
		// String类中重写了equals()，实现了比较实际指向常量池中的字符串
		System.out.println(s1.equals(s2));
	}
}
