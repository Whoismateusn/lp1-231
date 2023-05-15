package semana04;
import java.util.Scanner;

public class exercicio1 {

 //EXERCÍCIO 1: Escreva um programa em Java que solicita ao usuário um número inteiro e apresenta seu antecessor e sucessor.
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um  número inteiro");
        int num = sc.nextInt();
        int numAntecessor = num - 1;
        int numSucessor = num + 1;

        System.out.println("Antecessor: " + numAntecessor);
        System.out.println("Sucessor: " + numSucessor);

        sc.close();
    }
    }