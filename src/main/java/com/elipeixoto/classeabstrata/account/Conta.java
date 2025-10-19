package com.elipeixoto.classeabstrata.account;

import lombok.Data;

//Classe abstrata, pois nao faz sentido uma Conta sem ser Poupanca ou Corrente
@Data
public abstract class Conta {

    double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void updateSaldo(){
        saldo += saldo * taxa();
    }

    abstract double taxa();
}
