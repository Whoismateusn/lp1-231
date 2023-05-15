package semana03;

import java.util.Scanner;

public class Introducao {
    
    public static void main(String[] args) {
        // Comentário de 1 linha

        /*
         *  Coementário de várias linhas
         */

         // Tipos Primitivos
         // Inteiros
         // byte, short, int, long

         byte n1 = 100; //1 byte - -128 a 127
         short n2 = 3000; // 2 bytes - -32768 a 32767
         int n3 = 321321321; // 4 bytes- 2 bilhões
         long n4 = 3232323232L; //8 bytes
     
         // Ponto Flutuante
         float nota1 = 10.34343f; // 4 bytes
         double nota2 = 10.3434343; // 8 bytes

         //char
         char letra = 'A';

         //boolean
         boolean ligado = true;
         boolean teste = false;

         //String (mais complexo que usa tipos primitivos, começa com maiúscula = classe)
         String nome = "João da Silva";
         System.out.println(nome);
         System.out.println(nome.toLowerCase());
         System.out.println(nome.toUpperCase());

         // Variáveis e constantes
         int idade = 20;

         int idade2;
         idade2 = 20;
         
         //Java 10 - inferencia de tipo com var
        var idade3 = 15;
        var nome2= "Maria";

        //curiosidade: var ex = new IllegalArgumentException()

        // Constante - keyword final
        final double TESTE = 20.2;
        final double PI = 3.14;

        // Entrada e saída de dados

        // Entrada - Classe Scanner
        // Saída - System,out

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o seu nome");
        String nomeInformado = sc.nextLine();

        System.out.println("Entre com a sua idade");
        int idadeInformada = sc.nextInt();

        System.out.println(nomeInformado + " " + idadeInformada);
        System.out.printf("%s %d \n", nomeInformado, idadeInformada);


        sc.close();

    }
}
