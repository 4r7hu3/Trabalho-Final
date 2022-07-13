import java.sql.*;
import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
  public static void main(String[] args) {
    System.out.print("\n");

    Scanner sc = new Scanner(System.in);
    Disciplina sibd = new Disciplina("CK0085");
    Aluno alu = new Aluno();
    Professor prof = new Professor();
    Duvida d0 = new Duvida();

    try {
      while (true) {
        // System.out.println("\n");
        System.out.println("\n---------- MENU ----------");
        System.out.println(
            "\n1. Fazer cadastro\n2. Imprimir dados\n3. Fazer uma pergunta\n4. Responder uma dúvida\n5. Consultar dúvidas\n6. Encerrar sessão");
        System.out.print("\nEscolha uma opção: ");
        int opcao = sc.nextInt();

        if (opcao == 1) {
          System.out.print("\nSe você é aluno digite ‘0‘, se é professor, digite ‘1‘: ");
          int usuario = sc.nextInt();

          if (usuario == 0) {
            sc.nextLine();
            System.out.print("\nNome: ");
            alu.setNome(sc.nextLine());
            System.out.print("Matrícula: ");
            alu.setMatricula(sc.nextDouble());
            sc.nextLine();
            System.out.print("Defina uma senha: ");
            alu.setSenha(sc.nextLine());
            System.out.print("Semestre: ");
            alu.setSemestre(sc.nextInt());
            System.out.print("IRA Individual: ");
            alu.setIraI(sc.nextFloat());
            sibd.addAluno(0, alu);
            System.out.print("\nPARABÉNS! Seu cadastro foi realizado com sucesso.");
            System.out.print("\n");
          } else if (usuario == 1) {
            sc.nextLine();
            System.out.printf("\nNome: ");
            prof.setNome(sc.nextLine());
            System.out.printf("Siape: ");
            prof.setSiape(sc.nextDouble());
            sc.nextLine();
            System.out.printf("Defina uma senha: ");
            prof.setSenha(sc.nextLine());
            System.out.printf("Nível: ");
            prof.setNivel(sc.nextInt());
            System.out.printf("\nPARABÉNS! Seu cadastro foi realizado com sucesso.");
            System.out.printf("\n");
          } else {
            System.out.print("\nERRO - TENTE NOVAMENTE");
          }
        } else if (opcao == 2) {
          System.out.print("\nSe você é aluno digite ‘0‘, se é professor, digite ‘1‘: ");
          int usuario = sc.nextInt();

          if (usuario == 0) {
            System.out.println("SEUS DADOS: ");
            System.out.print("\nNome: " + alu.getNome());
            System.out.print("\nMatrícula: " + alu.getMatricula());
            System.out.print("\nSemestre: " + alu.getSemestre());
            System.out.print("\nIRA Individual: " + alu.getIraI());
            System.out.print("\n");
          } else if (usuario == 1) {
            System.out.print("\nNome: " + prof.getNome());
            System.out.print("\nSiape " + prof.getSiape());
            System.out.print("\nNível: " + prof.getNivel());
            System.out.print("\n");
          } else {
            System.out.print("\nERRO - TENTE NOVAMENTE");
          }
        } else if (opcao == 3) {
          if (alu.getNome() != null) {
            sc.nextLine();
            int id = 0;
            int aux = 0;
            alu.fazDuvida();
            d0.setDuvida(sc.nextLine());
            d0.setIdDuvida(id);
            sibd.addDuvida(aux, d0);
            id++;
            aux++;
          } else {
            System.out.print("\n********** CADASTRO NECESSÁRIO **********\n");
          }

        } else if (opcao == 4) {
          if (d0.getDuvida() != null) {
            System.out.print("\nSe você é aluno digite ‘0‘, se é professor, digite ‘1‘: ");
            int usuario = sc.nextInt();

            if (usuario == 0) {
              sc.nextLine();
              System.out.println("\nDúvida: " + d0.getDuvida());
              alu.tiraDuvida();
              d0.setResposta(sc.nextLine());
            } else if (usuario == 1) {
              if (prof.getNome() != null) {
                sc.nextLine();
                System.out.println("\nDúvida: " + d0.getDuvida());
                prof.tiraDuvida();
                d0.setResposta(sc.nextLine());
              } else {
                System.out.print("\n********** CADASTRO NECESSÁRIO **********\n");
              }
            } else {
              System.out.print("\nERRO - TENTE NOVAMENTE");
            }
          } else {
            System.out.print("\n********** CADASTRO NECESSÁRIO **********\n");
          }
        } else if (opcao == 5) {
          System.out.println("\nDúvida: " + d0.getDuvida());
          System.out.println("Resposta: " + d0.getResposta());
        } else if (opcao == 6) {
          System.out.println("\nPROGRAMA ENCERRADO!\n");
          break;
        } else {
          System.out.print("\n======================");
          System.out.print("\nERRO - TENTE NOVAMENTE");
          System.out.println("\n======================");
        }
      }
    } catch (InputMismatchException e) {
      // System.out.println("");
      System.out.println("\nEntrada INVÁLIDA!");
      System.out.println("Por favor, reinicie a aplicação e tente novamente.\n");
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
      // prepStmt2.setString(1, sibd.getCodigo());
      // prepStmt2.setString(2, "SIBD");
      // prepStmt2.setInt(3, 3);
      // prepStmt2.setInt(4, 50);
      // prepStmt2.executeUpdate();

      // PreparedStatement prepStmt3 = conn.prepareStatement("insert into Aluno values(?, ?, ?, ?, ?, ?, ?)");
      // prepStmt3.setDouble(1, alu.getMatricula());
      // prepStmt3.setString(2, alu.getSenha());
      // prepStmt3.setString(3, alu.getNome());
      // prepStmt3.setInt(6, alu.getSemestre());
      // prepStmt3.setString(7, sibd.getCodigo());
      // prepStmt3.executeUpdate();

     // stt.executeUpdate("update Disciplina set codigo = 'CK0084' where codigo = 'CK0085' ");

      // stt.executeUpdate("delete from Disciplina");
      // stt.executeUpdate("delete from Professor");
      // stt.executeUpdate("delete from Aluno");

      ResultSet rs = stt.executeQuery("select * from Professor");

      while (rs.next()) {
        int siape = rs.getInt("siape");
        String nome = rs.getString("nome");
        int nivel = rs.getInt("nivel");
        System.out.println("Siape: " + siape + "\nNome: " + nome + "\nNivel: " + nivel);
      }

      System.out.println("");

      ResultSet rs2 = stt.executeQuery("select * from Disciplina");

      while (rs2.next()) {
        String codigo = rs2.getString("codigo");
        String nome = rs2.getString("nome");
        int semestre = rs2.getInt("semestre");
        System.out.println("Código: " + codigo + "\nNome: " + nome + "\nSemestre: " + semestre);
      }

      System.out.println("");

      ResultSet rs3 = stt.executeQuery("select * from Aluno");

      while (rs3.next()) {
        String nome = rs3.getString("nome");
        Double matricula = rs3.getDouble("matricula");
        int semestre = rs3.getInt("semestre");
        String cod_disc = rs3.getString("disciplina_fk");
        System.out.println(
            "Nome: " + nome + "\nMatricula: " + matricula + "\nSemestre: " + semestre + "\nDisciplina: " + cod_disc);
      }

      // System.out.println("\nO banco de dados foi atualizado.");

    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        if (conn != null) {
          System.out.println("\nO banco de dados foi atualizado.");
          conn.close();
        }
      } catch (SQLException e) {
        System.out.println(e.getMessage());
      }
    }

    System.out.print("\n");
  }
}