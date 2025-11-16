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
        double k = Math.abs(a[1] - a[0]);
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (Math.abs(a[i] - a[j]) < k) {
                    k = Math.abs(a[i] - a[j]);
                }
            }
        }
        out.print(k);
    }
}
