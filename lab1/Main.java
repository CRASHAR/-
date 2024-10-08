import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //int[] array = {7, 1, 5, 3, 6, 4};
        String string = " ";
        System.out.println(Main.isSubsequence("leeeeetcode","yylyyeyeyeyeyeyeytycyoydyey"));
        //System.out.println(Main.isSubsequence("aaaaaa","bbaaaa"));
    }
    public static boolean isSubsequence(String s, String t) {
        int index = 0;
        int prevIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            System.out.println(t.indexOf(s.charAt(i),prevIndex));
            if (t.indexOf(s.charAt(i), prevIndex) == -1) {
                return false;
            } else if (t.indexOf(s.charAt(i), prevIndex + 1) > prevIndex) {
                prevIndex = t.indexOf(s.charAt(i),prevIndex + 1);
            } else if (i == 0 && t.indexOf(s.charAt(i), prevIndex) >= prevIndex)
            {
                prevIndex = t.indexOf(s.charAt(i),prevIndex);
            } else
            {
                return false;
            }
        }
        return true;
    }


}
