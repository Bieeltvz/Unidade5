package Unidade5;

import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int maiorDia = 0;
        int maiorProducaoManha = 0;
        int maiorProducaoTarde = 0;
        int diaMaiorProducao = 0;
        String periodoMaiorProducao = "";
        while (true) {
            int dia = 0;
            while (dia < 1 || dia > 30) {
                System.out.print("Digite o dia do mes (1 a 30): ");
                dia = teclado.nextInt();
                if (dia < 1 || dia > 30) {
                    System.out.println("Dia invalido");
                }
            }
            System.out.print("Total de peças produzidas no turno da manha: ");
            int manha = teclado.nextInt();
            System.out.print("Total de peças produzidas no tutno da tarde: ");
            int tarde = teclado.nextInt();
            double valorRecebido = 0;
            if (dia <= 15) {
                if (manha + tarde > 100 && manha >= 30 && tarde >= 30) {
                    valorRecebido = (manha + tarde) * 0.80;
                } else {
                    valorRecebido = (manha + tarde) * 0.50;
                }
            } else {
                valorRecebido = manha * 0.40 + tarde * 0.30;
            }
            System.out.printf("R$ %.2f (valor recebido)\n", valorRecebido);
            int producaoTotal = manha + tarde;
            if (producaoTotal > maiorProducaoManha + maiorProducaoTarde) {
                maiorProducaoManha = manha;
                maiorProducaoTarde = tarde;
                diaMaiorProducao = dia;
            }
            if (manha > tarde) {
                if (manha > maiorProducaoManha) {
                    maiorProducaoManha = manha;
                    periodoMaiorProducao = "Manha";
                }
            } else {
                if (tarde > maiorProducaoTarde) {
                    maiorProducaoTarde = tarde;
                    periodoMaiorProducao = "Tarde";
                }
            }
            System.out.print("Novo funcionario (1.sim 2.nao)? ");
            int resposta = teclado.nextInt();
            if (resposta == 2 ) {
                break;
            }
            System.out.println("Dia com maior produçao: " + diaMaiorProducao);
            System.out.println("Periodo de maior produçao: " + periodoMaiorProducao);
            if (periodoMaiorProducao.equals("Manha")) {
                System.out.println("Quantidade produzida na manha: " + maiorProducaoManha);
            } else {
                System.out.println("Quantidade produzida na tarde: " + maiorProducaoTarde);
            }
            teclado.close();
        }
    }
}
