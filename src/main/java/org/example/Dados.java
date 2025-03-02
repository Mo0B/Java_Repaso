package org.example;
import java.util.Scanner;
public class Dados {
    public static void main(String[] args) {
        Scanner _keyinput = new Scanner(System.in);
        int a, b, dado_1, dado_2, total_dado_1 =0, total_dado_2=0;
        int n = 4;
        for (int i=1; i<n; i++){
            System.out.println("------ Lanzamiento "+i+" ------");
            a = (int) (Math.random() * 6);
            dado_1 = a + 1;
            System.out.println("primer dado:"+dado_1);
            total_dado_1 = total_dado_1 + dado_1;

            b = (int) (Math.random() * 6);
            dado_2 = b + 1;
            System.out.println("segundo dado:"+dado_2);
            total_dado_2 = total_dado_2 + dado_2;
        }
        System.out.println(" suma primer dado:"+(total_dado_1));
        System.out.println(" suma segundo dado:"+(total_dado_2));
        if (total_dado_1>total_dado_2){
            System.out.println("la total de la suma del primer dado es mayor a la del segundo" +
                    "\n con una diferencia de: "+(total_dado_1-total_dado_2));
        } else if (total_dado_1 == total_dado_2){
            System.out.println("Ambos totales son iguales");
        } else {
            System.out.println("El total de al suma del segundo dado es mayor a la del primero" +
                    "\n con una diferencia de: "+(total_dado_2-total_dado_1));
        }
    }
}
