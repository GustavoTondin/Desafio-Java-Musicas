package Modelos;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private List<Audio> audios = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Audio> getAudios() {
        return audios;
    }

    public void adicionarNaPlaylist(Audio audio){
        audios.add(audio);
    }

    public void listarPlaylist(){
        int contador = 1;
        System.out.println("Lista de Audios da PlayList:\n");
        for (Audio audio : audios){
            System.out.println(contador + "-" + audio.getTitulo());
            contador++;
        }
    }
}
