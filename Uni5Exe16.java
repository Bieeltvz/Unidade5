package Unidade5;

import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double somaAlturaMulheres = 0;
        double somaAlturaGeral = 0;
        int quantidadeMulheres = 0;
        int quantidadePessoas = 0;

        while (true) {
            System.out.print("Digite a altura (ou 0 para finalizar): ");
            double altura = teclado.nextDouble();

            if (altura == 0) {
                break;
            }

            System.out.print("Digite o gênero (M, F ou O): ");
            char genero = teclado.next().charAt(0);

            somaAlturaGeral += altura;
            quantidadePessoas++;

            if (genero == 'F' || genero == 'f') {
                somaAlturaMulheres += altura;
                quantidadeMulheres++;
            }
        }

        double mediaAlturaMulheres = quantidadeMulheres > 0 ? somaAlturaMulheres / quantidadeMulheres : 0;
        double mediaAlturaGeral = quantidadePessoas > 0 ? somaAlturaGeral / quantidadePessoas : 0;

        System.out.println("Média da altura das mulheres: " + mediaAlturaMulheres);
        System.out.println("Média da altura do grupo: " + mediaAlturaGeral);

        teclado.close();
    }
}
