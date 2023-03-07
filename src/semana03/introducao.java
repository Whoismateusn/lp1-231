package semana03;
 
public class introducao{

    public static void main (String[] args){
        // comentario de uma linha

        /*comentarios de varias linhas
         * linhas
         */

         // tipos primitivos
         // inteiros
         // byte, short, int, long

        byte n1 = 100; // 1 byte -128 a 127
         short n2 = 3000; // 2 bytes-32768 a 32767
         int n3 = 321312321; // 4 bytes 2 bi
         long n4 = 3232323232l; // 8 bytes

        // ponto flutuante 
        float nota1 = 10.34343f; // 4 bytes
        double nota2 = 10.3434343;  // 8 bytes

        //char
        char letra =  'A';

        // BOOLEAN 
        Boolean ligado = true;
        Boolean teste = false;

        // string
        String nome =  "João da Silva";
        System.out.println(nome);
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
    }
}
    