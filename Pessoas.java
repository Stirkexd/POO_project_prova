public class  Pessoas{//eu tentei usar abstract mas deu erro
  protected int cpf;
  protected String nome;
  protected String titul;//titulacao academica
  protected String institu;//instituicao de vinculo
  protected int senha;
  public pessoas(int cpf,String nome,String titul,String institu,int senha){//erro no titu
    this.cpf = cpf;
    this.nome = nome;
    this.titul = titul;
    this.institu = institu;
    this.senha = senha;
  }
}
  