/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.project_prova;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Davi Guedes
 */
public class Project_prova {                
  public static void main(String[] args) {

    List cpfcad = new ArrayList();//criação da lista de cpfs
    cpfcad.add("10023764599");
    cpfcad.add("20023764599");
    cpfcad.add("30023764599");

        List senhascad = new ArrayList();//criação da lista de senhas
    senhascad.add("10023");
    senhascad.add("64599");
    senhascad.add("23764");
    
    List cpfval = new ArrayList();//criação da lista de validacao para cpf

    List senhasval = new ArrayList();//criação da lista de validacao para senhas
    
        System.out.println("Por favor digite um numero de 1 a 15");
    
    System.out.println("----------------------");
    
     System.out.println("Fazer login");// O usuario deve digitar seu CPF e senha
    
     System.out.println("Inscrever participante");//O usuario fornece os dados e a inscricaoao fica pendente na validacao

    
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
    
     System.out.println("Listar participantes do evento em ordem alfabetica");
    
      System.out.println("sair");

    Scanner ler = new Scanner(System.in);
    int n = ler.nextInt();//numero da opcao de 1 a 15
    switch(n){
      case 1 -> {
          Scanner lercpf = new Scanner(System.in);
          Scanner lersenha = new Scanner(System.in);
          String ncpf = lercpf.nextLine();
          String nsenha = lersenha.nextLine();
          if(!senhascad.contains(nsenha)||!cpfcad.contains(ncpf)){
              System.out.println("Cadastro invalido!");
          }else{//confirma se a senha e o cpf estao corretos
              System.out.println("Cadastro validado!");
          } }

      case 2 -> {
          Scanner lercpf = new Scanner(System.in);
          Scanner lersenha = new Scanner(System.in);
          String  ncpf = lercpf.nextLine();
          String nsenha = lersenha.nextLine();
          cpfval.add(ncpf);//adiciona os valores para uma lista temporaria até que sejam aceitos ou não
          senhasval.add(nsenha);//adiciona os valores para uma lista temporaria até que sejam aceitos ou não
          System.out.println("Inscrição solicitada!");
          }
      case 3 -> {//falta adicionar exclusividade para o general chair
          cpfcad.add(cpfval);//adiciona os elementos solicitados para a lista de cadastros
          senhascad.add(senhasval);//adiciona os elementos solicitados para a lista de cadastros
          cpfcad.clear();//apaga todas as solicitações da lista
          senhascad.clear();//apaga todas as solicitações da lista
          System.out.println("Inscrição validada!");
          }
      case 4 -> {//falta adicionar exclusividade para o general chair
          cpfcad.clear();//apaga todas as solicitações da lista
          senhascad.clear();//apaga todas as solicitações da lista
          System.out.println("Inscrição invalidada!");
          }
      case 5 -> {
          }
      case 6 -> {
          }
      case 7 -> {
          }
      case 8 -> {
          }
      case 9 -> {
          }
      case 10 -> {
          }
      case 11 -> {
          }
      case 12 -> {
          }
      case 13 -> {
          }
      case 14 -> {
          }
      case 15 -> {
          }
        
      default -> System.out.println("Numero invalido");
      }
     }
}
