public class Gerente extends Pessoa {
  String key;
  public Gerente(String nome, String cidade, String email, int idade, String key) {
    this.key = key;
    super(nome, cidade, email, idade);
  }

  @Override
  public String toString(){
    return "{Nome: " + this.nome + " E-mail: " + this.email + " Idade: " 
    + idade + " Cidade: " + this.cidade  + " Key: " + this.key + "}";
  }
}
