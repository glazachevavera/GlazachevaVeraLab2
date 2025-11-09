import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        int n = in.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();
        int l = 0;
        int k = 1;
        while (k < n && l == 0) {
            int min = a[0];
            int max = a[0];
            for (int i = 1; i <= k; i++) {
                if (a[i] > max) {
                    max = a[i];
                }
                if (a[i] < min) {
                    min = a[i];
                }
            }
            if (Math.abs(min%2) == Math.abs(max%2)) {
                l = k+1;
            }
            k++;
        }
        out.print(l);
    }
}
