package com.elipeixoto.classeabstrata.account;

public class ContaPoupanca  extends Conta {


    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    double taxa() {
        return 0.10;
    }
}
