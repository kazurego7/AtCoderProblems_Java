package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int ans = K * (int) Math.pow(K - 1, N - 1);
        System.out.println(ans);
    }
}