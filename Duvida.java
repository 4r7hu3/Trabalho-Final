public abstract class Duvida {
  public int id_duvida;
  public String resposta;
  private Pessoa quemPergunta;
  private Pessoa quemResponde;

  // métodos get e set
  public void setIdDuvida(int n) {
    id_duvida = n;
  }
  public int getIdDuvida() {
    return id_duvida;
  }

  public void setQuemPergunta(Pessoa p) {
    p = quemPergunta;
  }
  public void setQuemResponde(Pessoa r) {
    r = quemResponde;
  }

  public Pessoa getQuemPergunta() {
    return quemPergunta;
  }
  public Pessoa getQuemResponde() {
    return quemResponde;
  }
  
  // método para Professor/Aluno sanar dúvida
  //public abstract String tiraDuvida();
    
}