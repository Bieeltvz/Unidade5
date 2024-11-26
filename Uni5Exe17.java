package Unidade5;

import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int inscricaoAlta = 0;
        float alturaAlto = 0;
        int inscricaoBaixa = 0;
        float alturaBaixo = 0;
        float alturaMedia = 0;
        float somaAltura = 0;
        float qtdDePessoas = 0;
        
        while (true) {
            System.out.printf("informe o numero de inscriçao: ");
            int inscricao = teclado.nextInt();
            if (inscricao == 0) {
                break;
            }
            System.out.println("informe a altura");
            float altura = teclado.nextFloat();
            somaAltura += altura;
            qtdDePessoas++;
            
            if (altura == 0) {
                break;
            }else if (altura > alturaAlto) {
                inscricaoAlta = inscricao;
                alturaAlto = altura;
            } else {
                inscricaoBaixa = inscricao;
                alturaBaixo = altura;
            }
        }
        alturaMedia = qtdDePessoas > 0 ? somaAltura / qtdDePessoas : 0;
        System.out.println("Atleta mais alto:");
        System.out.println("Inscriçao: " + inscricaoAlta);
        System.out.println("Altura: " + alturaAlto);

        System.out.println("Atleta mais baixo:");
        System.out.println("Inscriçao: " + inscricaoBaixa);
        System.out.println("Altura: " + alturaBaixo);

        System.out.println("Altura media do grupo: " + alturaMedia);
        teclado.close();
    }
}
