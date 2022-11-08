public class  Pessoas{//eu tentei usar abstract mas nao deu erro
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
  public void menu(){
    System.out.println("Por favor digite um numero de 1 a 15");
    
    System.out.println("----------------------");
    
     System.out.println("Fazer login");
    
     System.out.println("Inscrever participante");
    
     System.out.println("Validar inscricao de participante");
    
      System.out.println("Invalidar inscricao de participante");
    
      System.out.println("Emitir certificado para participante");
    
      System.out.println("Submeter artigo");
    
      System.out.println("Enviar avaliacao de artigo");
    
      System.out.println("Ver avaliacoes de um artigo");
    
      System.out.println("Aceitar artigo");
    
      System.out.println("Rejeitar artigo");
    
      System.out.println("Listar artigos aceitos em ordem alfabetica");//Pode ser executado por qualquer pessoa
    
      System.out.println("Listar artigos negados em ordem alfab´etica");//Pode ser executado por qualquer pessoa
    
      System.out.println("Ver dados de um artigo");//Pode ser executado por qualquer pessoa
    
     System.out.println("Listar participantes do evento em ordem alfab´etica");
    
      System.out.println("sair");
  } 
}
  
