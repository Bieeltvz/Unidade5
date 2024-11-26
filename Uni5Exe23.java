package Unidade5;

import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Informe o nome do vendedor: ");
        String nome = teclado.next();
        double totalDeVendas = 0.0;
        while (true) {
            System.out.printf("informe o preço do produto: ");
            double preço = teclado.nextDouble();
            System.out.printf("quantidade vendida desse produto: ");
            int qtdProduto = teclado.nextInt();
            totalDeVendas = preço * qtdProduto;
            double comissao = totalDeVendas * 0.30;
            System.out.println("Relatorio do vendedor:");
            System.out.printf("\tNome do vendedor: %s %n", nome);
            System.out.printf("\tTotal de vendas do %s durante o mes: R$ %.2f%n", nome, totalDeVendas);
            System.out.printf("\tSalario do vendedor %s : R$ %.2f%n", nome, comissao);
            System.out.println("Deseja digitar os dados de mais um vendedor? ");
            String opcao = teclado.next();

            if (opcao.equalsIgnoreCase("nao")) {
                break;
            }
            System.out.printf("informe o nome do vendedor: ");
            nome = teclado.next();
        }
        teclado.close();
    }  
}
