package Segundo_modulo.Novidades_do_java_8._11_3_interfaces_funcionais.impressoras;

import Segundo_modulo.Novidades_do_java_8._11_3_interfaces_funcionais.compra.Compra;

public class ImpressoraHP implements Impressora {

    @Override
    public void imprimir(Compra c){
        System.out.println("Enviando o comando para a impressora HP -> " + c);
    }

}