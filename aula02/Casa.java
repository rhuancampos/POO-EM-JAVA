public class Casa {
  String cor;
  int numeroBanheiros;
  int numeroAndares;

  public Casa(String cor, int numeroBanheiros, int numeroAndares) {
    this.cor = cor;
    this.numeroBanheiros = numeroBanheiros;
    this.numeroAndares = numeroAndares;
  }
  
  public String pintarACasa(String novaCor) {
    this.cor = novaCor;
    return "A casa foi pintada de " + novaCor;
  }

  public void abrirPorta() {
    System.out.println("A porta da casa foi aberta.");
  }

  public String toString() {
    return "Casa{" +
            "cor='" + cor + '\'' +
            ", numeroBanheiros=" + numeroBanheiros +
            ", numeroAndares=" + numeroAndares +
            '}';
  }
}