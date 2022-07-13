public class Professor extends Pessoa {
  // atributos devem ser privados
  private double siape;
  private int nivel; // 1 = bacharel; 2 = mestre; 3 = doutor

  // métodos get e set próprios de Professor
  public void setSiape(double siape) {
    this.siape = siape;
  }
  public double getSiape() {
    return siape;
  }

  public void setNivel(int nivel) {
    this.nivel = nivel;
  }
  public int getNivel() {
    return nivel;
  }
}