package Modelos;

public class Preferidas {
    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado sucesso abesoluto e preferido por todos");
        } else {
            System.out.println(audio.getTitulo() + " também esta sendo curtido!");
        }
    }
}
