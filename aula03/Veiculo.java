public class Veiculo {
  boolean status = false;
  String combustivel;
  String cor;
  String marca;
  String modelo;
  int ano;
  int consumoKmLitro = 10;

  public Veiculo(int ano, String combustivel, String cor, String marca, String modelo) {
    this.ano = ano;
    this.combustivel = combustivel;
    this.cor = cor;
    this.marca = marca;
    this.modelo = modelo;
  }

  public void ligar() {
    this.status = true;
    System.out.println("Veiculo ligado!");
  }

  public void desligar() {
    this.status = false;
    System.out.println("Veiculo desligado!");
  }

  public boolean isLigado() {
    return this.status;
  }

  public int calcularAutonomia(int litros) {
    return litros * this.consumoKmLitro;
  }

  public String toString() {
    return "Veiculo{" +
            "status=" + status +
            ", combustivel='" + combustivel + '\'' +
            ", cor='" + cor + '\'' +
            ", marca='" + marca + '\'' +
            ", modelo='" + modelo + '\'' +
            ", ano=" + ano +
            '}';
  }
}
