package Unidade5;

import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int totalMercadoria = 20;

        int lucroAbaixoDe10 = 0;
        int lucroEntre10e20 = 0;
        int lucroAcimade20 = 0;
        double totalDeCompra = 0;
        double totalDeVenda = 0;
        double lucroTotal = 0;

        for (int i = 0; i < totalMercadoria; i++) {
            System.out.println("digite o nome da mercadoria " + (i + 1) + ":");
            String nome = teclado.next();
            System.out.println("digite o preço de compra da mercadoria " + (i + 1) + ":");
            double precoDaCompra = teclado.nextDouble();
            System.out.println("digite o preço de venda da mercadoria " + (i + 1) + ":");
            double precoDeVenda = teclado.nextDouble();
            double lucroPorcentual = ((precoDeVenda - precoDaCompra) / precoDaCompra) * 100;
            if (lucroPorcentual < 10){
                lucroAbaixoDe10++;
            } else if (lucroPorcentual <= 20) {
                lucroEntre10e20 ++;
            } else {
                lucroAcimade20 ++;
            }

            totalDeCompra += precoDaCompra;
            totalDeVenda += precoDeVenda;
            lucroTotal += (precoDeVenda - precoDaCompra);
        }
        System.out.println("\nResultado do levantamento:");
        System.out.println("Mercadoria com lucro abaixo de 10%: " + lucroAbaixoDe10);
        System.out.println("Mercadoria com lucro entre 10% e 20%: " + lucroEntre10e20);
        System.out.println("Mercadoria com lucro acima de 20%: " + lucroAcimade20);
        System.out.println("Valor total da compra:  R$ " + totalDeCompra);
        System.out.println("Valor total de venda:  R$ " + totalDeVenda);
        System.out.println("Lucro total: R$ " + lucroTotal);
        teclado.close();
    }
}
