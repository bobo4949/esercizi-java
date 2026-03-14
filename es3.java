/*Esercizio 3 – Input da tastiera

Scrivi un programma Java che:
chieda all’utente di inserire il proprio nome
chieda all’utente di inserire la propria età
stampi una frase nel formato:
Ciao Luca, hai 25 anni
Usa la classe Scanner per leggere l’input da tastiera. */

import java.util.Scanner;
public class es3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();

        System.out.print("Inserisci la tua età: ");
        int eta = scanner.nextInt();

        System.out.println("Ciao " + nome + ", hai " + eta + " anni");

        scanner.close();
    }
}