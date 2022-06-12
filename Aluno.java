public class Aluno extends Duvidas {
  // atributos devem ser privados/protegidos
  private String nome;
  private double matricula;
  private String senha;
  private float ira_i;
  private float ira_g;
  private int semestre;
  protected String duvidas[];

  // construtor para senha de acesso
  public Aluno(String senha) {
    this.senha = senha;
  }

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

  public void setMatricula(double matricula) {
    this.matricula = matricula;
  }
  public double getMatricula() {
    return matricula;
  }

  public void setIraI(float ira_i) {
    this.ira_i = ira_i;
  }
  public float getIraI() {
    return ira_i;
  }

  public void setIraG(float ira_g) {
    this.ira_g = ira_g;
  }
  public float getIraG() {
    return ira_g;
  }

  public void setSemestre(int semestre) {
    this.semestre = semestre;
  }
  public int getSemestre() {
    return semestre;
  }

  public void setResposta(String resposta) {
    this.resposta = resposta;
  }
  
  // sobescreve o método fazDuvida() da classe abstrata
  public void fazDuvida() {
    System.out.println("***Faz Dúvida***");
  }

  // implementa o método tiraDuvida() da classe abstrata
  public String tiraDuvida() {
    return resposta;
  }
  
}