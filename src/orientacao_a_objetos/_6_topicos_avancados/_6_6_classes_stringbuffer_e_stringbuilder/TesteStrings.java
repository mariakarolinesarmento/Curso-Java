package com.company.orientacao_a_objetos._6_topicos_avancados._6_6_classes_stringbuffer_e_stringbuilder;

public class TesteStrings {

    public static void main(String[] args) {

        String s = "Olá";
        s = s + " Pessoal!";

        System.out.println(s);

        StringBuilder sb = new StringBuilder("Olá");
        sb.append(" Pessoal!");

        String resultado = sb.toString();
        System.out.println("com StringBuilder: " + resultado);
    }
}
