public class Duvida {
  private int id_duvida;
  private String duvida;
  private String resposta;
  private Pessoa quemPergunta;
  private Pessoa quemResponde;

  // métodos get e set
  public void setIdDuvida(int n) {
    id_duvida = n;
  }
  public int getIdDuvida() {
    return id_duvida;
  }

  public void setDuvida(String duvida) {
    this.duvida = duvida;
  }
  public void setResposta(String resp) {
    resposta = resp;
  }

  public String getDuvida() {
    return duvida;
  }
  
  public String getResposta() {
    return resposta;
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
  
    
}