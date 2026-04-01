package model;

public class Cachorro extends Animal {

  public Cachorro(String nome, String cor, int DataDeNascimento, char sexo){
    super(nome,  cor,  DataDeNascimento,  sexo);
  }

  public Cachorro(String nome) {
    super(nome);
  }

  @Override
  public String emitirSom(){
   return this.getNome() + " fez AUAU!";
  }
}
