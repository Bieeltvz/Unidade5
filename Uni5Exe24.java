package Unidade5;

import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe o limite diario em Kg:");
        double pesoLimiteDiarioKg = teclado.nextDouble();
        double pesoLimiteDiatioG = pesoLimiteDiarioKg * 1000;
        double pesoTotal = 0;
        while (true) {
            System.out.println("informe o peso do peixe em gramas: ");
            double pesoPeixe = teclado.nextDouble();
            pesoTotal += pesoPeixe;
            if (pesoTotal > pesoLimiteDiatioG) {
                System.out.println("peso excedido!! Peso total da pesca: " + pesoTotal + " gramas");
                break;
            } 
            System.out.println("Peso total da pesca até agora: " + pesoTotal + " gramas");
            System.out.println("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)? ");
            String resposta = teclado.next();
            if (resposta.equalsIgnoreCase("n")) {
                System.out.println("Peso total da pesca: " + pesoTotal + " gramas");
                break;
            }
        }
        teclado.close();
    }
}
