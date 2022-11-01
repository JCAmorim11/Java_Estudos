package org.example;

import java.util.Scanner;

public class ex3_media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma=0;
        for(int i=0; i<5;i++){
            System.out.println("Número:");
            numero = scan.nextInt();
            if(i==0) maior = numero;
            System.out.println(maior);
            soma = numero+soma;
           if(numero > maior) maior = numero  ;
        }
        System.out.println("Maior: "+maior);
        System.out.println("Media: "+soma/5);
    }
}
