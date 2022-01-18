public class StringEqual {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");

        if(s1 == s2) {
            System.out.println("s1和s2是同一个对象");
        }

        if(s1.equals(s2)) {
            System.out.println("s1与s2内容相同");
        }

        if(s1.equalsIgnoreCase(s2)) {
            System.out.println("s1与s2忽略大小写内容相同");
        }
    }
}
