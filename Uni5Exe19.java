package Unidade5;


import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double totalDeVendas = 0;
        double desconto = 0;
        while (true) {
            System.out.printf("informe o valor da compra: ");
            double valorDaCompra = teclado.nextDouble();
            if (valorDaCompra == 0) {
                break;
            } else if (valorDaCompra > 500.0) {
                double percentual = valorDaCompra * 0.2;
                desconto = valorDaCompra - percentual;
            } else if (valorDaCompra <= 500.0) {
                double percentual = valorDaCompra * 0.15;
                desconto = valorDaCompra - percentual;
            }
            System.out.printf("total a pagar: R$ %.2f%n" ,desconto);
            totalDeVendas += desconto;
           

        }
        
        System.out.printf("valor total recebido pela loja ao final do dia: R$ %.2f%n", totalDeVendas);
        teclado.close();
    }
}
