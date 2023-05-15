package semana05;
import java.util.Scanner;

public class exercicioAquario {

/*Ex01. Crie um programa em Java que recebe como entrada o comprimento, altura e a largura de um aquário e calcule as seguintes
informações.*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o comprimento do aquário: ");
        int c = sc.nextInt();

        Scanner sal = new Scanner(System.in);
        System.out.println("Qual a altura do aquário: ");
        int a = sc.nextInt();

        Scanner sl = new Scanner(System.in);
        System.out.println("Qual a largura do aquário: ");
        int l = sc.nextInt();

        Scanner sd = new Scanner(System.in);
        System.out.println("Qual a temperatura desejada do aquário: ");
        int td = sc.nextInt();

        Scanner sa = new Scanner(System.in);
        System.out.println("Qual a temperatura ambiente do aquário: ");
        int ta = sc.nextInt();
        
        double v = (c * a * l) / 1000;
        System.out.println("O volume do aquario é:" + v);

        double p = v * 0.05 * (td - ta);
        System.out.println("A potência do termostato é:" + p);

        double f = v * 2;
        System.out.println("A quantidade de filtragem é:" + f);

        
        scan.close();
    }

}