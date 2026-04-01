package model;

public class Animal {
  private String nome;
  private String cor;
  private int DataDeNascimento;
  private char sexo;
  

  public Animal(String nome, String cor, int DataDeNascimento, char sexo){
    this.nome = nome;
    this.cor = cor;
    this.DataDeNascimento = DataDeNascimento;
    this.sexo = sexo;
  }

  public Animal(String nome){
    this.nome = nome;
  }

  public String emitirSom() {
    return this.nome + " fez algum som!";
  }

  protected void setSexo(char sexo) {
    this.sexo = sexo;
  }

  public String getSexo(){
    //Operador ternário
    return this.sexo == 'M' ? "Macho" : "Fêmea";
  }

  public String getNome(){
    return this.nome;
  }
}
