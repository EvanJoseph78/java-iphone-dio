package apps;

import sistema.GerenciadorDeArquivos;
import sistema.ReproduzirAudio;

public class ReprodutorAudioNativo implements ReproduzirAudio, GerenciadorDeArquivos {

    @Override
    public void reproduzirAudio() {
        System.out.println("Reproduzindo música através do apple music");
    }

    @Override
    public void pararAudio() {
        System.out.println("Musica parada");
    }

    @Override
    public void encontrarArquivo() {
        System.out.println("Listando arquivos na pasta music");
    }

    public void selecionarMusica() {
        encontrarArquivo();
        System.out.println("Mostrando lista de musicas");
    }

}
