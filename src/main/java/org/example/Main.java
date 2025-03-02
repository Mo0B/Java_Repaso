package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner _keyinput = new Scanner(System.in);
        /*
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
         */

        int jugador_1 = 0;
        int jugador_2 = 0;
        String _1 = "", _2 = "";
        int _save_1 = 0, _save_2 = 0, _save_empate = 0;
        boolean win_1, win_2, _termino = false;
        // 1 piedra, 2 papel, 3 tijera

            do {
                win_1 = false;
                win_2 = false;
                jugador_1 = (int) (Math.random() * 3) + 1;
                jugador_2 = (int) (Math.random() * 3) + 1;

                if (jugador_1 == 1) {
                    _1 = "Piedra";
                } else if (jugador_1 == 2) {
                    _1 = "Papel";
                } else if (jugador_1 == 3) {
                    _1 = "Tijera";

        Scanner _teclado = new Scanner(System.in);
        int op = 0, m_100 = 0, m_500 = 0, m_20=0, m_50=0,m_200=0;
        int _save = 0;

        // ---------------  MENU -----------------------
        while (op != 5 ) {
            System.out.println("Menu \n Digite Opcion" +
                    "\n 1: Agregar" +
                    "\n 2: Contar de cada denominacion" +
                    "\n 3: Total ahorrado" +
                    "\n 4: Romper alcancia y ver contenido" +
                    "\n 5: Salir");
            op = _teclado.nextInt();
            // ---------------  SWITCH -----------------------
            switch (op) {
                // ---------------  AGREGAR -----------------------
                case 1 -> {
                    System.out.println("Op Agregar");
                    System.out.println("que moneda desea agregar 20, 50, 100, 200 o de 500");
                    _save = _teclado.nextInt();

                if (_save == 20) {
                    m_20++;
                } else if (_save == 50) {
                    m_50++;
                } else if (_save == 100) {
                    m_100++;
                } else if (_save == 200) {
                    m_200++;
                } else if (_save == 500) {
                    m_500++;
                } else {
                    System.out.println("La denominacion de la moneda no es valida");

                }

                if (jugador_2 == 1) {
                    _2 = "Piedra";
                } else if (jugador_2 == 2) {
                    _2 = "Papel";
                } else if (jugador_2 == 3) {
                    _2 = "Tijera";
                }

                System.out.println("jugador 1: " + _1);
                System.out.println("jugador 2: " + _2);

// 1 piedra, 2 papel, 3 tijera

                if (jugador_1 == jugador_2) {
                    System.out.println("empate");
                    _save_empate++;
                } else if (jugador_1 == 1 && jugador_2 == 2) {
                    System.out.println("Gano 2");
                    win_2 = true;
                } else if (jugador_1 == 1 && jugador_2 == 3) {
                    System.out.println("Gano 1");
                    win_1 = true;
                } else if (jugador_1 == 2 && jugador_2 == 1) {
                    System.out.println("Gano 1");
                    win_1 = true;
                } else if (jugador_1 == 2 && jugador_2 == 3) {
                    System.out.println("Gano 2");
                    win_2 = true;
                } else if (jugador_1 == 3 && jugador_2 == 1) {
                    System.out.println("Gano 2");
                    win_2 = true;
                } else if (jugador_1 == 3 && jugador_2 == 2) {
                    System.out.println("Gano 1");
                    win_1 = true;
                }

                if (win_1 && _save_2 <= 1 ) {
                    _save_1 = _save_1 + 1;

                } else if (win_2 && _save_1 <= 1 ) {
                    _save_2 = _save_2 + 1;
                }


                System.out.println(_save_empate);
                System.out.println(_save_1);
                System.out.println(_save_2);
            } while (_save_1 < 2  && _save_2 < 2);


       if (_save_1 < _save_2){
           System.out.println("jugador 2 gano la partida");
       }else{
           System.out.println("jugador 1 gano la partida");
       }

    }
}