package com.company.orientacao_a_objetos._7_mais_detalhes_e_frameworks._7_11_introducao_a_generics;

import java.util.List;

public class RetiraElementos {

    public static <T> T recuperarPrimeiro(List<T> lista){
        return lista.get(0);
    }
}
