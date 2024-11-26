package Unidade5;

public class Uni5Exe10 {
    public static void main(String[] args) {
        int contador = 0;
        for (int i = 1; contador < 10; i++) {
            int digitos = String.valueOf(i).length();
            int divisor = (int) Math.pow(10, digitos / 2);
            int parte1 = i / divisor;
            int parte2 = i % divisor;
            if (Math.pow(parte1 + parte2, 2) == i) {
                System.out.println(i);
                contador++;
            }
        }
    }
}
