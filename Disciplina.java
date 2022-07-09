public class Disciplina {
  // atributos devem ser privados/protegidos
  private String nome;
  private String codigo;
  private String semestre;
  public Aluno alunos[] = new Aluno[60];
  private Duvida duvidas[] = new Duvida[60];

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

  // método que adiciona Aluno em turmas/disciplinas
  public void addAluno(int i, Aluno alu) {
   alunos[i] = alu;
  }

  // método que remove Aluno da disciplina
  public void removeAluno(int matricula) {
    for(int i=0; i<alunos.length; i++) {
      if(alunos[i] != null) {
        if(alunos[i].getMatricula() == matricula) {
          alunos[i] = null;
        }
      }
    }
  }

  // métodos de manipulação de dúvida

  // adiciona dúvida no vetor
  public void addDuvida(int i, Duvida x) {
    duvidas[i] = x;
  }

  // deleta dúvida do vetor
  public void deletaDuvida(int id_duvida) {
    for(int i=0; i<duvidas.length; i++) {
      if(duvidas[i] != null) {
        if(duvidas[i].getIdDuvida() == id_duvida) {
          duvidas[i] = null;
        }
      }
    }
  }
  
  // pesquisa por uma dúvida
  public void pesquisaDuvida(int id_duvida) {
    for(int i=0; i<duvidas.length; i++) {
      if(duvidas[i] != null) {
        if(duvidas[i].getIdDuvida() == id_duvida) {
          System.out.println(duvidas[i].getDuvida());
        }
        else {
          System.out.println("Id não correspondente, tente novamente!");
        }
      }
    }
  }
}