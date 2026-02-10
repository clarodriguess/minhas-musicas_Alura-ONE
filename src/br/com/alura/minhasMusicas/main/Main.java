package br.com.alura.minhasMusicas.main;

import br.com.alura.minhasMusicas.modelos.Musica;
import br.com.alura.minhasMusicas.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        //add musica
        Musica musica1 = new Musica();
        musica1.setTitulo("Heroes");
        musica1.setArtista("David Bowie");
        musica1.setAlbum("Heroes");

        //teste para simular reproducoes e curtidas:
        for (int i = 0; i <60 ; i++) {
            musica1.reproduz();
        }

        for (int i = 0; i < 50 ; i++) {
            musica1.curte();
        }

        //add podcast
        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("Nao inviabilize");
        podcast1.setApresentador("Deia Freitas");

        //teste para simular reproducoes e curtidas:
        for (int i = 0; i < 50; i++) {
            podcast1.reproduz();
        }

        for (int i = 0; i <150 ; i++) {
            podcast1.curte();
        }


    }
}
