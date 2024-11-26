package Unidade5;

import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero inteiro positivo: ");
        int numero = teclado.nextInt();
        if (numero <= 1) {
            System.out.println("O numero deve ser maior que 1.");
            return;
        }
        int fator = 2;
        while (numero > 1) {
            if (numero % fator == 0) {
                System.out.println(numero + "\t" + fator);
                numero = numero / fator;
            } else {
                fator++;
            }
        }
        
    }
}
