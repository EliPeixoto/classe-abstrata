package com.elipeixoto.classeabstrata;

import com.elipeixoto.classeabstrata.account.ContaCorrente;
import com.elipeixoto.classeabstrata.account.ContaPoupanca;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClasseAbstrataApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClasseAbstrataApplication.class, args);


        System.out.println("-------------Conta Corrente--------------");
        ContaCorrente cc = new ContaCorrente(500);
        System.out.println("Saldo" + cc.getSaldo());
        cc.updateSaldo();
        System.out.println("Saldo atual: " + cc.getSaldo());


        System.out.println("-------------Conta Poupança--------------");
        ContaPoupanca cp = new ContaPoupanca(1000);
        System.out.println("Saldo: " + cp.getSaldo());
        cp.updateSaldo();
        System.out.println("Saldo atual: " + cp.getSaldo());
    }

}
