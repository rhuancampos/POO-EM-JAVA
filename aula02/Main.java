public class Main {
  public static void main(String[] args) {
		Casa minhaCasaMinhaVida = new Casa(args[0],
       Integer.parseInt(args[1]),
       Integer.parseInt(args[2]));

    Casa casaDoAlessandro = new Casa(args[3],
       Integer.parseInt(args[4]),
       Integer.parseInt(args[5]));
    
    System.out.println(minhaCasaMinhaVida);
    System.out.println(casaDoAlessandro);
	}
}
