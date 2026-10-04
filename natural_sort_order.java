import java.util.*;

public class xyz {

    static int naturalCompare(String a, String b) {

        int i = 0;
        int j = 0;

        while (i < a.length() && j < b.length()) {

            char c1 = a.charAt(i);
            char c2 = b.charAt(j);

            // Both are digits
            if (Character.isDigit(c1) && Character.isDigit(c2)) {

                int num1 = 0;
                int num2 = 0;

                while (i < a.length() && Character.isDigit(a.charAt(i))) {
                    num1 = num1 * 10 + (a.charAt(i) - '0');
                    i++;
                }

                while (j < b.length() && Character.isDigit(b.charAt(j))) {
                    num2 = num2 * 10 + (b.charAt(j) - '0');
                    j++;
                }

                if (num1 != num2) {
                    return Integer.compare(num1, num2);
                }
            }

            // Compare normal characters
            else {

                if (c1 != c2) {
                    return Character.compare(c1, c2);
                }

                i++;
                j++;
            }
        }

        return Integer.compare(a.length(), b.length());
    }

    public static void main(String[] args) {

        String[] arr = {
            "file10",
            "file2",
            "file1",
            "file20",
            "file3"
        };

        Arrays.sort(arr, xyz::naturalCompare);

        for (String s : arr) {
            System.out.println(s);
        }
    }
}