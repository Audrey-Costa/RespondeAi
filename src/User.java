import java.util.Scanner;

public class User {
  private String nome;
  private String email;
  private String senha;
  private int idade;
  private int aulasAssistidas;

  public void assistirAula() {
    this.aulasAssistidas++;
  }

  public String responder(/* String resposta */) {
    Scanner reader = new Scanner(System.in);

    System.out.printf("Digite sua Resposta: ");
    String resposta = reader.nextLine();
    return resposta;
  }

  public String getNome(){
    return this.nome;
  }
  
  public void setNome(String nome) {
    if (this.nome == null) {
      this.nome = nome;
    }
  }

  public String getEmail(){
    return this.email;
  }

  public void setEmail(String email) {
    if (this.email == null){
      this.email = email;
    }
  }
  
  public void setNovoEmail(String email, String senha) {
    if (this.senha == senha){
      this.email = email;
    }
  }

  public String getSenha(){
    return this.senha;
  }

  public void setSenha(String senha) {
    if (this.senha == null){
      this.senha = senha;
    }
  }

  public void setNovaSenha(String senha, String novaSenha){
    if (this.senha == senha){
      this.senha = novaSenha;
    }
  }

  public int getIdade(){
    return this.idade;
  }

  public void setIdade(int idade) {
    if (this.idade == 0) {
      this.idade = idade;
    }
  }

  public int getAulasAssistidas() {
    return aulasAssistidas;
  }
}