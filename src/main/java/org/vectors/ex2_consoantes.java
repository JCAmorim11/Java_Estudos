package org.vectors;

import java.util.Scanner;

public class ex2_consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qntc = 0, count=0;


        do{
            System.out.println("Letra: ");
            String letra = scan.next();

            if( !(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                consoantes[count] = letra;
                qntc++;
            }
            count++;
        }while (count < consoantes.length);

        for (String con: consoantes) {
           if( con != null) System.out.print(con+" ");
        }

        System.out.println("\nQuantidade de consoantes: "+ qntc);
    }
}
