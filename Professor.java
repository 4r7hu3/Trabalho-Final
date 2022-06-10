public class Professor extends Duvidas {
  // atributos devem ser privados
  private String nome;
  private double siape;
  private String senha;
  private int nivel;
  //private String turmas[];
  
  // construtor para senha de acesso
  public Professor(String senha) {
    this.senha = senha;
  }

  // construtor para número da dúvida e resposta
  /*public Professor(int n, String resposta) {
    this.nduvida = n;
    this.resposta = resposta;
  }*/
  
  // definindo os setters e getters dos atributos
  public String getSenha() {
    return senha;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getNome() {
    return nome;
  }

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

  // implementando o método tiraDuvida() da classe abstrata
  public String tiraDuvida() {
    return resposta;
  }
}