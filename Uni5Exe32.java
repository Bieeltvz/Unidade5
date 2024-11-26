package Unidade5;

import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o dia da semana em que o primeiro dia do mês cai (1=Domingo, 2=Segunda, ..., 7=Sábado): ");
        int primeiroDiaSemana = teclado.nextInt();
        System.out.print("Digite o numero de dias no mes: ");
        int numeroDias = teclado.nextInt();
        System.out.println("D\tS\tT\tQ\tQ\tS\tS");
        int diaSemana = primeiroDiaSemana;
        for (int i = 1; i < diaSemana; i++) {
            System.out.print("\t");
        }
        for (int dia = 1; dia <= numeroDias; dia++) {
            System.out.print(dia);
            if (diaSemana < 7) {
                System.out.print("\t");
                diaSemana++;
            } else {
                System.out.println();
                diaSemana = 1;
            }
        }
        teclado.close();
    }
}
