package semana07;

public class exerciciorevisao {

    // 1. Escreva um método estático em Java que recebe três parâmetros double e devolve a soma dos valores.

    public static double somar(double a, double b, double c){
        return a+ b + c;
    }

    /*2. Escreva um método estático em Java que recebe três parâmetros double e devolve a média aritmética 
    simples dos valores.*/

    public static double somar(double a, double b, double c){
        return (a+ b + c)/ 3;
    }

    //3. Escreva um método estático em Java que recebe três parâmetros int e devolve o maior valor.

    public static int numMaior(int a, int b, int c){
        int maior = 0;
        if (a > b && a > c) {
            maior = a;      
        } else if (b > a && b > c){
            maior = b;
        } else if (c > a && c > b){
            maior = c;
        }  
        return maior;
    }

    //4. Escreva um método estático em Java que recebe três parâmetros int e devolve o menor valor.
    public static int numMenor(int a, int b, int c){
        int menor = 0;
        if (a < b && a < c) {
            menor = a;      
        } else if (b < a && b < c){
            menor = b;
        } else if (c < a && c < b){
            menor = c;
        }  
        return menor;
    }

    /*5. Escreva um método estático em Java que recebe três parâmetros double devolve um array com 
    os valores passados nos parâmetros.*/

    public static double fazerArrayDeTresValores(double a, double b, double c) {
        double arrayDeTresValores = {a, b, c};
        return arrayDeTresValores;
    }

    //6. Escreva um método estático em Java que recebe um array de double e devolve a soma dos valores.

    public static double somarArray(double[] array) {
        return Arrays.stream(array).sum();
    }

    //7. Escreva um método estático em Java que recebe um array de double e devolve a média aritmética.

    public static double calcularMediaAritimetica(double[] array) {
        return exerciciorevisao.somarArray(array)/array.length;
    
    }

    //8. Escreva um método estático em Java que recebe um array de double e devolve o maior valor.

    public static double acharMaiorValor(double[] array) {
        Arrays.sort(array);
        return array[array.length-1];
    }

    //9. Escreva um método estático em Java que recebe um array de double e devolve o menor valor.

    public static double acharMenorValor(double[] array) {
        Arrays.sort(array);
        return array[0];
    
    }

    /*10. Escreva um método em Java que recebe dois array de inteiros e devolve um array com todos 
    os elementos do primeiro e do segundo array.*/

    public static int[] juntarDoisArrays(int[] array1, int[] array2) {
        int[] array = new int [(array1.length + array2.length)];
        for (int i = 0, j = 0; i < arr.length-1; i=+2, j++) {
            array[i] = array1[j];
            array[i+1] = array2[j];
        }
        return array; 
    }
}
