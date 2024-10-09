package Unidade5;

import java.util.Scanner;

public class ExercicioProfessor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a massa em gramas do objeto radioativo?");
        double objetoRadioativo = teclado.nextDouble();
        int tempSegundos = 0;
        while (objetoRadioativo >= 0.25) {
            objetoRadioativo /= 2;
            tempSegundos += 50;
        }
        int horas = tempSegundos / 3600;
        int minutos = (tempSegundos % 3600) / 60;
        int segundos = tempSegundos % 60;

        System.out.println(
                "O tempo para a massa ficar menor que 0,25g é de: " + horas + " Horas, " + minutos + " Minutos e "
                +segundos + " Segundos.");

        teclado.close();

    }
}
