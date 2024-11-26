package Unidade5;

import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Valor maximo de pedagio: ");
        double valorMaximoPedagio = teclado.nextDouble();
        int trechosAcimaDoLimite = 0;
        int totalTrechos = 0;
        int techosLongosComValorAceito = 0;
        while (true) {
            System.out.println("Pedagio (digite -1 para encerrar): ");
            double pedagio = teclado.nextDouble();
            if (pedagio < 0) {
                break;
            }
            System.out.println("Distancia: ");
            int distancia = teclado.nextInt();
            if (pedagio > valorMaximoPedagio) {
                trechosAcimaDoLimite++;
            }  
            totalTrechos++;
            if (distancia > 150 && pedagio <= valorMaximoPedagio) {
                techosLongosComValorAceito++;
            }          
        }
        System.out.println(trechosAcimaDoLimite + " (trechos com valor acima do qual ele nega-se a pagar)");
        System.out.println(totalTrechos + " (quantidade de trechos informados)");
        System.out.println(techosLongosComValorAceito + " (trechos acima de 150km com valor aceito por ele)");
        teclado.close();
    }
}
