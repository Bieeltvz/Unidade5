package Unidade5;
import java.util.Scanner;
/* 
elabore um programa que leia o sexo e a altura de um conjunto de pessoas, sexo valido: m/M/f/F, altura valida: 0,50 <= 2.45
qualquer outro valor deve retornar uma mensagem de erro
escreva: 
total de homens
total de mulheres
maior altura dos homens
a menor altura das mulheres
(considere que a maior altura tambem pode ser a menor e vice versa)
a media da altura dos homens com mais de 45 anos
a menor altura das mulheres com menos de 18 anos
a media de altura das mulheres entre 25 e 35 anos
a idade do homem mais baixo
*/
public class ExercicioExtra02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantas pessoas são?");
        int qtdPessoas = teclado.nextInt();
        System.out.println("Qual o sexo?");
        char sexo = Character.toUpperCase(teclado.next().charAt(0));
        String genero = "";
        System.out.println("Qual a altura?");
        double altura = teclado.nextDouble();

        
        for (int i = 0; i < qtdPessoas; i++){
            switch (sexo) {
                case 'M':
                  genero = "Masculino";
                    break;
                case 'F':
                    genero = "Feminino";
                     break;
                default:
                    System.out.println("Sexo invalido, coloque novamente");
                    
                    break;
            }

            if (altura >= 0.50 || altura <= 2.45){
       } else {
        System.out.println("Altura invalida.");
        break;
       }
       System.out.println("Qual o sexo?");
       sexo = Character.toUpperCase(teclado.next().charAt(0));
       System.out.println("Qual a altura?");
       altura = teclado.nextDouble();

    }
    }
}
