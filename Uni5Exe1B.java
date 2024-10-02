package Unidade5;

import java.util.Scanner;

public class Uni5Exe1B {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String resultado = "";
        for (int i = 0; i <= 20; i++) {
            System.out.println("informe o numero");
            int n = teclado.nextInt();
            System.out.printf("o numero %d é %s%n",n,n % 2 == 0?"par":"impar");
            //if (n % 2 == 0) {
            //    resultado = "Numero é par";
            //} else {
            //    resultado = "Numero é impar";
            //}
            System.out.println(resultado);
        }
        teclado.close();
 
        }
    }

