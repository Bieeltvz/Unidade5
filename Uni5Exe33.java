package Unidade5;

import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosCandidato4 = 0;
        int votosNulos = 0;
        int votosBrancos = 0;
        int totalVotos = 0;
        int voto;
        do {
            System.out.println("\nDigite o número do voto:");
            System.out.println("1: Candidato 1");
            System.out.println("2: Candidato 2");
            System.out.println("3: Candidato 3");
            System.out.println("4: Candidato 4");
            System.out.println("5: Voto Nulo");
            System.out.println("6: Voto em Branco");
            System.out.println("0: Encerrar votação");
            voto = teclado.nextInt();
            if (voto == 0) {
                break;
            } else if (voto == 1) {
                votosCandidato1++;
                totalVotos++;
            } else if (voto == 2) {
                votosCandidato2++;
                totalVotos++;
            } else if (voto == 3) {
                votosCandidato3++;
                totalVotos++;
            } else if (voto == 4) {
                votosCandidato4++;
                totalVotos++;
            } else if (voto == 5) {
                votosNulos++;
                totalVotos++;
            } else if (voto == 6) {
                votosBrancos++;
                totalVotos++;
            } else {
                System.out.println("Opçao incorreta. Tente novamente");
            }
        } while (voto != 0);
        System.out.println("\nResultado da votação:");
        System.out.println("Candidato 1: " + votosCandidato1 + " votos");
        System.out.println("Candidato 2: " + votosCandidato2 + " votos");
        System.out.println("Candidato 3: " + votosCandidato3 + " votos");
        System.out.println("Candidato 4: " + votosCandidato4 + " votos");
        System.out.println("Votos Nulos: " + votosNulos);
        System.out.println("Votos em Branco: " + votosBrancos);
        if (totalVotos > 0) {
            double percentualNulos = (votosNulos * 100.0) / totalVotos;
            double percentualBrancos = (votosBrancos * 100.0) / totalVotos;
            System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
            System.out.println("Percentual de votos em branco: " + percentualBrancos + "%");
        } else {
            System.out.println("Nenhum voto registrado.");
        }
        teclado.close();
    }
}
