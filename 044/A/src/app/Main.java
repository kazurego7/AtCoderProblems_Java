package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        if (N - K < 0) {
            System.out.println(N * X);
        } else {
            System.out.println(K * X + (N - K) * Y);
        }
    }
}