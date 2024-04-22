package ar.edu.utn.frba.dds;

public class Golondrina {
  int energia;

  public Golondrina(int energiaInicial) {
    energia = energiaInicial;
  }

  public void volar() {
    this.energia -= 10;
  }

  public void comer(int cantidad) {
    this.energia = energia + (3 * cantidad);
  }

  public int getEnergia() {
    return energia;
  }
}