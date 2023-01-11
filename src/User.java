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
}
