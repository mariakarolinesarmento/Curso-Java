package com.company.orientacao_a_objetos._5_orientacao_a_objetos_parte2.modificadores_static_e_final_5_10;
public class Contador {
    public static int COUNT = 0;
    public static final double PI = 3.14;
    public void incrementar(){
        COUNT++;
    }
    public static void imprimirContador(){
        System.out.println("O valor do contador agora é: " + Contador.COUNT);
    }

}
