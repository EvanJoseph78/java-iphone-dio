package apps;

import sistema.Phone;

public class Telefone implements Phone {

  @Override
  public void realizarLigacao() {
    System.out.println("Realizando ligação");
  }

  @Override
  public void atenderLigacao() {
    System.out.println("Antender ligação");
  }

  @Override
  public void correioDeVoz() {
    System.out.println("Abrir correioDeVoz");
  }

}
