package Main;

import java.util.Scanner;

public class Plus3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
        for(int i = 0; i < n; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A + B);
        }
    }
}