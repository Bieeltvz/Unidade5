package Unidade5;

import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valorCedula20 = 20;
        int valorCedula10 = 10;
        int valorCedula5 = 5;
        int valorCedula2 = 2;
        int valorCedula1 = 1;

        while (true) {
            System.out.println("Informe o valor que deseja sacar: ");
        int valor = teclado.nextInt();

        if (valor <= 0) {
            System.out.println("Valor invalido. O valor deve ser maior que zero.");
        } else {
            System.out.println("Cedulas fornecidas para o valor " + valor + ":");
            int qtdCedulas20 = valor / valorCedula20;
            if (qtdCedulas20 > 0) {
                System.out.println("20 : " + qtdCedulas20 + " cedulas");
                valor = valor % valorCedula20;
            }
            int qtdCedulas10 = valor / valorCedula10;
            if (qtdCedulas10 > 0) {
                System.out.println("10 : " + qtdCedulas10 + " cedulas");
                valor = valor % valorCedula10;
            }
            int qtdCedulas5 = valor / valorCedula5;
            if (qtdCedulas5 > 0) {
                System.out.println("5 : " + qtdCedulas5 + " cedulas");
                valor = valor % valorCedula5;
            }
            int qtdCedulas2 = valor / valorCedula2;
            if (qtdCedulas2 > 0) {
                System.out.println("2 : " + qtdCedulas2 + " cedulas");
                valor = valor % valorCedula2;
            }
            int qtdCedulas1 = valor / valorCedula1;
            if (qtdCedulas1 > 0) {
                System.out.println("1 : " + qtdCedulas1 + " cedulas");
                valor = valor % valorCedula1;
            }
            System.out.println("deseja sacar mais um valor? (1 - SIM e 2 - NAO): ");
            int resposta = teclado.nextInt();
            if (resposta == 1) {
                continue;
            } else if (resposta == 2) {
                break;
            }
        }
        }
        
    }
}
