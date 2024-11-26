package Unidade5;

import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int votosNenhumDeNos = 0;
        int votosCPM22 = 0;
        int votosSkank = 0;
        int votosJotaQuest = 0;
        int totalVotos = 0;
        char resposta;
        while (true) {
            System.out.println("Informe o voto (1 - Nenhum de Nós, 2 - CPM22, 3 - Skank, 4 - Jota Quest): ");
            int voto = teclado.nextInt();
            totalVotos ++;
            switch (voto) {
                case 1:
                    votosNenhumDeNos++;
                    break;
                case 2:
                    votosCPM22++;
                    break;
                case 3:
                    votosSkank++;
                    break;
                case 4:
                    votosJotaQuest++;
                    break;
            
                default:
                    System.out.println("Voto invalido! Por favor, escolha entre 1 e 4.");
                    totalVotos--;
                    break;
            }
            System.out.println("Mais um voto: s (SIM) / n (NAO)? ");
            resposta = teclado.next().charAt(0);
            if (resposta == 'n' || resposta == 'N') {
                break;
            }
        }
        System.out.println("\nTotal de votos para cada grupo:");
        System.out.println("Nenhum de Nós: " + votosNenhumDeNos + " votos");
        System.out.println("CPM22: " + votosCPM22 + " votos");
        System.out.println("Skank: " + votosSkank + " votos");
        System.out.println("Jota Quest: " + votosJotaQuest + " votos");

        if  (totalVotos > 0) {
            System.out.println("\nPercentual de votos:");
            System.out.printf("Nenhum de Nós: %.2f%%\n", (votosNenhumDeNos * 100.0) / totalVotos);
            System.out.printf("CPM22: %.2f%%\n", (votosCPM22 * 100.0) / totalVotos);
            System.out.printf("Skank: %.2f%%\n", (votosSkank * 100.0) / totalVotos);
            System.out.printf("Jota Quest: %.2f%%\n", (votosJotaQuest * 100.0) / totalVotos);
        }

        int maxVotos = Math.max(Math.max(votosNenhumDeNos, votosCPM22), Math.max(votosSkank, votosJotaQuest));
        String vencedor = "";
        if (maxVotos == votosNenhumDeNos) {
            vencedor = "Nenhum de Nós";
        } else if (maxVotos == votosCPM22) {
            vencedor = "CPM22";
        } else if (maxVotos == votosSkank) {
            vencedor = "Skank";
        } else if (maxVotos == votosJotaQuest) {
            vencedor = "Jota Quest";
        }
        System.out.println("\nGrupo vencedor: " + vencedor);
        teclado.close();
    }
}
