package com.company.orientacao_a_objetos._7_mais_detalhes_e_frameworks._7_11_introducao_a_generics;

public class TesteGaveta {

    public static void main(String[] args) {
        Gaveta<String> gaveta = new Gaveta<>();
        gaveta.colocar("Livro de Java");
        System.out.println(gaveta.retirarPrimeiro());
        Gaveta<Integer> gavetaNumeros = new Gaveta<>();
        gavetaNumeros.colocar(4);
        System.out.println(gavetaNumeros.retirarPrimeiro() + 2);
    }
}
