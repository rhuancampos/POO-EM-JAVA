public class Tarefa implements Runnable {
  private String nome;
  public Tarefa(String nome) {
    this.nome = nome;
  }

  @Override
  public void run(){
    for(int i = 1; i <= 5; i++){
      System.out.println(nome + " executando passo " + i);
      try{
        Thread.sleep(500);
      } catch(Exception e) {
        e.printStackTrace();
      }
    }
  }
}
