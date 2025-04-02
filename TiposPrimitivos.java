/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tiposprimitivos;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Lê o que está dentro da variável 
       byte idademedia = 16;  // Recebe até 2 valores.                                                                                   ;Explicação do professor:"Armazena números pequenos (-128 a 127)"
       short anodeNascimento =2009; //Pode ter até 4 casas(como um ano).                                                                        ;Explicação do professor:"Armazena valores um pouco maiores (-32.768 a 32.767)"
       int acessosaoCanal =2600000 ; //Variável inteira recebe números inteiros.                                                    ;Explicação do professor:"Tipo Mais comum para números inteiros"
       long acessosaoYoutube = 2490000000L; //Necessário'L' para valores longos                                                     ;Explicação do professor:
       
       float alturaMediadoTelespectador = 1.78f; //Pode colocar números com casa decimal, tem que usar o F, . e , (;)                                   ;Explicação do professor:"Necessário 'F' para indicar"
       double pesoMediodoTelespectador = 56.4; //Pode colocar números com casa decimal e é mais preciso que o 'float', tem que o . e , (;)              ;Explicação do professor:"Mais preciso que float"
       
       char inicialdoCanal = 'V'; //Armazena um único caractere, tem que usar aspas
       boolean canalAtivo = true; //Armazena dois valores, sendo eles verdadeiros ou falsos
       
       //Exibição dos valores
       System.out.println ("Idade média: " + idademedia ); //É necessário usar aspas duplas "
       System.out.println ("Ano de nascimento: " + anodeNascimento ) ;
       System.out.println ("Acessos ao Canal: " + acessosaoCanal) ;                                                                                      // TUDO FECHA COM ;           
       System.out.println ("Acessos ao Youtube: " + acessosaoYoutube) ;
       System.out.println ("Altura média do telespectador: " + alturaMediadoTelespectador + "m") ;
       System.out.println ("Peso médio do telespectador: " + pesoMediodoTelespectador + "kg") ;
       System.out.println ("Inicial do canal: " + inicialdoCanal) ; 
       System.out.println ("Está ativo na plataforma?" + canalAtivo) ;
    }
    
}
