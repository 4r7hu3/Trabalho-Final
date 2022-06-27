class Main {
  public static void main(String[] args) {
    System.out.print("\n");
    
    Aluno al1 = new Aluno();
    Aluno al2 = new Aluno();
    Professor pfs1 = new Professor();
    Disciplina sibd = new Disciplina("CK0084");

    al1.setNome("Pedro");
    al1.setSenha("1234@");
    pfs1.setNome("Ismayle");
    pfs1.setSenha("@5678");
    
    sibd.addAluno(0, al1);
    sibd.addAluno(1, al2);
    
    System.out.println("Senha do aluno "+al1.getNome() +": " +al1.getSenha());
    System.out.println("Senha do professor "+pfs1.getNome() +": "+ pfs1.getSenha());
    System.out.println("Código - Disciplina: "+sibd.getCodigo());

    al1.fazDuvida();
    //al1.tiraDuvida();
    pfs1.tiraDuvida();
    //al1.addDuvidas(0);

    System.out.print("\n");
  }
}