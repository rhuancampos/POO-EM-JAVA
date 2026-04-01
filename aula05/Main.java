import model.Cachorro;
import model.Gato;

public class Main {

  public static void main(String[] args){
    Cachorro dog1 = new Cachorro("Alex");

    System.out.println(dog1.emitirSom());
    
    Gato cat = new Gato("Brucuta", "Branco", 06,'M');
    System.out.println(cat.emitirSom());
    
    System.out.println(cat.getSexo());

  }
}
