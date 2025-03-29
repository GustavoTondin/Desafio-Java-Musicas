package Principal;

import Modelos.Musica;
import Modelos.Playlist;
import Modelos.Podcast;
import Modelos.Preferidas;

public class Main {
    public static void main(String[] args) {
        Musica minhamusica = new Musica();
        minhamusica.setTitulo("Numb");
        minhamusica.setCantor("Linkin Park");

        for (int i = 0; i < 5000; i++) {
            minhamusica.reproduz();
        }

        for (int i = 0; i < 500; i++) {
            minhamusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Estinho League");
        meuPodcast.setHost("Estinho");

        for (int i = 0; i < 1000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 100; i++) {
            meuPodcast.curte();
        }

        Preferidas minhasPreferidas = new Preferidas();
        minhasPreferidas.inclui(minhamusica);
        minhasPreferidas.inclui(meuPodcast);

        Playlist minhaPlaylist = new Playlist();
        minhaPlaylist.adicionarNaPlaylist(minhamusica);
        minhaPlaylist.adicionarNaPlaylist(meuPodcast);
        minhaPlaylist.listarPlaylist();

    }
}