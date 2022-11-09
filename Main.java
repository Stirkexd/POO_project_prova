import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Main {
  Scanner ler = new Scanner(System.in);
  Scanner lercpf = new Scanner(System.in);
  Scanner lersenha = new Scanner(System.in);
  int n;//numero da opcao de 1 a 15
  String ncpf;//vai ler o cpf na primeira opcao
  String nsenha;//vai ler a senha na segunda opcao
  public static void main(String[] args) {

    List cpfcad = new ArrayList();//criação da lista de cpfs
    cpfcad.add("10023764599");
    cpfcad.add("20023764599");
    cpfcad.add("30023764599");

        List senhascad = new ArrayList();//criação da lista de senhas
    senhascad.add("10023");
    senhascad.add("64599");
    senhascad.add("23764");
    
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
      ncpf = lercpf.nextInt();
      nsenha = lersenha.nextInt();  
        if(senhascad.contains(nsenha)&&ncpf.contains(ncpf)){//confirma se a senha e o cpf estao corretos
      nsenha.contains();
      ncpf.contains();         
      }else{
          System.out.println("Cadastro invalido!");
      }
 
      break;
      case 2:
  ncpf = lercpf.nextInt();
  cpfcad.add(ncpf);//cadastra um novo cpf
  nsenha = lersenha.nextInt();
  senhascad.add(nsenha);//cadastra uma nova senha      
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
