public class Main {
  public static void main(String[] args) {
    Carro carro1 = new Carro(2020, "Gasolina", "Preto",
     "Chevrolet", "Onix", 2);

    System.out.println("Carro 1: " + carro1);
    carro1.ligar();
    System.out.println("Autonomia do carro 1: " + carro1.calcularAutonomia(50));

    Moto moto1 = new Moto(2022, "Gasolina", "Vermelho",
     "Honda", "CB 500", 2);
    System.out.println("Moto 1: " + moto1);
    moto1.ligar();
    System.out.println("Autonomia da moto 1: " + moto1.calcularAutonomia(14));

	}
}
