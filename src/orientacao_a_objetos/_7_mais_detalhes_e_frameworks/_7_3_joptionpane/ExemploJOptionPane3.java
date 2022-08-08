package com.company.orientacao_a_objetos._7_mais_detalhes_e_frameworks._7_3_joptionpane;

import javax.swing.*;

public class ExemploJOptionPane3 {

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        Object[] opcoes = {"Sim", "Não", "Sim, com e-mail"};

        int opcao = JOptionPane.showOptionDialog(null, "Você gostaria de finalizar o cadastro?",
                "Confirmação",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, opcoes, opcoes[2] );

        System.out.printf("Opção selecionada: " + opcao);

        if (opcao == 1) {
            // ...
        }
    }
}
