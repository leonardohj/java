import java.util.Scanner;

public class Exercicio1 {

    public static int numeroSeguinte(int numero){
        return numero + 1;
    }

    public static String juntarNome(String nome, String apelido){
        return nome.concat(" " + apelido);
    }

    public static int maior(int[] numeros) {
        int maior = 0;
        int i = 0;
        while (i < 5)
        {
            if (numeros[i] > numeros[i++])
            {
                maior = numeros[i];
            }
            else
            {
                maior = numeros[i++];
            }
            i++;
        }
        return maior;
    }

    public static int soma(int[] numeros){
        int soma = 0;
        for(int i = 0; i < 5; i++)
        {
            soma += numeros[i];
        }
        return soma;
    }

    public static double media(double[] numeros2){
        double soma = 0;
        for(int i = 0; i < 5; i++)
        {
            soma += numeros2[i];
        }
        return soma / 5;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 2;
        numero = numeroSeguinte(numero);
        System.out.println("Insere o teu nome!");
        String nome = scanner.next();
        System.out.println("Insere o teu apelido!");
        String apelido = scanner.next();
        int[] numeros = new int[5];
        double[] numeros2 = new double[5];
        System.out.println("Insere 5 numeros!");
        for(int i = 0; i < 5; i++)
        {
            numeros[i] = scanner.nextInt();
            numeros2[i] = numeros[i];
        }
        int soma = soma(numeros);
        int maior = maior(numeros);
        String nomeCompleto = juntarNome(nome, apelido);
        double media = media(numeros2);

        System.out.println("Numero seguinte: " + numero + "\nNome Completo: " + nomeCompleto + "\nSoma: " + soma + "\nMédia: " + media + "\nMaior : " + maior);
        scanner.close();
    }

}