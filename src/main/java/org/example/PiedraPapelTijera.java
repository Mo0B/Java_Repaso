package org.example;
import java.util.Scanner;
public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner _keyinput = new Scanner(System.in);

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
