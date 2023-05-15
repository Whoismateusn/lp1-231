package semana04;
import java.util.Scanner;

public class exercicio4 {
   
/*O código identificador de funcionários de uma empresa contém 7 caracteres, inicia com a sequência de caracteres BR, em seguida 
apresenta um número inteiro entre 0001 e 9999 e finaliza com o caractere X. Crie um programa em Java que solicita ao usuário um 
identificador e apresenta se o que foi informado é um valor válido ou inválido. */  
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá! Por favor, escreva seu código de identificação:");
        String identificacao = sc.nextLine();
        char terceiroChar = identificacao.charAt(2);
        char quartoChar = identificacao.charAt(3);
        char quintoChar = identificacao.charAt(4);
        char sextoChar = identificacao.charAt(5);

        if (identificacao.length() == 7 && identificacao.startsWith("BR") && identificacao.endsWith("X") && Character.isDigit(terceiroChar) && Character.isDigit(quartoChar) && Character.isDigit(quintoChar) && Character.isDigit(sextoChar)){
            System.out.println("Código de identificação é válido!");
        } else {
            System.out.println("Código de identificação inválido!");
        }
        sc.close();
    }
}
}
