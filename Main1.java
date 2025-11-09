import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        int a = in.nextInt();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int p = 1;
            do {
                p *= a%10;
                a /= 10;
            } while (a != 0);
            a = p*7;
            out.print(a);
            if (i != n-1) {
                out.print(", ");
            }
        }
    }
}
