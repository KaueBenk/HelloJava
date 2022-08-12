package com.java.operadores;

public class OperadorLogico {
    public static void main(String[] args) {
        int idade = 75;

        boolean precisaVotar = idade >= 18 && idade < 70;

        System.out.println(precisaVotar);



        int nrAmarelo = 0, nrVermelho = 0;

        boolean suspenso = nrAmarelo == 2 || nrVermelho == 1;

        System.out.println(suspenso);
    }
}
