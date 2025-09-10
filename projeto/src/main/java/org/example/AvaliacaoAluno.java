package org.example;

import java.util.Scanner;

public class AvaliacaoAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a nota " + i + ": ");
            soma += sc.nextDouble();
        }

        double media = soma / 4;
        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 4) {
            System.out.println("Aluno em final.");
        } else {
            System.out.println("Aluno reprovado.");
        }
        sc.close();
    }
}