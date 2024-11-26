package Unidade5;

import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numContasEncerradas = 0;
        double totalPago;
        String nome;
        int numDiarias;
        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Encerrar a conta de um hóspede");
            System.out.println("2. Verificar número de contas encerradas");
            System.out.println("3. Sair");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    teclado.next();
                    System.out.println("Digite o nome do hospede: ");
                    nome = teclado.next();
                    System.out.println("Digite o numero de diarias: ");
                    numDiarias = teclado.nextInt();
                    double taxaServico;
                    if (numDiarias < 15) {
                        taxaServico = 7.50;
                    } else if (numDiarias == 15) {
                        taxaServico = 6.50;
                    } else {
                        taxaServico = 5.00;
                    }
                    totalPago = (50.00 * numDiarias) + (taxaServico * numDiarias);
                    System.out.println("\nHospede: " + nome);
                    System.out.println("Total a ser pago: R$ " + totalPago);
                    numContasEncerradas++;
                    break;
            
                case 2:
                    System.out.println("\nNumeros de contas encerradas: " + numContasEncerradas);
                    break;
            
                case 3:
                    System.out.println("\nSaindo...");
                    break;
            
                default:
                System.out.println("\nOpçao invalida. Tente novamente.");
                    break;
            }
        } while (opcao != 3);
        teclado.close();
    }
}
