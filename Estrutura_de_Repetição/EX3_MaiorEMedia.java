package Estrutura_de_Repetição;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class EX3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count=0;
        int maior = 0;
        int soma=0;


        do {
            System.out.println("Digite o Número: ");
            numero = scan.nextInt();
            count = count + 1;
            soma = soma + numero;

            if (numero > maior) maior = numero;

        } while (count < 5);

        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("A média dos números digitados foi: " + (soma/5));

    }


}
