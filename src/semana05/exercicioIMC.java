package semana05;
import java.util.Scanner;

public class exercicioIMC {

/*Ex02. Utilizando as diretrizes de Índice de Massa Corporal (IMC) da Organização Mundial de Saúde (OMS), crie uma calculadora em Java 
que solicita ao usuário seu peso (Kg) e sua altura (m) e apresenta em qual classificação o indivíduo se encaixa. Além disso, o programa
deve apresentar quanto o indivíduo precisa perder ou ganhar de peso para chegar no peso normal (imc = 24,9).*/
    public static void main(String[] args) {
        

        Scanner speso = new Scanner(System.in);
        System.out.println("Qual o seu peso(Kg): ");
        float peso = speso.nextFloat();

        Scanner saltura = new Scanner(System.in);
        System.out.println("Qual a sua altura(m): ");
        float altura = saltura.nextFloat();

        float IMC = peso / (altura * altura);
        System.out.println("Seu IMC é:" + IMC);
        System.out.println("Você deverá ganhar:");
        System.out.println("Você deverá perder:");

        if (IMC <= 18.5) {                       
            System.out.println("Baixo peso");
        } else if (IMC > 18.5 && IMC <= 24.9 ) {
            System.out.println("Peso Normal");
        } else if (IMC >= 25.0 && IMC <= 29.9 ){
            System.out.println("Excesso de peso");
        } else if (IMC >= 30.0 && IMC <= 34.9 ){
            System.out.println("Obesidade de Classe 1");
        } else if (IMC >= 34.9 && IMC <= 39.9 ){
                System.out.println("Obesidade de Classe 1");
        } else if (IMC >= 40.0)  {
            System.out.println("Obesidade de Classe 3");
        }

        double IMCideal = peso - (24.9 * altura * altura);

        if( IMCideal< 0) {
            System.out.printf("\n\nVocê precisa ganhar %.1fkg para chegar ao peso ideal\n", Math.abs(IMCideal));

        } else if(IMCideal >= 0) {
            System.out.printf("\n\nVocê precisa perder %.1fkg para chegar ao peso ideal\n", Math.abs(IMCideal));
        }

        scan.close();
    }
}

