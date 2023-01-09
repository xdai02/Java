public class StringSlice {
    public static void main(String[] args) {
        String str = "Hello World!";

        System.out.println("[Substring]");
        System.out.println(str.substring(4));
        System.out.println(str.substring(4, 8));

        System.out.println("[Split]");
        String[] items = str.split(" ");
        for (String item : items) {
            System.out.println(item);
        }
    }
}
