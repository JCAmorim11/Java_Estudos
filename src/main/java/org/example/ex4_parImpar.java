package org.example;

import java.util.Scanner;

public class ex4_parImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qntNumeros, i=0, numero, qntPares=0, qntImpares=0;
        System.out.println("Quantidade de número: ");
        qntNumeros = scan.nextInt();

        do{
            System.out.print("número: ");
            numero = scan.nextInt();

            if(numero%2==0) qntPares++;
            else qntImpares++;
            i++;
        }while (qntNumeros > i);
        System.out.println("número pares: "+qntPares);
        System.out.println("número impares: "+qntImpares);


    }
}
