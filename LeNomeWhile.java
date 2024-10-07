package Unidade5;

import java.util.Scanner;

public class LeNomeWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com algum nome: ");
        String nome = teclado.next();
        while (!nome.equalsIgnoreCase("fim")) {
            if (nome.equalsIgnoreCase("Xico")) {
                System.out.println("Oi xico");
                break;  //brak quebra while
            }
            System.out.println("Boa noite " + nome);
            System.out.print("Entre com algum nome: ");
            nome = teclado.next();
        }
        teclado.close();
    }
}
