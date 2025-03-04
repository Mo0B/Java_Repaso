package org.example;

import java.util.Scanner;

public class CuentaMain_SinListas {
    public static void main(String[] args) {
        int _op = 0, _op2 = 0, _op_aceptar = 0, _op3=0;
        Scanner _teclado = new Scanner(System.in);
        Cuenta_Bancaria cuenta_1 = new Cuenta_Bancaria(1010, 0, "Brayan");
        Cuenta_Bancaria cuenta_2 = new Cuenta_Bancaria(6754, 300000, "Jhon");
        Cuenta_Bancaria cuenta_3 = new Cuenta_Bancaria();
        cuenta_3.set_Titular("David");
        cuenta_3.set_NumCuenta(2334);
        cuenta_3.set_Saldo(10000);
        do{
            System.out.println("Cuenta Bancaria" +
                    "\n1. Cuenta 1: " + cuenta_1.get_Titular() +
                    "\n2. Cuenta 2: " + cuenta_2.get_Titular() +
                    "\n3. Cuenta 3: " + cuenta_3.get_Titular() +
                    "\n Diginte el numero segun la opcion a elegir o '0' para Salir");
            _op = _teclado.nextInt();
            switch (_op){
                case 1 -> {
                    do {
                        System.out.println("Estas en la cuenta 1: " + cuenta_1.get_Titular());
                        System.out.println("\n1. Ingresar Dinero" +
                                "\n2. Retirar Dinero" +
                                "\n3. Mostar Informacion" +
                                "\n0 Salir");
                        _op2 = _teclado.nextInt();
                        switch (_op2){
                            case 1 ->{
                                int _Dinero;
                                System.out.println("Cuando dinero desea ingresar: ");
                                _Dinero = _teclado.nextInt();
                                cuenta_1.Depositar_Dinero(_Dinero);
                                System.out.println("Digite cuanquier numero para Salir: ");
                                _op_aceptar = _teclado.nextInt();
                            }
                            case 2 ->{
                                boolean _validacionDinero = false;
                                int _Dinero;
                                System.out.println("Cuando dinero desea Retirar: ");
                                _Dinero = _teclado.nextInt();
                                cuenta_1.Retirar_Dinero(_Dinero);
                                _validacionDinero = cuenta_1.Validacion();
                                while (!_validacionDinero){
                                    System.out.println("'1' Si desea ingresar otro valor" +
                                            "\n'2' Si desea Salir ");
                                    _op_aceptar = _teclado.nextInt();
                                    if (_op_aceptar == 1){
                                        System.out.println("Cuando dinero desea Retirar: ");
                                        _Dinero = _teclado.nextInt();
                                        cuenta_1.Retirar_Dinero(_Dinero);
                                        _validacionDinero = cuenta_1.Validacion();
                                    }else {
                                        _validacionDinero = true;
                                    }
                                }

                            }
                            case 3 ->{
                                System.out.println(cuenta_1.Mostrar_Informacion());
                                System.out.println("Digite cuanquier numero para Salir: ");
                                _op_aceptar = _teclado.nextInt();
                            }
                            default -> System.out.println("Saliendo ...");
                        }
                    }while (_op2 !=0);

                }
                case 2 -> {
                    do {
                        System.out.println("Estas en la cuenta 1: " + cuenta_1.get_Titular());
                        System.out.println("\n1. Ingresar Dinero" +
                                "\n2. Retirar Dinero" +
                                "\n3. Mostar Informacion" +
                                "\n0 Salir");
                        _op2 = _teclado.nextInt();
                        switch (_op2){
                            case 1 ->{
                                int _Dinero;
                                System.out.println("Cuando dinero desea ingresar: ");
                                _Dinero = _teclado.nextInt();
                                cuenta_2.Depositar_Dinero(_Dinero);
                                System.out.println("Digite cuanquier numero para Salir: ");
                                _op_aceptar = _teclado.nextInt();
                            }
                            case 2 ->{
                                boolean _validacionDinero = false;
                                int _Dinero;
                                System.out.println("Cuando dinero desea Retirar: ");
                                _Dinero = _teclado.nextInt();
                                cuenta_2.Retirar_Dinero(_Dinero);
                                _validacionDinero = cuenta_2.Validacion();
                                while (!_validacionDinero){
                                    System.out.println("'1' Si desea ingresar otro valor" +
                                            "\n'2' Si desea Salir ");
                                    _op_aceptar = _teclado.nextInt();
                                    if (_op_aceptar == 1){
                                        System.out.println("Cuando dinero desea Retirar: ");
                                        _Dinero = _teclado.nextInt();
                                        cuenta_2.Retirar_Dinero(_Dinero);
                                        _validacionDinero = cuenta_2.Validacion();
                                    }else {
                                        _validacionDinero = true;
                                    }
                                }

                            }
                            case 3 ->{
                                System.out.println(cuenta_2.Mostrar_Informacion());
                                System.out.println("Digite cuanquier numero para Salir: ");
                                _op_aceptar = _teclado.nextInt();
                            }
                            default -> System.out.println("Saliendo ...");
                        }
                    }while (_op2 !=0);
                }
                case 3 -> {
                    do {
                        System.out.println("Estas en la cuenta 3: " + cuenta_3.get_Titular());
                        System.out.println("\n1. Ingresar Dinero" +
                                "\n2. Retirar Dinero" +
                                "\n3. Mostar Informacion" +
                                "\n0 Salir");
                        _op2 = _teclado.nextInt();
                        switch (_op2){
                            case 1 ->{
                                int _Dinero;
                                System.out.println("Cuando dinero desea ingresar: ");
                                _Dinero = _teclado.nextInt();
                                cuenta_3.Depositar_Dinero(_Dinero);
                                System.out.println("Digite cuanquier numero para Salir: ");
                                _op_aceptar = _teclado.nextInt();
                            }
                            case 2 ->{
                                boolean _validacionDinero = false;
                                int _Dinero;
                                System.out.println("Cuando dinero desea Retirar: ");
                                _Dinero = _teclado.nextInt();
                                cuenta_3.Retirar_Dinero(_Dinero);
                                _validacionDinero = cuenta_3.Validacion();
                                while (!_validacionDinero){
                                    System.out.println("'1' Si desea ingresar otro valor" +
                                            "\n'2' Si desea Salir ");
                                    _op_aceptar = _teclado.nextInt();
                                    if (_op_aceptar == 1){
                                        System.out.println("Cuando dinero desea Retirar: ");
                                        _Dinero = _teclado.nextInt();
                                        cuenta_3.Retirar_Dinero(_Dinero);
                                        _validacionDinero = cuenta_3.Validacion();
                                    }else {
                                        _validacionDinero = true;
                                    }
                                }

                            }
                            case 3 ->{
                                System.out.println(cuenta_3.Mostrar_Informacion());
                                System.out.println("Digite cuanquier numero para Salir: ");
                                _op_aceptar = _teclado.nextInt();
                            }
                            default -> System.out.println("Saliendo ...");
                        }
                    }while (_op2 !=0);
                }
                default -> System.out.println("Saliendo ...");
            }
        }while (_op != 0);
    }
}
