public class Aluno extends Pessoa {
  // atributos devem ser privados/protegidos
  private double matricula;
  private float ira_i;
  private float ira_g;
  private int semestre;

  // métodos get e set próprios de Aluno
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
  
}