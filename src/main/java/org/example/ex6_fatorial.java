package org.example;

import java.util.Scanner;

public class ex6_fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fat = scan.nextInt();

        for(int i=fat-1; i>0;i--){
            fat *= i;
        }
        System.out.println(fat);
    }
}
