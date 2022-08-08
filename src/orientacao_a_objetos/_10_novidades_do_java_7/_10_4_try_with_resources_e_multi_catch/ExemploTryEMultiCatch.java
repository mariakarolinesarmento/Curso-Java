package com.company.orientacao_a_objetos._10_novidades_do_java_7._10_4_try_with_resources_e_multi_catch;

import java.util.Scanner;

public class ExemploTryEMultiCatch {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)){

            System.out.println("Informe seu nome: ");
            String nome = entrada.nextLine();
            System.out.println("Informe sua idade: ");
            String idade = entrada.nextLine();

            try {
                SalvarAluno.salvar(nome, idade);
            } catch (NegocioException | NumberFormatException e) {
                System.out.println("Impossível completar operação. Motivo: " + e.getMessage());
            }
        }
    }
}
