class Main {
  public static void main(String[] args) {
    Aluno al1 = new Aluno("12345a");
    Aluno al2 = new Aluno("2002aa");
    Professor pfs1 = new Professor("1234p");
    Disciplina sibd = new Disciplina("CK0084");

    System.out.print("\n");
    
    sibd.addAluno(0, al1);
    sibd.addAluno(1, al2);
    
    System.out.println("Senha do aluno: "+al1.getSenha());
    System.out.println("Senha do professor: "+pfs1.getSenha());
    System.out.println("Código - Disciplina: "+sibd.getCodigo());

    al1.fazDuvida();
    pfs1.tiraDuvida();
    //al1.addDuvidas(0);
  }
}