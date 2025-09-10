package org.example;

import java.util.Scanner;

public class Combinatoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de n (n < k): ");
        int n = sc.nextInt();
        System.out.print("Digite o valor de k: ");
        int k = sc.nextInt();

        if (n >= k) {
            System.out.println("Erro: n deve ser menor que k.");
        } else {
            long resultado = fatorial(k) / (fatorial(n) * fatorial(k - n));
            System.out.println("C(" + k + "," + n + ") = " + resultado);
        }
        sc.close();
    }

    private static long fatorial(int num) {
        long fat = 1;
        for (int i = 2; i <= num; i++) {
            fat *= i;
        }
        return fat;
    }
}