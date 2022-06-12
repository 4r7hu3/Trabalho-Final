public class Disciplina {
  // atributos devem ser privados
  private String nome;
  private String codigo;
  private String semestre;

  // construtor para o código da disciplina
  public Disciplina(String codigo) {
    this.codigo = codigo;
  }
  
  // definindo os setters e getters dos atributos
  public String getCodigo() {
    return codigo;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getNome() {
    return nome;
  }

  public void setSemestre(String semestre) {
    this.semestre = semestre;
  }
  public String getSemestre() {
    return semestre;
  }

  
}