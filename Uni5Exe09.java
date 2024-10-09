package Unidade5;
import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos alunos a turma tem?");
        int n = teclado.nextInt();
        String nomeAlunos = "";
        String alunos18 = "";
        int alunos20 = 0;
        int idade = 0;
        for(int i = 1; i <= n; i++){
            System.out.println("Qual o nome do aluno(a)?");
            nomeAlunos = teclado.next();
            System.out.println("Qual a idade do aluno?");
            idade = teclado.nextInt();
            if(idade == 18){
                alunos18 += nomeAlunos + ", ";
            } 
            if(idade > 20){
                alunos20++;
            }
            }
            System.out.println("Nome dos alunos com 18 anos " + alunos18);
            System.out.println("Quantidade de alunos acima dos 20 anos: " + alunos20);
            teclado.close();
        }
    }
    

