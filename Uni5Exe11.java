package Unidade5;
import java.util.Scanner;

public class Uni5Exe11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos dias a maquina ficou com problema?");
        int dias = teclado.nextInt();
        int totalDeBiscoitosQuebrados = 0;
        for (int i = 1; i <= dias; i++) {
            int qtdDeBiscoitosQuebrados = 1;
            int qtdDeBiscoitosQuebradosNaHora = 0;
            for (int horas = 1; horas <= 16; horas++) {
                qtdDeBiscoitosQuebrados += qtdDeBiscoitosQuebradosNaHora;
                System.out.println("A quantidade de biscoitos quebrados na hora " + horas + ":" + qtdDeBiscoitosQuebrados);
                qtdDeBiscoitosQuebrados *= 3;
            }
            totalDeBiscoitosQuebrados += qtdDeBiscoitosQuebrados;
            System.out.println("a quantidade de biscoitos quebrados no final do dia "+ i + ": " + qtdDeBiscoitosQuebrados);
        }
        System.out.println("O total de biscoitos quebrados em " + dias + " dias é : " + totalDeBiscoitosQuebrados);
        teclado.close();
    }
}
