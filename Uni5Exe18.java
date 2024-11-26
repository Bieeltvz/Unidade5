package Unidade5;

import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int totalCasas = 0;
        int totalPessoas = 0;
        int pessoasCanal4 = 0;
        int pessoasCanal5 = 0;
        int pessoasCanal9 = 0;
        int pessoasCanal12 = 0;
        while (true) {
            System.out.printf("informe o numero do canal (4, 5, 9, 12 ou 0 para terminar): ");
            int canal = teclado.nextInt();
            if (canal == 0) {
                break;
            }
            System.out.println("Informe o numero de pessoas assistindo: ");
            int pessoas = teclado.nextInt();
            switch (canal) {
                case 4:
                    pessoasCanal4 += pessoas;
                    break;
                case 5:
                    pessoasCanal5 += pessoas;
                    break;
                case 9:
                    pessoasCanal9 += pessoas;
                    break;
                case 12:
                    pessoasCanal12 += pessoas;
                    break;
                default:
                    System.out.println("Canal inválido.");
                    continue;
            }

            totalCasas++;
            totalPessoas += pessoas;
        }
        if (totalPessoas > 0) {
            double percentualCanal4 = (pessoasCanal4 * 100.0) / totalPessoas;
            double percentualCanal5 = (pessoasCanal5 * 100.0) / totalPessoas;
            double percentualCanal9 = (pessoasCanal9 * 100.0) / totalPessoas;
            double percentualCanal12 = (pessoasCanal12 * 100.0) / totalPessoas;
            System.out.println("Percentural de audiencia:");
            System.out.printf("Canal 4: %.2f%%\n", percentualCanal4);
            System.out.printf("Canal 5: %.2f%%\n", percentualCanal5);
            System.out.printf("Canal 9: %.2f%%\n", percentualCanal9);
            System.out.printf("Canal 12: %.2f%%\n", percentualCanal12);
        } else {
            System.out.println("Nenhume pessoas estava assistindo TV.");
        }
        teclado.close();
    }
}
