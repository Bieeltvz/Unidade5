package Unidade5;

import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite um numero inteiro: ");
        int n = teclado.nextInt();
        int menorValorNegativo = 0;
        int soma = 0;
        int contadorPositivo = 0;
        boolean encontrouNegativo = false;           
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.printf("digite um valor inteiro:");
                int valor = teclado.nextInt();
                if (valor < 0) {
                    if (!encontrouNegativo || valor < menorValorNegativo) {

                        menorValorNegativo = valor;
                        encontrouNegativo = true;
                        
                    }
                } else  if (valor > 0) {
                    soma += valor;
                    contadorPositivo ++;
                    
                } 
               
            }
            if (encontrouNegativo) {
                System.out.println("O menor valor negativo: " + menorValorNegativo);
            } else {
                System.out.println("Nenhum valor negativo encontrado!!!");
            }
            if (contadorPositivo > 0) {
                double media = soma / contadorPositivo;
                System.out.println("A media dos numeros positivos: " + media);
            } else {
                System.out.println("Nenhum numero positivo encontrado");
            }
        } else {
            System.out.println("o numero precisa ser maior que 0!!!");
        }
        teclado.close();
    }
}