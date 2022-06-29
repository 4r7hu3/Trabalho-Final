public class Material {
  // atributos devem ser privados
  private Duvida duvidas[];

  // métodos de CRUD
  public void addDuvida(int i, Duvida x) {
    duvidas[i] = x;
  }

  public void deletaDuvida(int id_duvida) {
    for(int i=0; i<duvidas.length; i++) {
      if(duvidas[i] != null) {
        if(duvidas[i].getIdDuvida() == id_duvida) {
          duvidas[i] = null;
        }
      }
    }
  }

  public void pesquisaDuvida(int i, int id_duvida) {
    for(i=0; i<duvidas.length; i++) {
      if(duvidas[i].getIdDuvida() == id_duvida) {
        System.out.println(duvidas[i].getResposta());
      }
    }
  }
  
}