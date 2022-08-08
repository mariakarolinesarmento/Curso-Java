package com.company.orientacao_a_objetos._5_orientacao_a_objetos_parte2.sobreposicao_5_16;

import java.util.Date;

public class ProdutoPerecivel extends Produto{
    protected Date dataValidade;
    public void identificar(){
        System.out.println("Minha data de validade é: " + dataValidade);
    }
}
