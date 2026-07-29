public class Test {
    private static String regex = "[:\\[\\]]+";

    public static void main(String[] args) {
        String name = "[error]";
        System.out.println(getName(name));

    }

    public static String getName(String s) {
        String[] arr = s.split(regex, -2);
        return arr[0];
    }
}
