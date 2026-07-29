public class Random {
    private static String regex = "[:\\[\\]]+";

    public static String message(String logLine) {
        String[] arr = new String[2];
        arr = logLine.split(" ", 2);
        return arr[1];
    }

    public static String logLevel(String logLine) {
        String[] arr = new String[2];
        arr = logLine.split(" ", 2);
        arr = arr[0].split(regex, 1);
        return arr[0].toLowerCase();
    }

    public static String reformat(String logLine) {
        String[] arr = new String[2];
        arr = logLine.split(" ", 2);
        return arr[1]+ " (" + arr[0].split(regex, 1)[0].toLowerCase() + ")";
    }
}
