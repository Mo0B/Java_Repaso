package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner _teclado = new Scanner(System.in);
        int op = 0, m_100 = 0, m_500 = 0, m_20=0, m_50=0,m_200=0;
        int _save = 0;
        // MENU

        while (op != 5 ) {
            boolean unico = false;

            System.out.println("Menu \n Digite Opcion" +
                    "\n 1: Agregar" +
                    "\n 2: Contar de cada denominacion" +
                    "\n 3: Total ahorrado" +
                    "\n 4: Romper alcancia y ver contenido" +
                    "\n 5: Salir");
            op = _teclado.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Op Agregar");
                    System.out.println("que moneda desea agregar 20, 50, 100, 200 o de 500");
                    _save = _teclado.nextInt();
                    if ((_save == 20)&&(!unico)) {m_20++; unico = true;}
                    if ((_save == 50)&&(!unico)) {m_50++; unico = true;}
                    if ((_save == 100)&&(!unico)) {m_100++; unico = true;}
                    if ((_save == 200)&&(!unico)) {m_200++; unico = true;}
                    if ((_save == 500)&&(!unico)) {m_500++; unico = true;}
                    break;
                case 2:
                    System.out.println("Op Contar");
                    System.out.println("20: " + m_20);
                    System.out.println("50: " + m_50);
                    System.out.println("100: " + m_100);
                    System.out.println("200: " + m_200);
                    System.out.println("500: " + m_500);
                    break;
                case 3:
                    System.out.println("Op Total");
                    int _m100 = m_100*100;
                    int _m20 = m_20*20;
                    int _m50 = m_50*50;
                    int _m200 = m_200*200;
                    int _m500 = m_500*500;
                    int _total = _m100 + _m500 + _m50 + _m20 + _m200 ;
                    System.out.println(_total);
                    break;
                case 4:
                    System.out.println("Op Romper");
                    m_20 = 0;
                    m_50 = 0;
                    m_100 = 0;
                    m_200 = 0;
                    m_500 = 0;
                    break;
                default:
                    System.out.println("Ha Salido");
            }
        }
    }
}