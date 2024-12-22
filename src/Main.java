
//Faça um programa que imprima na tela a soma dos 10 primeiros números
//naturais
//1 - Fazer algo 10 vezes
//2 - Armazenar a soma em uma variável
public class Main {
    public static void main(String[] args) {

        int i =0;
        int soma = 0;

        while(i < 10){
            //System.out.println("Valor atual da soma: " + soma);
            //System.out.println("Valor atual de i: " + i);
            soma = soma + i;
            //System.out.println("Valor novo da soma: " + soma);
            //System.out.println();
            i++;
        }
        System.out.println("A soma dos 10 primeiros naturais é: " + soma);

    }
}