package org.example;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
public class Actividad {
    public static void main(String[] args) {
        //VARIABLES ATRIBUTOS
        int _opcion = -1, _op_votar = -1, _pregunta = 0, _op_aceptar;
        int _inf_internet_A = 0, _inf_radio_A = 0, _inf_television_A = 0;
        int _inf_internet_B = 0, _inf_radio_B = 0, _inf_television_B = 0;
        int _inf_internet_C = 0, _inf_radio_C = 0, _inf_television_C = 0;
        int _costo_A = 0, _costo_B = 0, _costo_C = 0;
        int _save_vA = 0, _save_vB = 0, _save_vC = 0;
        int _save_vT = 0;
        //ENTRADA
        Scanner _teclado = new Scanner(System.in);
        //MENU
        while (_opcion < 7 && _opcion != 0) {
            // -------------------------------------------
            System.out.println("Aplicacion de Votacion" +
                    "\n1. Votar" +
                    "\n2. Costo Campaña" +
                    "\n3. Borrar" +
                    "\n4. Votos totales" +
                    "\n5. Porcentajes Candidatos" +
                    "\n6. Costo promedio" +
                    "\n0. Salir");
            _opcion = _teclado.nextInt();
            // -------------------------------------------
            switch (_opcion){
                case 1 -> {
                do {
                    // VOTAR
                    System.out.println("Votar" +
                            "\n1. Candidato A" +
                            "\n2. Candidato B" +
                            "\n3. Candidato C" +
                            "\n0. Salir Menu");
                    _op_votar = _teclado.nextInt();
                    // ----------------------------
                    switch (_op_votar) {
                        case 1 -> {
                            do {
                                System.out.println("""
                                        Candidato A 
                                        ¿Por que medio conocio al candidato? :\n
                                        1. Internet
                                        2. Radio
                                        3. Television
                                        """);
                                _pregunta = _teclado.nextInt();
                                switch (_pregunta){
                                    case 1 ->{
                                        _inf_internet_A++;
                                        _save_vA++;
                                        _costo_A = _costo_A + 700000;
                                        System.out.println("Exitos \n");
                                        _op_votar = 0;
                                    }
                                    case 2 ->{
                                        _inf_radio_A++;
                                        _save_vA++;
                                        _costo_A = _costo_A + 200000;
                                        System.out.println("Exitos \n");
                                        _op_votar = 0;
                                    }
                                    case 3 ->{
                                        _inf_television_A++;
                                        _save_vA++;
                                        _costo_A = _costo_A + 600000;
                                        System.out.println("Exitos \n");
                                        _op_votar = 0;
                                    }
                                }
                            }while (_pregunta != 1 && _pregunta != 2 && _pregunta != 3);
                        }
                        case 2 -> {
                            do {
                                System.out.println("""
                                        Candidato B 
                                        ¿Por que medio conocio al candidato? :\n
                                        1. Internet
                                        2. Radio
                                        3. Television
                                        """);
                                _pregunta = _teclado.nextInt();
                                switch (_pregunta){
                                    case 1 ->{
                                        _inf_internet_B++;
                                        _save_vB++;
                                        _costo_B = _costo_B + 700000;
                                        System.out.println("Exitos \n");
                                        _op_votar = 0;
                                    }
                                    case 2 ->{
                                        _inf_radio_B++;
                                        _save_vB++;
                                        _costo_B = _costo_B + 200000;
                                        System.out.println("Exitos \n");
                                        _op_votar = 0;
                                    }
                                    case 3 ->{
                                        _inf_television_B++;
                                        _save_vB++;
                                        _costo_B = _costo_B + 600000;
                                        System.out.println("Exitos \n");
                                        _op_votar = 0;
                                    }
                                }
                            }while (_pregunta != 1 && _pregunta != 2 && _pregunta != 3);
                        }
                        case 3 -> {
                            do {
                                System.out.println("""
                                        Candidato C 
                                        ¿Por que medio conocio al candidato? :\n
                                        1. Internet
                                        2. Radio
                                        3. Television
                                        """);
                                _pregunta = _teclado.nextInt();
                                switch (_pregunta){
                                    case 1 ->{
                                        _inf_internet_C++;
                                        _save_vC++;
                                        _costo_C = _costo_C + 700000;
                                        System.out.println("Exitos \n");
                                        _op_votar = 0;
                                    }
                                    case 2 ->{
                                        _inf_radio_C++;
                                        _save_vC++;
                                        _costo_C = _costo_C + 200000;
                                        System.out.println("Exitos \n");
                                        _op_votar = 0;
                                    }
                                    case 3 ->{
                                        _inf_television_C++;
                                        _save_vC++;
                                        _costo_C = _costo_C + 600000;
                                        System.out.println("Exitos \n");
                                        _op_votar = 0;
                                    }
                                }
                            }while (_pregunta != 1 && _pregunta != 2 && _pregunta != 3);
                        }
                        default -> System.out.println("Saliendo");
                    }
                }while (_op_votar < 4 && _op_votar != 0);
                }
                case 2 -> {
                    int _op_2 = -1;
                    while (_op_2 != 0 && _op_2 < 4){
                        System.out.println("Costo campaña: \n" +
                                "1. candidato A\n" +
                                "2. candidato B\n" +
                                "3. candidado C\n" +
                                "0. Salir\n");
                        _op_2 = _teclado.nextInt();
                        switch (_op_2){
                            case 1 -> {
                                System.out.println("Candidato A\n" +
                                        "Costos \n" +
                                        "Costo total Campaña: " +_costo_A+"\n" +
                                        "Internet: " +(_inf_internet_A * 700000)+"\n" +
                                        "Television: " +(_inf_television_A * 600000)+"\n" +
                                        "Radio: " +(_inf_radio_A * 200000)+"\n" +
                                        "Digite '1' para ver otro candidato o '0' para ir al menu principal: ");
                                _op_2 = _teclado.nextInt();
                            }
                            case 2 -> {
                                System.out.println("Candidato B\n" +
                                        "Costos \n" +
                                        "Costo total Campaña: " +_costo_B+"\n" +
                                        "Internet: " +(_inf_internet_B * 700000)+"\n" +
                                        "Television: " +(_inf_television_B * 600000)+"\n" +
                                        "Radio: " +(_inf_radio_B * 200000)+"\n" +
                                        "Digite '1' para ver otro candidato o '0' para ir al menu principal: ");
                                _op_2 = _teclado.nextInt();
                            }
                            case 3 -> {
                                System.out.println("Candidato C\n" +
                                        "Costos \n" +
                                        "Costo total Campaña: " +_costo_C+"\n" +
                                        "Internet: " +(_inf_internet_C * 700000)+"\n" +
                                        "Television: " +(_inf_television_C * 600000)+"\n" +
                                        "Radio: " +(_inf_radio_C * 200000)+"\n" +
                                        "Digite '1' para ver otro candidato o '0' para ir al menu principal: ");
                                _op_2 = _teclado.nextInt();
                            }
                            default -> System.out.println("Saliendo ...");
                        }
                    }


                }
                case 3 -> {
                    System.out.println("Borrar");
                    int _borrar = 0;

                        System.out.println("¿Esta seguro de borrar los votos" +
                                "\n digite '1' para borrar, de lo contario digite 'otro numero'");
                        _borrar = _teclado.nextInt();
                        if (_borrar == 1){
                            _costo_A = _costo_B = _costo_C = 0;
                            _inf_internet_A = _inf_internet_B = _inf_internet_C = 0;
                            _inf_radio_A = _inf_radio_B = _inf_radio_C = 0;
                            _inf_television_A = _inf_television_B = _inf_television_C = 0;
                            _save_vA = _save_vC = _save_vB = 0;
                            System.out.println("Votos borrados con Exito\n");
                        }else {
                            System.out.println("Saliendo ...");
                        }
                }
                case 4 -> {
                    _save_vT = _save_vA + _save_vB + _save_vC;
                    System.out.println("Votos totales\n" +
                            "Votos: "+_save_vT+
                            "\nVotos Candidatos" +
                            "\nCandidato A: " + _save_vA +
                            "\nCandidato B: " + _save_vB +
                            "\nCandidato C: " + _save_vC);
                    System.out.println("Digite cualquier numero para salir");
                    _op_aceptar = _teclado.nextInt();
                }
                case 5 -> {
                    float _porcentaje_A, _porcentaje_B, _porcentaje_C;
                    _save_vT = _save_vA + _save_vB + _save_vC;
                    _porcentaje_A = (float) _save_vA /_save_vT;
                    _porcentaje_B = (float) _save_vB /_save_vT;
                    _porcentaje_C = (float) _save_vC /_save_vT;
                    System.out.println("Porcentajes Candidatos\n" +
                            "\nCandidato A: " + _porcentaje_A * 100 + "%" +
                            "\nCandidato B: " + _porcentaje_B * 100 + "%" +
                            "\nCandidato C: " + _porcentaje_C * 100 + "%");
                    System.out.println("Digite cualquier numero para salir");
                    _op_aceptar = _teclado.nextInt();
                }
                case 6 -> {
                    System.out.println("Costo Promedio");
                    int _costo_t = 0;
                    _costo_t = _costo_A + _costo_B + _costo_C;
                    _costo_t = _costo_t / 3;
                    System.out.println("Promedio costo de campañas: " +_costo_t +
                            "\nDigite cualquier numero para salir: ");
                    _op_aceptar = _teclado.nextInt();
                }
                case 0 -> System.out.println("Saliendo ...");
                default -> System.out.println("Saliendo ...");
            }
        }
    }
}
