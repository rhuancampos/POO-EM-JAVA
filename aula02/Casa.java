public class Casa {
  //Atributos (características) da classe Casa
  String cor;
  int numeroBanheiros;
  int numeroAndares;

  //Construtor: método especial para criar objetos da classe
  public Casa(String cor, int numeroBanheiros, int numeroAndares) {
    this.cor = cor;
    this.numeroBanheiros = numeroBanheiros;
    this.numeroAndares = numeroAndares;
  }
  
  //Metodos (comportamentos) da classe Casa
  public String pintarACasa(String cor) {
    this.cor = cor;
    return "A casa foi pintada de " + cor;
  }

  // Método para abrir a porta da casa
  public void abrirPorta() {
    System.out.println("A porta da casa foi aberta.");
  }

  // Sobrescreve o método toString para facilitar a visualização dos objetos
  public String toString() {
    return "Casa{" +
            "cor='" + cor + '\'' +
            ", numeroBanheiros=" + numeroBanheiros +
            ", numeroAndares=" + numeroAndares +
            '}';
  }
}