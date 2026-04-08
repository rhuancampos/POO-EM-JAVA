public class Moto extends Veiculo {
  int qntRodas = 2;

  public Moto(int ano, String combustivel, String cor,
     String marca, String modelo, int qntRodas) {
    // SUPER ele chama o construtor da classe pai, ou seja, da classe Veiculo
    super(ano, combustivel, cor, marca, modelo);
    this.qntRodas = qntRodas;
  }

  @Override
  public int calcularAutonomia(int litros) {
    return litros * this.consumoKmLitro * 3;
  }

  @Override
  public String toString() {
    return "A moto é da marca " + this.marca + ", modelo " + this.modelo + ", cor " + this.cor +
            ", ano " + this.ano + ", combustível " + this.combustivel +
            " e tem " + this.qntRodas + " rodas.";
  }
}
