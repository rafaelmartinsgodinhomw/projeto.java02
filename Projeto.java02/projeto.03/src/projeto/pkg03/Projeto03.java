/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.pkg03;

/**
 *
 * @author aluno
 */
public class Projeto03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        if (condição booleana)
        
        */
        
        int idade = 15;
        if (idade < 18){
            System.out.println("Menor idade!");
            
        }
        else {
            System.out.println("Maior idade!");
        }
        //operadores logicos
        // E && (conjucao)
       // OU || (disjuncao)
       boolean amigoDoDono = true;
       if (idade < 18 && amigoDoDono == false){
           System.out.println("Menor Idade. Entrada Poibida.");
       }
       else {
           System.out.println("Pode entrar");
       }
         }
    //operador de igualdade (==)
       int mes = 1;
       if (mes == 1){
            System.out.println("Janeiro");
}
       else{
            System.out.println("Tempo de Trabalhar!");
}
