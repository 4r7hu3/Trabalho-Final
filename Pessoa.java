public class Pessoa {
  private String nome;
  private String senha;

  // métodos get e set a serem herdados por Aluno e Professor
  public void setNome(String nome) {
    this.nome = nome;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }
  
  public String getNome() {
    return nome;
  }
  public String getSenha() {
    return senha;
  }

  public void fazDuvida() {
    System.out.println("Aqui é feita a dúvida!");
  }

  public void tiraDuvida() {
    System.out.println("Aqui as dúvidas são tiradas!");
  }

  // métodos para tirar dúvidas
  /*public void setResposta(String resposta) {
    this.resposta = resposta;
  }
  public String tiraDuvida() {
    return resposta;
  }*/
}