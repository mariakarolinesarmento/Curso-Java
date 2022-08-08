package Segundo_modulo.Novidades_do_java_8._11_3_interfaces_funcionais.teste;

import Segundo_modulo.Novidades_do_java_8._11_3_interfaces_funcionais.compra.Compra;
import Segundo_modulo.Novidades_do_java_8._11_3_interfaces_funcionais.impressoras.Impressora;

public class Teste {
    public static void main(String[] args) {
        /*Impressora i = new ImpressoraHP(); */

        Impressora i = (c) -> {
            System.out.println("Simulando a impressao. Seria impresso: " + c);
        };

        Compra compra = new Compra("Sabonete", 2.5);
        i.imprimir(compra);
    }
}