public class StringMatch {
    public static void main(String[] args) {
        String str = "Hello World!";

        System.out.println("[IndexOf]");
        System.out.println(str.indexOf('l'));
        System.out.println(str.indexOf('l', 5));
        System.out.println(str.lastIndexOf('l'));
        System.out.println(str.lastIndexOf('l', 5));

        System.out.println("[Contains]");
        System.out.println(str.contains("llo"));

        System.out.println("[Starts/Ends With]");
        System.out.println(str.startsWith("Hell"));
        System.out.println(str.endsWith("ld"));

        System.out.println("[Equals]");
        System.out.println(str.equals("hello"));
        System.out.println(str.equalsIgnoreCase("hello world!"));

        System.out.println("[CompareTo]");
        System.out.println(str.compareTo("Hall"));
    }
}
