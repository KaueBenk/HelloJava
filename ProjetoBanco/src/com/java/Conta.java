package com.java;

public class Conta {
    int numero;
    double saldo;

    public Conta() {}

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public Conta(int numero) {
        this.numero = numero;
        this.saldo = 0;
    }

    public double recuperarSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}
