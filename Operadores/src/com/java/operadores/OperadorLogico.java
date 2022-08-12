package com.java.operadores;

public class OperadorLogico {
    public static void main(String[] args) {
        // Exemplo 1 - E
        int idade = 75;

        boolean precisaVotar = idade >= 18 && idade < 70;

        System.out.println(precisaVotar);

        // Exemplo 2 - Ou
        int nrAmarelo = 0, nrVermelho = 0;

        boolean suspenso = nrAmarelo == 2 || nrVermelho == 1;

        System.out.println(suspenso);

        // Exemplo 3 - Ou exclusivo
        int x = 11, y = 11;

        boolean teste = x > 10 ^ y > 10;

        System.out.println(teste);

        // Exemplo 3 - Not
        idade = 16;

        boolean maioridade = ! (idade >= 18);

        System.out.println(maioridade);

    }
}
