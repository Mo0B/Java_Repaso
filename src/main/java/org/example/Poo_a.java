package org.example;

public class Poo_a {
    private int n1, n2;

    public Poo_a() {

    }

    public Poo_a(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN2() {
        return n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    @Override
    public String toString() {
        return "operaciones" + n1 + n2 + "suma";
    }

    public void Saludar(){
        System.out.println("Habia una suma aqui");
    }
    public int Suma(){
        int suma = this.n1 + this.n2;
        return suma;
    }
    public double Raiz(int n1){
        return Math.sqrt(n1);
    }
}
