import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        int n = in.nextInt();
        int min = in.nextInt();
        int max = in.nextInt();
        if (max < min) {
            int a = max;
            max = min;
            min = a;
        }
        if ((max+min)%2 == 0) {
            out.print(2);
        }
        else {
            int l = 0;
            int k = 3;
            while (k <= n && l == 0) {
                int x = in.nextInt();
                if (x < min) {
                    min = x;
                }
                if (x > max) {
                    max = x;
                }
                if ((min+max)%2 == 0) {
                    l = k;
                }
                k++;
            }
            out.print(l);
        }
    }
}
