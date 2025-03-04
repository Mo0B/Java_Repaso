package org.example;

import java.security.KeyStore;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int _op = 0, _op2 = 0, _op_aceptar = 0, _op3 = 0;
        Scanner _teclado = new Scanner(System.in);

        List<Cuenta_Bancaria> _1Lista = new ArrayList<>();

        Cuenta_Bancaria cuenta_1 = new Cuenta_Bancaria(1010, 0, "Brayan");
        Cuenta_Bancaria cuenta_2 = new Cuenta_Bancaria(6754, 300000, "Jhon");
        Cuenta_Bancaria cuenta_3 = new Cuenta_Bancaria();

        cuenta_3.set_Titular("David");
        cuenta_3.set_NumCuenta(2334);
        cuenta_3.set_Saldo(10000);

        _1Lista.add(cuenta_1);
        _1Lista.add(cuenta_2);
        _1Lista.add(cuenta_3);

        for (Cuenta_Bancaria _miLista : _1Lista) {
            System.out.println(_miLista.get_Titular());
        }

        do {
            System.out.println("Cuentas Bancaria Registradas");
            for (int i = 0; i < _1Lista.size(); i++) {
                System.out.println(i+": "+_1Lista.get(i).get_Titular());
            }
            _op = _teclado.nextInt();
             int _posicion = _op;
            do {
                System.out.println("Esta en la cuenta : " + _1Lista.get(_posicion).get_Titular());
                System.out.println("\n1. Ingresar Dinero" +
                        "\n2. Retirar Dinero" +
                        "\n3. Mostar Informacion" +
                        "\n0 Salir");
                _op2 = _teclado.nextInt();
                switch (_op2) {
                    case 1 -> {
                        int _Dinero;
                        System.out.println("Cuando dinero desea ingresar: ");
                        _Dinero = _teclado.nextInt();
                        _1Lista.get(_posicion).Depositar_Dinero(_Dinero);
                        System.out.println("Digite cuanquier numero para Salir: ");
                        _op_aceptar = _teclado.nextInt();
                    }
                    case 2 -> {
                        boolean _validacionDinero = false;
                        int _Dinero;
                        System.out.println("Cuando dinero desea Retirar: ");
                        _Dinero = _teclado.nextInt();
                        _1Lista.get(_posicion).Retirar_Dinero(_Dinero);
                        _validacionDinero = _1Lista.get(_posicion).Validacion();
                        while (!_validacionDinero) {
                            System.out.println("'1' Si desea ingresar otro valor" +
                                    "\n'2' Si desea Salir ");
                            _op_aceptar = _teclado.nextInt();
                            if (_op_aceptar == 1) {
                                System.out.println("Cuando dinero desea Retirar: ");
                                _Dinero = _teclado.nextInt();
                                _1Lista.get(_posicion).Retirar_Dinero(_Dinero);
                                _validacionDinero = cuenta_1.Validacion();
                            } else {
                                _validacionDinero = true;
                            }
                        }

                    }
                    case 3 -> {
                        System.out.println(_1Lista.get(_posicion).Mostrar_Informacion());
                        System.out.println("Digite cuanquier numero para Salir: ");
                        _op_aceptar = _teclado.nextInt();
                    }
                    default -> System.out.println("Saliendo ...");
                }
            } while (_op2 != 0);


        }while (_op != 0);


    }
}