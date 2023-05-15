package semana04;
import java.util.Scanner;

public class exercicio2 {
    
//EXERCÍCIO 2: Escreva um programa em Java que solicita ao usuário três números e apresenta a média aritmética dos números informados.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o 1o número:");
        float primeiroNum = sc.nextFloat();
        System.out.println("Insira o 2o número:");
        float segundonum = sc.nextFloat();
        System.out.println("Insira o 3o número:");
        float terceiroNum = sc.nextFloat();

        float mediaAritmetica = (primeiroNum + segundoNum + terceiroNum)/3;

        System.out.println("A média aritimética é:" + media);
        sc.close();
    }
}
}
