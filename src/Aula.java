public class Aula {
  private String nomeDaAula;
  private double duracao;
  private String[] respostas = new String[20];
  
  public String getNomeDaAula() {
    return nomeDaAula;
  }

  public void setNomeDaAula(String nomeDaAula) {
    if(this.nomeDaAula == null){
      this.nomeDaAula = nomeDaAula;
    }
  }

  public double getDuracao() {
    return duracao;
  }

  public void setDuracao(double duracao) {
    if (this.duracao == 0){
      this.duracao = duracao;
    }
  }

  public String[] getRespostas() {
    return respostas;
  }

  public void setRespostas(String resposta) {
    System.out.println(resposta);
    for (int i = 0; i < this.respostas.length; i++){
      if (this.respostas[i] == null){
        this.respostas[i] = resposta;
        System.out.println(this.respostas[i]);
        break;
      }
    }
  }

}
