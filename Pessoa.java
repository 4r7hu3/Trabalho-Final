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

  // métodos para fazer e tirar dúvidas
  public void fazDuvida() {
    System.out.print("\nDigite sua dúvida: ");
  }

  public void tiraDuvida() {
    System.out.print("\nDigite a resposta: ");
  }
}