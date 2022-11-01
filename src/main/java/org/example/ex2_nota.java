package org.example;

import java.util.Scanner;

public class ex2_nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;
        System.out.print("Digite a nota: ");
        nota = scan.nextInt();

        while(nota<0| nota>10){
           System.out.println("Nota invalida!\nA nota precisa estar entre 0 a 10");
           System.out.print("Digite uma nota valida: ");
           nota = scan.nextInt();
        }
    }
}
