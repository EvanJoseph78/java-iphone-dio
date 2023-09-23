import apps.ReprodutorAudioNativo;
import apps.Safari;
import apps.Telefone;

public class Iphone {
  ReprodutorAudioNativo appleMusic;
  Telefone applePhone;
  Safari safari;

  public Iphone() {
    this.appleMusic = new ReprodutorAudioNativo();
    this.applePhone = new Telefone();
    this.safari = new Safari();
  }

  public void tocarMusica() {
    appleMusic.encontrarArquivo();
    appleMusic.reproduzirAudio();
  }

  public void realizarLigacao() {
    applePhone.realizarLigacao();
  }

  public void atenderLigacao() {
    applePhone.atenderLigacao();
  }

  public void abrirCorreioDeVoz() {
    applePhone.correioDeVoz();
  }

  public void abrirNavegador() {
    safari.conectarInternet();
  }

  public void novaAba() {
    safari.novaAba();
  }

  public void atualizarPagina() {
    safari.atualizarPagina();
  }

}
