package org.example;

public class Cuenta_Bancaria {
    private String _Titular;
    private int _Saldo, _NumCuenta;
    private boolean _validacion = false;
    private String [] _titulares = {"Marco","Marisol","Roberto"};
    private int [] _numCuentas = {8080,4545,2789};
    private int [] _saldos = {45000,800000,100000000};
    public Cuenta_Bancaria(){

    }
    public Cuenta_Bancaria(int _NumCuenta, int _Saldo, String _Titular){
        this._NumCuenta = _NumCuenta;
        this._Saldo = _Saldo;
        this._Titular = _Titular;
    }

    public String get_Titular() {
        return _Titular;
    }

    public int get_Saldo() {
        return _Saldo;
    }

    public void set_Titular(String _Titular) {
        this._Titular = _Titular;
    }

    public void set_Saldo(int _Saldo) {
        this._Saldo = _Saldo;
    }

    public void set_NumCuenta(int _NumCuenta) {
        this._NumCuenta = _NumCuenta;
    }

    public int get_NumCuenta() {
        return _NumCuenta;
    }


    public void Depositar_Dinero(int _Dinero){
        if (_Dinero > 0){
            this._Saldo = this._Saldo + _Dinero;
            System.out.println("El dinero fue depositado con Exito ...");
        }else{
            System.out.println("El monto no puede ser 0 o negativo\n");
        }

    }
    public void Retirar_Dinero(int _Dinero){

        if (_Dinero <= this._Saldo){
            this._Saldo = this._Saldo - _Dinero;
            System.out.println("El dinero fue retirado con Exito ...");
            this._validacion = true;
        }else{
            System.out.println("No hay dinero disponible" +
                    "\nSaldo disponible:" + this._Saldo + "\n");
            this._validacion = false;
        }
    }
    public boolean Validacion (){
        return this._validacion;
    }
    public String Mostrar_Informacion(){
        String _informacion;
        _informacion = "Informacion" +
                "\n Titular: " + this._Titular +
                "\n Numero de Cuenta: " + this._NumCuenta +
                "\n Saldo: " + this._Saldo + "\n";
        return _informacion;
    }
}
