package com.company.orientacao_a_objetos._6_topicos_avancados._6_8_desafio_datas;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalculadoraGravidez {

    private Date dataUltimoPeriodoMenstrual;

    public CalculadoraGravidez(Date dataUltimoPeriodoMenstrual) {
        this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;
    }

    private Calendar converterDateParaCalendar(Date data) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(data);
        return calendar;
    }

    public Date calcularDataEstimadaConcepcao() {
        Calendar dataEstimadaDaConcepcao = converterDateParaCalendar(dataUltimoPeriodoMenstrual);
        dataEstimadaDaConcepcao.add(Calendar.WEEK_OF_YEAR, 2);

        return  dataEstimadaDaConcepcao.getTime();
    }

    public Date calcularDataEstimadaParto() {
        Calendar dataEstimadaParto = converterDateParaCalendar(dataUltimoPeriodoMenstrual);
        dataEstimadaParto.add(Calendar.WEEK_OF_YEAR, 40);

        return dataEstimadaParto.getTime();
    }

}
