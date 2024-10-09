package Unidade5;

import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double soma = 0;
        for (int i = 1; i<= 20; i++){
            System.out.println("Entre com a altura: ");
            double altura = teclado.nextDouble();
            soma += altura;
        }
        System.out.printf("A soma total é: %.2f%n",soma / 20);
        teclado.close();
    }
}