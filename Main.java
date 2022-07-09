import java.sql.*;
import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
  public static void main(String[] args) {
    System.out.print("\n");

    Scanner sc = new Scanner(System.in);
    Disciplina sibd = new Disciplina("CK0084");
    Aluno alu = new Aluno();
    Professor prof = new Professor();
    Duvida d0 = new Duvida();

    try {
      while (true) {
        // System.out.println("\n");
        System.out.println("\n---------- OPÇÕES ----------");
        System.out.println("\n1. Fazer cadastro\n2. Imprimir dados\n3. Fazer uma dúvida\n4. Responder uma dúvida\n5. Consultar dúvidas\n6. Encerrar sessão");
        System.out.print("\nEscolha uma opção: ");
        int opcao = sc.nextInt();

        if (opcao == 1) {
          System.out.print("\nSe você é aluno digite ‘0‘, se é professor, digite ‘1‘: ");
          int usuario = sc.nextInt();

          if (usuario == 0) {
            System.out.print("\nNome: ");
            alu.setNome(sc.next());
            System.out.print("Matrícula: ");
            alu.setMatricula(sc.nextDouble());
            System.out.print("Defina uma senha: ");
            alu.setSenha(sc.next());
            System.out.print("Semestre: ");
            alu.setSemestre(sc.nextInt());
            System.out.print("IRA Individual: ");
            alu.setIraI(sc.nextFloat());
            sibd.addAluno(0, alu);
            System.out.print("\nPARABÉNS! Seu cadastro foi realizado com sucesso.");
            System.out.print("\n");
          } 
          else if (usuario == 1) {
            System.out.print("\nNome: ");
            prof.setNome(sc.next());
            System.out.print("Siape: ");
            prof.setSiape(sc.nextDouble());
            System.out.print("Defina uma senha: ");
            prof.setSenha(sc.next());
            System.out.print("Nível: ");
            prof.setNivel(sc.nextInt());
            System.out.print("\nPARABÉNS! Seu cadastro foi realizado com sucesso.");
            System.out.print("\n");
          } 
          else {
            System.out.print("\nERRO - TENTE NOVAMENTE");
          }
        } 
        else if (opcao == 2) {
          System.out.print("\nSe você é aluno digite ‘0‘, se é professor, digite ‘1‘: ");
          int usuario = sc.nextInt();

          if (usuario == 0) {
            System.out.println("SEUS DADOS: ");
            System.out.print("\nNome: " + alu.getNome());
            System.out.print("\nMatrícula: " + alu.getMatricula());
            System.out.print("\nSemestre: " + alu.getSemestre());
            System.out.print("\nIRA Individual: " + alu.getIraI());
            System.out.print("\n");
          } 
          else if (usuario == 1) {
            System.out.print("\nNome: " + prof.getNome());
            System.out.print("\nSiape " + prof.getSiape());
            System.out.print("\nNível: " + prof.getNivel());
            System.out.print("\n");
          } 
          else {
            System.out.print("\nERRO - TENTE NOVAMENTE");
          }
        }
        else if (opcao == 3) {
          int id = 0;
          int aux = 0;
          alu.fazDuvida();
          d0.setDuvida(sc.next());
          d0.setIdDuvida(id);
          sibd.addDuvida(aux, d0);
          id++;
          aux++;
        } 
        else if (opcao == 4) {
          System.out.print("\nAluno(0) ou  Professor(1)? ");
          int usuario = sc.nextInt();

          if (usuario == 0) {
            System.out.println("\nDúvida: "+d0.getDuvida());
            alu.tiraDuvida();
            d0.setResposta(sc.next());
          } 
          else if (usuario == 1) {
            System.out.println("\nDúvida: "+d0.getDuvida());
            prof.tiraDuvida();
            d0.setResposta(sc.next());
          } 
          else {
            System.out.print("\nERRO - TENTE NOVAMENTE");
          }
        } 
        else if (opcao == 5) {
          System.out.println("\nDúvida: " + d0.getDuvida());
          System.out.println("Resposta: " + d0.getResposta());
        } 
        else if (opcao == 6) {
          System.out.println("\nPROGRAMA ENCERRADO!\n");
          break;
        } 
        else {
          System.out.print("\n======================");
          System.out.print("\nERRO - TENTE NOVAMENTE");
          System.out.println("\n======================");
        }
      }
    }
    catch (InputMismatchException e) {
      System.out.println("\nEntrada INVÁLIDA!");
      System.out.print("\nPor favor, reinicie a aplicação e tente novamente.\n");
    }

    Connection conn = null;

    try {
      String url = "jdbc:sqlite:TF.db";
      conn = DriverManager.getConnection(url);
  
      Statement stt = conn.createStatement();
  
      // PreparedStatement prepStmt = conn.prepareStatement("insert into Professor values(?, ?, ?, ?)");
      // prepStmt.setDouble(1, prof.getSiape());
      // prepStmt.setString(2, prof.getSenha());
      // prepStmt.setString(3, prof.getNome());
      // prepStmt.setInt(4, prof.getNivel());
      // prepStmt.executeUpdate();
  
      // PreparedStatement prepStmt2 = conn.prepareStatement("insert into Disciplina values(?, ?, ?, ?)");
      // prepStmt2.setString(1, "CK0085");
      // prepStmt2.setString(2, "SIBD");
      // prepStmt2.setInt(3, 3);
      // prepStmt2.setInt(4, 50);
      // prepStmt2.executeUpdate();
  
      //stt.executeUpdate("insert into Professor values(122233, '@1234', 'Ismayle',
      //2)");
      //stt.executeUpdate("insert into Disciplina values('CK00844', 'SIBD', 3,
      //908731)");
      
      //stt.executeUpdate("update Disciplina set codigo = 'CK0084' where codigo = 'CK0085' ");
      
      //stt.executeUpdate("delete from Professor where nome = 'Ismayle' ");
      //stt.executeUpdate("delete from Professor");
      
      ResultSet rs = stt.executeQuery("select * from Professor");
  
      while(rs.next()) {
        int siape = rs.getInt("siape");
        String nome = rs.getString("nome");
        int nivel = rs.getInt("nivel");
        System.out.println("Siape: "+siape+"\nNome: "+nome+"\nNivel: "+nivel);
      }
  
      System.out.println("");
  
      ResultSet rs2 = stt.executeQuery("select * from Disciplina");
      
      while(rs2.next()) {
        String codigo = rs2.getString("codigo");
        String nome = rs2.getString("nome");
        int semestre = rs2.getInt("semestre");
        System.out.println("Código: "+codigo+"\nNome: "+nome+"\nSemestre: "+semestre);
      }
  
      System.out.println("\nO banco de dados foi atualizado.");
      
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

    System.out.print("\n");
  }
}