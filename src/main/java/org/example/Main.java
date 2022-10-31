package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;

      /*  do{
            System.out.println("Digite seu nome:");
            nome = scan.next();
            System.out.println("Digite sua idade");
            idade = scan.nextInt();
        } while (!nome.equals("0"));*/

        while(true){
            System.out.println("Digite seu nome:");
            nome = scan.next();
            if(!nome.equals("0")) break;
            System.out.println("Digite sua idade");
        }

    }
}