public abstract class Duvidas {
  public int nduvida;
  public String duvida;
  public String resposta;
  public String dvd[];
  
  // método para Aluno fazer dúvida
  public void fazDuvida() {
    System.out.println("Dúvida");
  }
  
  // método para Professor/Aluno sanar dúvida
  public abstract String tiraDuvida();

  // adiciona as dúvidas em um vetor
  public void addDuvidas(int i) {
    for(i=0; i<10; i++) {
      dvd[i] = duvida;
    }
  }
    
}