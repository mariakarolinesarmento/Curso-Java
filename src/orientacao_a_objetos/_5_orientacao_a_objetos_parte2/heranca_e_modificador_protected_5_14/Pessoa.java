package com.company.orientacao_a_objetos._5_orientacao_a_objetos_parte2.heranca_e_modificador_protected_5_14;
public class Pessoa {
    String nome;
    protected int idade;
    public void seApresentar(){
        System.out.println("Olá, eu sou o " + nome +
                ", e tenho " + idade + " anos.");
    }
}
