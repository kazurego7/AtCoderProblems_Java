import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();

        if (a == 0) {
            System.out.println(b / x + 1);
        } else {
            System.out.println(b / x - (a - 1) / x);
        }
    }
}
