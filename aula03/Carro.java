public class Carro extends Veiculo{
  int qntPortas = 4;

  public Carro(int ano, String combustivel, String cor,
     String marca, String modelo, int qntPortas) {
    // SUPER ele chama o construto da classe pai, ou seja, da classe Veiculo
    super(ano, combustivel, cor, marca, modelo);
    this.qntPortas = qntPortas;
  }

  @Override
  public void ligar() {
    this.status = true;
    System.out.println("O carro agora está ligado!");
  }
}
