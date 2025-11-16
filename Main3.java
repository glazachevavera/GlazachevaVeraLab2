import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    static boolean isSimple(int x) {
        int k = 0;
        for (int i = 2; i < x; i++) {
            if (x%i == 0) {
                k++;
            }
        }
        return k == 0;
    }
    public static void main(String[] args) {
        int N = in.nextInt();
        int x = N+1;
        while (!isSimple(x) || !isSimple(x+2)) {
            x++;
        }
        out.print(x);
        out.print(" ");
        out.print(x+2);
    }
}
