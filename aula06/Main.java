
public class Main {
  public static void main(String[] args) {
    try{
      int resultado = dividir(10, 0);
      System.out.println("Resultado: " + resultado);
    } catch(ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      System.out.println("Operação de divisão finalizada.");
    }
  }

  private static int dividir(int a, int b) throws ArithmeticException {
    if(b == 0)
      throw new ArithmeticException("Divisão por zero não é permitida.");
    return a / b;
  }
}
