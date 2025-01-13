package refactoring;

import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("inserte un numero");

        int n = sc.nextInt();

        System.out.println("el numero: " + n + " factorial es: " + factorial(n));

        sc.close();
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
