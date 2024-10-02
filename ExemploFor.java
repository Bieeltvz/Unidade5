package Unidade5;

public class ExemploFor {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){ //i++ adiciona um ate o valor/ i+=2 = adiciona de 2 em 2
            System.out.println(i);
        }
        for (int a = 10; a >=1; a--){
            System.out.println(a);
        }
        int totalPares = 0;
        for (int e = 1; e <= 100; e++){
           // totalPares += e % 2 == 0 ? 1 : 0; no ternario
            if (e % 2 == 0){
               totalPares++; // quantidade de pares q tem de 1 a 100
            }
        }
        System.out.println(totalPares);
    }
}
