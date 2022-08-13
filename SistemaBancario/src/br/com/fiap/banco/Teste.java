package br.com.fiap.banco;

public class Teste {
    public static void main(String[] args) {
//        ContaCorrente cc = new ContaCorrente();
//        cc.setAgencia(1111);
//        cc.setNumero(2222);
//        cc.setTipo("PF");
//        cc.setChequeEspecial(1000);
//
//        Conta cc2 = new ContaCorrente();

        Conta conta = new Conta();
        Conta cc = new ContaCorrente();

        ContaCorrente c1 = (ContaCorrente) cc;

        if (conta instanceof ContaCorrente) {
            ContaCorrente c2 = (ContaCorrente) conta;
        }

    }
}
