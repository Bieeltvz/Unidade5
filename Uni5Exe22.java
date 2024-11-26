package Unidade5;

public class Uni5Exe22 {
    public static void main(String[] args) {
        int anoContratacao = 1995;
        double salario = 2000.0;
        double aumentoPercentual = 1.5 / 100;
        int anoAtual = 2024;
        int ano = anoContratacao + 1;

        while (ano <= anoAtual) {
            salario += salario * aumentoPercentual;
            aumentoPercentual *= 2;
            ano++;
        }
        System.out.printf("O salario do funcionario em %d é: R$ %.2f%n", anoAtual, salario);
    }
}
