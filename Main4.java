import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        int n = in.nextInt();
        double [] a = new double[n];
        for (int i = 0; i < n; i++)
            a[i] = in.nextDouble();
        double k = a[1] - a[0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] - a[j] < k) {
                    k = a[i] - a[j];
                }
            }
        }
        out.print(k);
    }
}
