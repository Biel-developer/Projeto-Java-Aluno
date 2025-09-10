package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        System.out.println("Hello and welcome!");

        do {
            System.out.println("\nEscolha um algoritmo para rodar:");
            System.out.println("1 - Listar divisores");
            System.out.println("2 - Calcular MDC pelo método de Euclides");
            System.out.println("3 - Avaliar situação do aluno");
            System.out.println("4 - Calcular combinatória C(k,n)");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    listaDivisores(sc);
                    break;
                case 2:
                    calculaMDC(sc);
                    break;
                case 3:
                    avaliaAluno(sc);
                    break;
                case 4:
                    calculaCombinatoria(sc);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }

    static void listaDivisores(Scanner sc) {
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        System.out.print("Divisores de " + num + ": ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    static void calculaMDC(Scanner sc) {
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("MDC = " + a);
    }

    static void avaliaAluno(Scanner sc) {
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
    }

    static void calculaCombinatoria(Scanner sc) {
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
    }

    static long fatorial(int num) {
        long fat = 1;
        for (int i = 2; i <= num; i++) {
            fat *= i;
        }
        return fat;
    }
}
