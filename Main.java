import java.sql.*;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.print("\n");
    Connection conn = null;
    
    try {
      String url = "jdbc:sqlite:TF.db";
      conn = DriverManager.getConnection(url);

      Statement stt = conn.createStatement();

      /*PreparedStatement prepStmt = conn.prepareStatement("insert into Professor values(?, ?, ?, ?)");
      prepStmt.setInt(1, 122333);
      prepStmt.setString(2, "1234");
      prepStmt.setString(3, "Ismayle Santos");
      prepStmt.setInt(4, 3);
      prepStmt.executeUpdate();*/

      //stt.executeUpdate("update Professor set nome = 'João' where nome = 'Ismayle Santos' ");

      /*PreparedStatement prepStmt = conn.prepareStatement("insert into Professor values(?, ?, ?, ?)");
      prepStmt.setInt(1, 222222);
      prepStmt.setString(2, "@1234");
      prepStmt.setString(3, "Rafael");
      prepStmt.setInt(4, 2);*/

      /*PreparedStatement prepStmt2 = conn.prepareStatement("insert into Disciplina values(?, ?, ?, ?)");
      prepStmt2.setString(1, "CK0085");
      prepStmt2.setString(2, "random");
      prepStmt2.setInt(3, 3);
      prepStmt2.setInt(4, 908731);
      prepStmt2.executeUpdate();*/

      //stt.executeUpdate("insert into Professor values(122233, '@1234', 'Ismayle', 2)");
      //stt.executeUpdate("insert into Disciplina values('CK00844', 'SIBD', 3, 908731)");
      //stt.executeUpdate("update Professor set siape = 908731 where siape = 122233");
      //stt.executeUpdate("delete from Professor where nome = 'Ismayle' ");
      
      ResultSet rs = stt.executeQuery("select * from Professor");
      //Result rs3 = stt.executeQuery("select nivel from Professor where nivel=2");
      
      while(rs.next()) {
        int siape = rs.getInt("siape");
        String nome = rs.getString("nome");
        System.out.println("Siape: "+siape+"\nNome: "+nome);
       }

      System.out.println("");
      ResultSet rs2 = stt.executeQuery("select * from Disciplina");
      while(rs2.next()) {
        String codigo = rs2.getString("codigo");
        String nome = rs2.getString("nome");
        int semestre = rs2.getInt("semestre");
        System.out.println("Código: "+codigo+"\nNome: "+nome+"\nSemestre: "+semestre);
      }
      
      System.out.println("\nSalvo no BD - BANCO ATUALIZADO");
    }
    catch(Exception e) {
      System.out.println(e.getMessage());
    }
    finally {
      try {
        if(conn != null) {
          conn.close();
        }
      }
      catch(SQLException e) {
        System.out.println(e.getMessage());
      }
    }
    
    Scanner sc = new Scanner(System.in);
    Aluno al1 = new Aluno();
    Aluno al2 = new Aluno();
    Professor pfs1 = new Professor();
    Disciplina sibd = new Disciplina("CK0084");

    al1.setNome("Pedro");
    al1.setMatricula(123456);
    al1.setSenha("1234@");
    al2.setMatricula(789101);
    al2.setNome("Ana");
    al2.setSenha("54321@");
    pfs1.setNome("Ismayle");
    pfs1.setSenha("@5678");    
    
    sibd.addAluno(0, al1);
    sibd.addAluno(1, al2);

    //int opcoes = {1, 2, 3, 4};
    /*while(true) {
      System.out.println("OPÇÕES: ");
      System.out.println("1. Fazer cadastro\n2. Imprimir dados\3. Fazer uma dúvida\n4. Tirar uma dúvida\n5. Consultar material");
      System.out.print("\nO que você deseja fazer? ");
      String opcao = sc.nextLine();
      if(opcao == 1) {
        System.out.println("Aluno(0) ou  Professor(1)?");
        int usuario = sc.nextLine();
        if(usuario == 1) {
          
        }
        
      }
    }*/
    System.out.println("");
    System.out.println("Senha do aluno "+al1.getNome() +": " +al1.getSenha());
    System.out.println("Senha do professor "+pfs1.getNome() +": "+ pfs1.getSenha());
    System.out.println("Código - Disciplina: "+sibd.getCodigo());

    sibd.removeAluno(789101);

    for(int i=0; i<sibd.alunos.length; i++) {
      if(sibd.alunos[i] != null) {
        System.out.println(sibd.alunos[i].getNome());
      }
    }
    
    al1.fazDuvida();
    Duvida d0 = new Duvida();
    d0.setDuvida(sc.nextLine()); // pega a dúvida
    d0.setIdDuvida(1); // adiciona um id pra dúvida (pode coincidir com a posição de duvida no vetor)
    sibd.addDuvida(0, d0); // adiciona a dúvida d0 no vetor
    pfs1.tiraDuvida();
    d0.setResposta(sc.nextLine()); // pega a resposta
    
    System.out.println("\nDúvida: "+d0.getDuvida());
    System.out.println("Resposta: "+d0.getResposta());
    System.out.println("");
    sibd.pesquisaDuvida(2);

    System.out.print("\n");
  }
}