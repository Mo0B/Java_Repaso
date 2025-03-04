package org.example;

import java.util.Scanner;

public class CodigoClasesMian {
    public static void main(String[] args) {

        int suma;

        Poo_a Operaciones = new Poo_a();
        Poo_a operaciones_2 = new Poo_a(56,45);
        Operaciones.setN1(2);
        Operaciones.setN2(5);
        Operaciones.Saludar();
        suma = Operaciones.Suma();
        System.out.println(suma);
        System.out.println("n1: "+Operaciones.getN1()+"   n2: "+Operaciones.getN2()+
                "\n Raiz: "+Operaciones.Raiz(16));
        System.out.println(operaciones_2.Suma());

    }
}
