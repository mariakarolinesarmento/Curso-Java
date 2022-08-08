package Segundo_modulo.Novidades_do_java_8._11_1_introducao_ao_lambda_.dao;

import Segundo_modulo.Novidades_do_java_8._11_1_introducao_ao_lambda_.modelo.Fatura;

import java.util.ArrayList;
import java.util.List;

public class FaturaDAO {

    public List<Fatura> buscarFaturasVencidas() {
        //Obviamente você buscaria isso no banco de dados...

        List<Fatura> faturas = new ArrayList<>();

        faturas.add(new Fatura("filipe@gmail.com" , 350.0));
        faturas.add(new Fatura("filipe@gmail.com" , 150.0));
        faturas.add(new Fatura("filipe@gmail.com" , 290.0));

        return faturas;
    }
}