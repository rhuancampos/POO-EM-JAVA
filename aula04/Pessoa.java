public class Pessoa {
  String nome;
  String cidade;
  int idade;
  String email;

  public Pessoa(String nome, String cidade, String email, int idade){
    this.nome = nome;
    this.email = email;
    this.cidade = cidade;
    this.idade = idade;
  }

  public String toString(){
    return "{Nome: " + this.nome + " E-mail: " + this.email + " Idade: " 
    + idade + " Cidade: " + this.cidade  + "}";
  }
}
