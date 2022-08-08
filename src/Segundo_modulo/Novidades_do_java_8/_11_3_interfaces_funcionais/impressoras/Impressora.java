package Segundo_modulo.Novidades_do_java_8._11_3_interfaces_funcionais.impressoras;

import Segundo_modulo.Novidades_do_java_8._11_3_interfaces_funcionais.compra.Compra;

@FunctionalInterface
public interface Impressora {

    public void imprimir(Compra c);
}