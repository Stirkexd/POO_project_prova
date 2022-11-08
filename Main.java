import java.util.Scanner;
class Main {
  Scanner ler = new Scanner(System.in);
  int n;
  public static void main(String[] args) {
        System.out.println("Por favor digite um numero de 1 a 15");
    
    System.out.println("----------------------");
    
     System.out.println("Fazer login");// O usuario deve digitar seu CPF e senha
    
     System.out.println("Inscrever participante");//O usu´ario fornece os dados e a inscricaoao fica pendente na validacao

    
     System.out.println("Validar inscricao de participante");//exclusivo para o general chair
    
      System.out.println("Invalidar inscricao de participante");//exclusivo para o general chair
    
      System.out.println("Emitir certificado para participante");//exclusivo para o general chair
    
      System.out.println("Submeter artigo");//Um dos autores fornece os dados do artigo, os seus proprios dados e os dados dos demais autores do trabalho

    
      System.out.println("Enviar avaliacao de artigo");//exclusivo para revisores
    
      System.out.println("Ver avaliacoes de um artigo");// O program chair pode ver todas as avaliacoes de todos os artigos. Um revisor pode ver apenas as suas avaliacoes para os artigos que ele analisou. Um autor pode ver todas as avaliacoes para os seus artigos

      System.out.println("Aceitar artigo");//exclusivo para o general chair
    
      System.out.println("Rejeitar artigo");//exclusivo para o general chair
    
      System.out.println("Listar artigos aceitos em ordem alfabetica");//Pode ser executado por qualquer pessoa
    
      System.out.println("Listar artigos negados em ordem alfab´etica");//Pode ser executado por qualquer pessoa
    
      System.out.println("Ver dados de um artigo");//Pode ser executado por qualquer pessoa
    
     System.out.println("Listar participantes do evento em ordem alfab´etica");
    
      System.out.println("sair");

    n = ler.nextInt();
    switch(n){
      case 1:

      break;
      case 2:

      break;
      case 3:

      break;
      case 4:

      break;
      case 5:

      break;
      case 6:

      break;
      case 7:

      break;
      case 8:

      break;
      case 9:

      break;
      case 10:

      break;
      case 11:

      break;
      case 12:

      break;
      case 13:

      break;
      case 14:

      break;
      case 15:

      break;
        
      default:
        System.out.println("Numero invalido");
    }
  }
    
}
