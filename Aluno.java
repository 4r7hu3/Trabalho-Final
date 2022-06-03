public class Aluno {
  // atributos devem ser privados
  private String nome;
  private double matricula;
  private String senha;
  private float ira_i;
  private float ira_g;
  private int semestre;
  private String turmas[];

  // definindo os setters e getters dos atributos
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

  public void setSenha(String senha) {
    this.senha = senha;
  }
  public String getSenha() {
    return senha;
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

  
  
}