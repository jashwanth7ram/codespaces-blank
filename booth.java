import java.util.*;

public class Booth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Q = sc.nextInt();
        int M = sc.nextInt();

        int length = Integer.toBinaryString(Q).length()+1;

        int A = 0;
        int Q_1 = 0;

        for (int i = 0; i < length; i++) {

            int Q_0 = Q & 1;

            if (Q_0 == 0 && Q_1 == 1) {
                A = A + M;
            }
            else if (Q_0 == 1 && Q_1 == 0) {
                A = A - M;
            }

            Q_1 = Q_0;

            int A_LSB = A & 1;

            Q = (Q >>> 1) | (A_LSB << (length - 1));

            A = A >> 1;
        }

        System.out.println(
            (A << length) | (Q & ((1 << length) - 1))
        );
    }
}