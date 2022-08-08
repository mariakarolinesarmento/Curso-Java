package com.company.orientacao_a_objetos._5_orientacao_a_objetos_parte2.modificador_de_acesso_default_5_9;
public class TreinadorCachorro {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Bob");
        DonoCachorro dono = new DonoCachorro();
        dono.ensinarCachorroSentar(cachorro);
    }
}
