package com.elipeixoto.classeabstrata.account;

public class ContaCorrente extends Conta {


    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    double taxa() {
        return 0.05;
    }
}
