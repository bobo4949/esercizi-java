/*Esercizio 4 – Metodi

Scrivi una classe Main che contenga un metodo statico:


somma(int a, int b)


Il metodo deve restituire la somma dei due numeri.

Nel main chiama il metodo con due numeri e stampa il risultato. */

public class es4{

    public static int somma(int a, int b){

        return a+b;
    }
    public static void main(String[] args){

        int soma = somma(5,3);

        System.out.println(soma);

    }
}