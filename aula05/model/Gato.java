package model;

public class Gato extends Animal {
  public Gato(String nome, String cor, int DataDeNascimento, char sexo){
    super(nome,  cor,  DataDeNascimento,  sexo);
  }

  @Override
  public String emitirSom(){
    return this.getNome() + " fez Miau!";
  }
}
