public class Aula {
  private String nomeDaAula;
  private double duracao;
  private String[] respostas;
  
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

  public void setRespostas(String[] respostas) {
    this.respostas = respostas;
  }

}
