package Unidade5;

import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe o valor do odometro antes da viagem: ");
        double odometro = teclado.nextDouble();
        System.out.println("numero total de reabastecimento: ");
        int reabastecimento = teclado.nextInt();
        double odometroAnterior = odometro;
        double somakmPorLitro = 0.0;
        for (int i = 1; i <= reabastecimento; i++) {
            System.out.println("digite o valor do odometro apos o reabastecimento: ");
            double valorOdometroPosRbt = teclado.nextDouble();
            System.out.println("digite a quatidade comprada nesse reabastecimento: ");
            double qtdCombustivel = teclado.nextDouble();
            double distancia = valorOdometroPosRbt - odometroAnterior;
            double kmPoLitro = distancia / qtdCombustivel;
            somakmPorLitro += kmPoLitro;
            System.out.printf("Quilometragem obtida por litro no reabastecimento %d: %.2f km/L%n",i,kmPoLitro);
            odometroAnterior = valorOdometroPosRbt;
        }
        double mediaKm = somakmPorLitro / reabastecimento;
        System.out.printf("Quilometragem media em toda a viagem: %.2f km/L%n", mediaKm);
        teclado.close();
    }
}
