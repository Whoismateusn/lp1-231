package semana06.exercicios.ex02;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira sua altura em metros: ");
        float altura = sc.nextFloat();
        System.out.print("Insira seu peso em Kg: ");
        float peso = sc.nextFloat();
        
        sc.close();

        float imc = calculadoraIMC.calcularImc(altura, peso);
        int classificacao = calculadoraIMC.classifacarImc(imc);
        System.out.println("Você esta em " + calculadoraIMC.CLASSIFICACAO[classificacao]);
        
        if (imc < calculadoraIMC.IMC_IDEAL_MINIMO ) 
            System.out.printf("Você precisa ganhar aproximadamente %.3f \n", calculadoraIMC.calcularPesoIdeal(imc, altura, peso));
        else if (imc > calculadoraIMC.IMC_IDEAL_MAXIMO) 
            System.out.printf("Você precisa perder aproximadamente %.3f \n", calculadoraIMC.calcularPesoIdeal(imc, altura, peso));
    }
}

