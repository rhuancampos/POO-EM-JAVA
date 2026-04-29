public class Main {
  public static void main(String[] args) {
    Thread t1 = new Thread(new Tarefa("Upload de imagem"));
    Thread t2 = new Thread(new Tarefa("Envio de email"));

    t1.start();
    t2.start();

    //CÓDIGO PARA SIMULAR E VER A DIFERENÇA EM TEMPO DE EXECUÇÃO DE UMA ATIVIDADE SEQUENCIAL E PARALELA
    int totalTarefas = 10;
    int delayMilissegundos = 500;

    long inicioSeq = System.currentTimeMillis();
    
    for(int i = 1; i <= totalTarefas; i++){
      processar("TAREFA " + i, delayMilissegundos);
    }

    long finalSeq = System.currentTimeMillis();
    long tempoSeq = finalSeq - inicioSeq;

    long inicioPar = System.currentTimeMillis();

    Thread[] threads = new Thread[totalTarefas];
    for(int i = 0; i < totalTarefas; i++){
      final int id = i + 1;
      threads[i] = new Thread(() -> processar("THREAD-" + id, delayMilissegundos));
      threads[i].start();
    }

    try{
      for(Thread t : threads){
        t.join();
      }
    } catch(InterruptedException e){
      e.printStackTrace();
    }

    long fimPar = System.currentTimeMillis();
    long tempoPar = fimPar - inicioPar;


    System.out.println("TEMPO DE EXECUÇÃO DA SEQ: " + tempoSeq + " em ms");
    System.out.println("TEMPO DE EXECUÇÃO DA PAR: " + tempoPar + " em ms");

    double ganho = (double) tempoSeq / tempoPar;
    System.out.printf("Ganho de velocidade: %.2fx\n", ganho);
  }

  public static void processar(String nome, int delay){
     try{
        Thread.sleep(delay);
        System.out.println("[OK] " + nome);
      } catch (InterruptedException e){
        Thread.currentThread().interrupt();
      }
  }
}
