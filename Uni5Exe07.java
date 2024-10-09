package Unidade5;
import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("digite um numero inteiro: ");
        int n = teclado.nextInt();
    
        if (n > 0) {
            System.out.print("digite um numero: "); 
            double numero = teclado.nextDouble();
            double maior = numero;
            double menor = numero;
            for (int i = 1; i < n; i++) {
                System.out.printf("digite um numero: ");
                numero = teclado.nextDouble();
                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }
            System.out.printf(" o maior numero = %s" , maior);
            System.out.printf(" o menor numero = %s" , menor);
        } else {
            System.out.println("o numero precisa ser maior que 0!!!");
        }
        
        teclado.close();
    }
}