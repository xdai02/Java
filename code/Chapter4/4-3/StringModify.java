import java.util.Locale;

public class StringModify {
    public static void main(String[] args) {
        String str = "Hello World!";

        System.out.println("[Concat]");
        System.out.println(str.concat("!!"));

        System.out.println("[To Lower/Upper Case]");
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        System.out.println("[Trim]");
        System.out.println("   Hello World!\n \t".trim());

        System.out.println("[Replace]");
        System.out.println(str.replace('l', 'L'));
        System.out.println(str.replace("Hello", "Bye"));
    }
}
