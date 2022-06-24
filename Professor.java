public class Professor extends Pessoa {
  // atributos devem ser privados
  private double siape;
  private int nivel;
  //private String turmas[];

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

  public void setResposta(String resposta) {
    this.resposta = resposta;
  }

  // implementando o método tiraDuvida() da classe Pessoa
  /*public String tiraDuvida() {
    return resposta;
  }*/
}