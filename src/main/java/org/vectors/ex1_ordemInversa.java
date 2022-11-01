package org.vectors;


public class ex1_ordemInversa {
    public static void main(String[] args) {
        int[] vetor = {7,88,-90,100,34,2};

        System.out.print("Vetor: ");
        int count=0;
        while(count <(vetor.length)){
            System.out.print(vetor[count]+" ");
            count++;
        }
        System.out.println("\nvetor reverso: ");
        for(int i = (vetor.length -1); i>0; i--){
            System.out.print(vetor[i]+" ");
        }
    }
}
