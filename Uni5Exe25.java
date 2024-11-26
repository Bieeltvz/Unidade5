package Unidade5;

import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ptsJogadorEsquerdo = 0;
        int ptsJogadorDireito = 0;
        String ponto;
        while (true) {
            System.out.print("Digite o ponto (D para direito, E para esquerdo): ");
            ponto = teclado.next();
            if (ponto.equalsIgnoreCase("d")) {
                ptsJogadorDireito++;
            } else if (ponto.equalsIgnoreCase("e")) {
                ptsJogadorEsquerdo++;
            } else {
                System.out.println("Ponto invalido! Digite 'D' ou 'E'.");
                continue;
            }
            if (ptsJogadorEsquerdo >= 21 || ptsJogadorEsquerdo >= 21) {
                int diferenca = Math.abs(ptsJogadorEsquerdo - ptsJogadorDireito);

                if (diferenca >= 2) {
                    if (ptsJogadorEsquerdo > ptsJogadorDireito) {
                        System.out.println("Vencedor: Jogador da Esquerda!");
                    } else {
                        System.out.println("Vencedor : Jogador da Direita!");
                    }
                    break;
                }

            }
            System.out.printf("Placar atual: Esquerdo %d - %d Direito %n", ptsJogadorEsquerdo, ptsJogadorDireito);
        }
        teclado.close();
        
    }
}
