package com.company.orientacao_a_objetos._10_novidades_do_java_7._10_2_switch_case_com_string;

public class SwitchCaseComString {

    public static void main(String[] args) {
        String carro = args.length > 0 ? args[0] : "";

        /*if (carro.equals("Audi")){
            System.out.println("Alemão");
        } else if (carro.equals("Ferrari")) {
            System.out.println("Italiano");
        } else if (carro.equals("Honda")) {
            System.out.println("Japonês");
        } else {
            System.out.println("Não informou nenhum carro!");
        }*/

        switch (carro) {
            case "Audi" -> System.out.println("Alemão");
            case "Ferrari" -> System.out.println("Italiano");
            case "Honda" -> System.out.println("Japonês");
            default -> System.out.println("Não informou nenhum carro!");
        }
    }
}
