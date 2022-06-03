public class Professor {
  // atributos devem ser privados
  private String nome;
  private double siape;
  private String senha;
  private int nivel;
  private String turmas[];

  // definindo os setters e getters dos atributos
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

  public void setSenha(String senha) {
    this.senha = senha;
  }
  public String getSenha() {
    return senha;
  }

  public void setNivel(int nivel) {
    this.nivel = nivel;
  }
  public int getNivel() {
    return nivel;
  }

  
}