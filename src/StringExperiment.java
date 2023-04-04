import java.util.Arrays;

public class StringExperiment {
    private static String string;

    public static String[] stringSplit(String s) {
        string = s;
        String[] chars = string.split("");
        for (int i = 0; i < chars.length; i++) {
            System.out.print("[" + chars[i] + "]" + " ");
        }
        return chars;
    }
    public static String stringChange(String s, String symbol, int position) {
        string = s;
        String[] chars = string.split("");
        chars[position - 1] = symbol;
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        return Arrays.toString(chars);
    }
}
