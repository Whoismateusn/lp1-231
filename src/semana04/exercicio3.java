package semana04;
import java.util.Scanner;

public class exercicio3 {

/* Crie um programa em Java que recebe como entrada o valor de uma compra e apresenta como saída o valor final com desconto e o desconto
 aplicado com base nas seguintes regras:
    Compras entre R$ 0,01 e R$ 9,99 - 0% de desconto
    Compras entre R$ 10,00 e R$ 99,99 - 5% de desconto
    Compras entre R$ 100,00 e R$ 499,99 - 10% de desconto
    Compras iguais ou superiores a R$ 500,00 - 15% de desconto */ 


        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor da compra:");
        double valorCompra = sc.nextDouble();

        if (valorCompra <= 9.99) {
            System.out.println("Ooops... Que pena! Você não ganhou nenhum desconto" + valorCompra);
        }

        if (valorDaCompra >= 10 && valorDaCompra <= 99.99) {
            double descontoUm = valorCompra - (valorCompra * 0.05);
            System.out.println("Você ganhou 5% de desconto!" + primeiroDesconto);
        }

        if (valorDaCompra >= 100 && valorDaCompra <= 499.99) {
            double descontoDois = valorCompra - (valorCompra * 0.10);
            System.out.println("Você ganhou 10% de desconto!" + descontoDois);
        }

        if (valorDaCompra >= 500.00) {
            double descontoTres = valorDaCompra - (valorDaCompra * 0.15);
            System.out.println("Você ganhou 15% de desconto!" + descontoTres);
        }
        sc.close();
    }

}
}
