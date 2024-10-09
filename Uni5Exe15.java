package Unidade5;
import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o nome do aluno?");
        String nome = teclado.next();
        float nota1 = 0.0f;
        float nota2 = 0.0f;
        while (!nome.equalsIgnoreCase("fim")) {
            System.out.print("Qual a nota 1 do aluno?");
            nota1 = teclado.nextFloat();
            System.out.print("Qual a nota 2 do aluno?");
            nota2 = teclado.nextFloat();
            System.out.print("A media do aluno " + nome + " É de " + (nota1 + nota2) / 2);
            System.out.print("Qual o nome do aluno(a)?");
            nome = teclado.next();
        } 
    teclado.close();
    }
}
