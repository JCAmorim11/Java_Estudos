package org.example;

import java.util.Scanner;

public class ex5_tabuada {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tabu;
        System.out.println("Tabuada: ");
        tabu = scan.nextInt();
        for(int i=1; i<11;i++){
            System.out.println(tabu+" X "+i+"= "+(i*tabu));
        }
    }

}
