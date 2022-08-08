package com.company.orientacao_a_objetos._3_orientacao_a_objetos_parte1.acessando_atributos_de_objetos.exercicio;


public class PetShop {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();

        cachorro.nome = "Bidu";
        cachorro.idade = 1;
        cachorro.raca = "Boxer";
        cachorro.sexo = 'M';

        System.out.println("Nome: " + cachorro.nome);
        System.out.println("Idade: " + cachorro.idade);
        System.out.println("Ra�a: " + cachorro.raca);
        System.out.println("Sexo: " + cachorro.sexo);
    }

}
