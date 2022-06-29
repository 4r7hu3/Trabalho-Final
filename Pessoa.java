import java.util.Scanner;

public class Pessoa {
  private String nome;
  private String senha;

  Scanner sc = new Scanner(System.in);

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
    String dvd1 = sc.nextLine();
    //System.out.println("Aqui é feita a dúvida!");
  }

  public void tiraDuvida() {
    System.out.print("\nDigite a resposta: ");
    String resp1 = sc.nextLine();
    //System.out.println("Aqui as dúvidas são tiradas!");
  }

  // métodos para tirar dúvidas
  /*public void setResposta(String resposta) {
    this.resposta = resposta;
  }
  public String tiraDuvida() {
    return resposta;
  }*/
}