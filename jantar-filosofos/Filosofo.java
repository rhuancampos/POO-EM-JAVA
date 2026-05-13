import java.util.concurrent.Semaphore;

public class Filosofo implements Runnable {
    private int id;
    private final Semaphore garfoEsquerdo;
    private final Semaphore garfoDireito;
    private int maxRefeicoes;

    public Filosofo(int id, Semaphore garfoEsquerdo, Semaphore garfoDireito, int maxRefeicoes) {
        this.id = id;
        this.garfoEsquerdo = garfoEsquerdo;
        this.garfoDireito = garfoDireito;
        this.maxRefeicoes = maxRefeicoes;
    }

    private void pensar() throws InterruptedException {
      System.out.println("Filosofo " + id + " esta pensando...");
      Thread.sleep((long) (Math.random() * 1000));
    }

    private void comer() throws InterruptedException {
      System.out.println("Filosofo " + id + " esta COMENDO!");
      Thread.sleep((long) (Math.random() * 1000));
      System.out.println("Filosofo " + id + " terminou de comer!");
    }

    @Override
    public void run() {
      try{
        int refeicoesFeitas = 0;
        while (refeicoesFeitas < maxRefeicoes) {
          this.pensar();
          System.out.println("Filósofo " + this.id + " está com fome e tentando pegar o 1º garfo.");
          this.garfoEsquerdo.acquire();
          try{
            System.out.println("Filósofo " + this.id + " pegou o 1º garfo.");
            System.out.println("Filósofo " + this.id + " tentando pegar o 2º.");
            this.garfoDireito.acquire();
            try{
              System.out.println("Filósofo " + this.id + " pegou o 2º garfo.");
              comer();
              refeicoesFeitas++;
            } finally {
              this.garfoDireito.release();
            }
          } finally {
            this.garfoEsquerdo.release();
          }
        }
        System.out.println("Filósofo " + this.id + " SAIU DA MESSA!");
      } catch (Exception e) {
        System.out.println("Filósofo " + this.id  + " foi interrompido e saiu da mesa.");
        Thread.currentThread().interrupt();
      }
    }
}
