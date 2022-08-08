package Segundo_modulo.Novidades_do_java_8._11_1_introducao_ao_lambda_.exemplo;

import Segundo_modulo.Novidades_do_java_8._11_1_introducao_ao_lambda_.dao.FaturaDAO;
import Segundo_modulo.Novidades_do_java_8._11_1_introducao_ao_lambda_.modelo.Fatura;
import Segundo_modulo.Novidades_do_java_8._11_1_introducao_ao_lambda_.util.EnviadorEmail;


import java.util.List;

public class ExemploLambda {
    public static void main(String[] args) {
        List<Fatura> faturaVencidas = new FaturaDAO().buscarFaturasVencidas();

        EnviadorEmail enviadorEmail = new EnviadorEmail();

//        for(Fatura f : faturaVencidas) {
//            enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
//        }

        //lambda subsitui o for (laço de repetição)

        faturaVencidas.forEach(f -> {
            enviadorEmail.enviar(f.getEmailDevedor() , f.resumo());
            f.setEmailEnviado(true);
        } );



    }
}