package Unidade5;

import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a massa inicial do material em kg: ");
        double massaInicial = teclado.nextDouble();

        double massaAtual = massaInicial * 1000;
        double massaFinal = 0.5;
        int tempo = 0;

        while (massaAtual >= massaFinal) {
            massaAtual /= 2;
            tempo += 50;
        }

        System.out.printf("Massa inicial: %.3f kg\n", massaInicial);
        System.out.printf("Massa final: %.3f gramas\n", massaAtual);
        System.out.printf("Tempo necessario: %d segundos\n", tempo);
        teclado.close();
    }
}
