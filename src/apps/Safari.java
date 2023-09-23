package apps;

import sistema.AcessarInternet;

public class Safari implements AcessarInternet {
  @Override
  public void conectarInternet() {
    System.out.println("Conectado à internet através do navegador safari");
  }

  public void novaAba() {
    System.out.println("Nova aba");
  }

  public void atualizarPagina() {
    System.out.println("Página atualizada");
  }
}
