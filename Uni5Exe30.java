package Unidade5;

import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de N (valor inicial): ");
        int n = teclado.nextInt();
        System.out.println("Digite o valor de K (valor inicial): ");
        int k = teclado.nextInt();
        System.out.println("Digite o valor de M (valor inicial): ");
        int m = teclado.nextInt();

        int valorAtual = n;
        int capacidadeAtual = 0;

        int somaDentro = 0;
        int somaFora = 0;

        String dentroDaMochila = "";
        String foraDaMochila = "";

        System.out.println("Elementos a serem colocados na mochila: ");
        while (valorAtual > 0) {
            System.out.println(valorAtual + " ");
            valorAtual -= k;
        }
        System.out.println();
        valorAtual = n;
        while (valorAtual > 0) {
            if (capacidadeAtual + valorAtual <= m) {
                dentroDaMochila += valorAtual + " ";
                somaDentro += valorAtual;
                capacidadeAtual += valorAtual;
            } else {
                foraDaMochila += valorAtual + " ";
                somaFora += valorAtual;
            }
            valorAtual -= k;
        }
        System.out.println("Elementos que entraram na mochila: ");
        System.out.println(dentroDaMochila);

        System.out.println("Elementos que ficaram fora da mochila: ");
        System.out.println(foraDaMochila);

        System.out.println("Soma dos elementos que entraram na mochila: " + somaDentro);
        System.out.println("Soma dos elementos que nao entraram na mochila: " + somaFora);
        teclado.close();
    }
}
