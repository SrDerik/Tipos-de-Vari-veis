/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiposprimitivos2;

/**Eu Derik S. estou fazendo meu primeiro algoritmo
 *
 * @author FATEC ZONA LESTE
 */
public class TiposPrimitivos {
    public static void main(String[] args){
       // Lê o que está dentro da variável primitiva
       byte idade = 25;  // Recebe 2 valores, é necessário fechar com ; ;Armazena números pequenos (-128 a 127)
       short ano =2024; //Pode ter até 4 casas(como um ano), ficha com ;Armazena valores um pouco maiores (-32.768 a 32.767)
       int populacaoCidade = 500000; //Variável inteira recebe números inteiros ;Tipo Mais comum para números inteiros
       long populacaoMundial = 8000000000L; //Necessário'L' para valores longos
       
       float altura = 1.75f; //Pode colocar números com casa decimal, tem que usar o . ;Necessário 'F' para indicar
       double peso = 72.5; //Pode colocar números com casa decimal, tem que o . ;Mais preciso que float
       
       char inicial = 'J'; //Armazena um único caractere, tem que usar aspas
       boolean ativo = true; //Armazena dois valores, sendo eles verdadeiros ou falsos
       
       //Exibição dos valores
       System.out.println ("Idade: " + idade ); //É necessário usar aspas duplas "
       System.out.println ("Ano: " + ano ) ;
       System.out.println ("População da cidade: " + populacaoCidade) ;
       System.out.println ("População mundial: " + populacaoMundial) ;
       System.out.println ("Altura: " + altura + "m") ;
       System.out.println ("Peso: " + peso + "kg") ;
       System.out.println ("Inicial do nome: " + inicial) ; 
       System.out.println ("Está ativo?" + ativo) ;
    }
}