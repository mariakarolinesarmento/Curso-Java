package Segundo_modulo.Novidades_do_java_8._11_8_api_de_data.exemplos;

import Segundo_modulo.Novidades_do_java_8._11_8_api_de_data.model.Aluguel;
import Segundo_modulo.Novidades_do_java_8._11_8_api_de_data.model.Carro;
import Segundo_modulo.Novidades_do_java_8._11_8_api_de_data.model.Cliente;

import java.time.*;

public class DevolucaoCarro{
    public static void main(String[] args) {

        Aluguel aluguel = recuperarAluguel();

        //Para cada hora de atraso ele paga 10% do valor do carro em multa
        LocalDateTime dataEHoraDaDevolucao = LocalDateTime.of(LocalDate.now().plusDays(5), LocalTime.now());
        aluguel.setDataEHoraRealDaDevoucao(dataEHoraDaDevolucao);
        aluguel.imprimirFatura();
    }



    private static Aluguel recuperarAluguel() {
        Cliente cliente = new Cliente("João Silva", LocalDate.of(1985, Month.FEBRUARY, 8));
        Carro carro = new Carro("Gol", 90.0, Year.of(2012));

        LocalDateTime dataEHoraDaRetirada = LocalDateTime.of(LocalDate.now(),
                LocalTime.of(LocalTime.now().getHour(), 0));
        LocalDateTime dataEHoraPrevistaParaDevolucao = LocalDateTime.now().
                plusDays(3).plusHours(2);

        Aluguel aluguel = new Aluguel(cliente, carro, dataEHoraDaRetirada, dataEHoraPrevistaParaDevolucao);
        return aluguel;
    }
}

