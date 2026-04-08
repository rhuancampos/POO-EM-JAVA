import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    //Tipos primitivos:
    /* byte
    short
    int
    long
    float
    double
    char
    boolean */ 

    //Tipos de referência:
    /* classes
    interfaces
     - List
     - Map
    arrays
     - int[] a = {3,65,775,57};
     - float[] b
    wrappers
      - Interge
      - Double */

    /* int[] a = {3,65,775,57}; 
    /*for(int i = 0; i < a.length; i++){
      System.out.println(a[i]);
    }
    int[] novoA = new int[a.length + 1];
    for(int i = 0; i < a.length; i++){
      novoA[i] = a[i];
    }
    novoA[novoA.length - 1] = 77;
    for(int i = 0; i < novoA.length; i++){
      System.out.println(novoA[i]);
    }

    ArrayList<Integer> b = new ArrayList<Integer>();
    b.add(34);
    b.add(44);
    b.add(4);
    b.add(74);
  
    for(Integer item : b){
      System.out.println(item);
    }
   */
    
    String caminho = "teste.csv"; // caminho do arquivo
    List<Pessoa> pessoas = new ArrayList<Pessoa>();

    try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
        String linha;

        linha = br.readLine();
        while ((linha = br.readLine()) != null) {
          String[] aux = linha.split(",");
          if(aux[5].equalsIgnoreCase("Gerente")){
            Gerente pessoa = new Gerente(aux[1], aux[4], aux[2], Integer.parseInt(aux[3]), aux[5]);
            pessoas.add(pessoa);
          } else {
            Usuario pessoa = new Usuario(aux[1], aux[4], aux[2], Integer.parseInt(aux[3]));
            pessoas.add(pessoa);
          }
        }

        System.out.println(pessoas.toString());
    } catch (IOException e) {
            e.printStackTrace();
    }
  }

}
