public class Split {
    public static void main(String[] args) {
        String str = "This is a string.";
        String[] s = str.split(" ");
        for(String item : s) {
            System.out.println(item);
        }
    }
}
