package Segundo_modulo.Novidades_do_java_8._11_4_introducao_ao_stream.teste;

import Segundo_modulo.Novidades_do_java_8._11_4_introducao_ao_stream.dao.FaturaDAO;
import Segundo_modulo.Novidades_do_java_8._11_4_introducao_ao_stream.modelo.Fatura;

import java.util.List;

public class Teste {
    public static void main(String[] args) {
        List<Fatura> faturas = new FaturaDAO().buscarTodasFaturas();

/*        for(Fatura f : faturas){
            if (f.getValor() > 250.0){
                System.out.println("Alerta: Fatura acima de R$250.0 ->" + f);
            }
        }
*/
        //Faz a mesma coisa que o exemplo comntadoa cima.
        faturas.stream()
                .filter(Fatura::estarEmRisco)
                .forEach(System.out::println);
    }
}