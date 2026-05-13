import java.util.concurrent.Semaphore;

public class JantarDosFilosofos {
  public static void main(String[] args){
    final int num_filosofos = 5;
    final int max_refeicoes = 1;

    Filosofo[] filosofos = new Filosofo[num_filosofos];
    Semaphore[] garfos = new Semaphore[num_filosofos];

    for(int i = 0; i < num_filosofos; i++){
      garfos[i] = new Semaphore(1);
    }
    for(int i = 0; i < num_filosofos; i++){
      Semaphore garfoEsquerdo = garfos[i];
      Semaphore garfoDireito = garfos[(i+1) % num_filosofos];

      if(i == num_filosofos - 1){
        filosofos[i] = new Filosofo(i, garfoDireito, garfoEsquerdo, max_refeicoes);
      } else {
        filosofos[i] = new Filosofo(i, garfoEsquerdo, garfoDireito, max_refeicoes);
      }

      Thread threadFilosofo = new Thread(filosofos[i]);
      threadFilosofo.start();
    }
  }
}