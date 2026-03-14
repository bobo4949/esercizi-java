/*
Esercizio 5 – Classi e oggetti

Crea una classe Persona con due attributi:
nome
eta
Aggiungi un metodo presentati() che stampi:
Ciao, mi chiamo Marco e ho 30 anni
Nel main crea due oggetti Persona, assegna loro valori agli attributi e chiama il metodo presentati() per entrambi. */


class Persona{
    String nome;
    int eta;
    
    void presentati(){
        System.out.println("ciao, mi chiamo "+nome+" e ho "+eta);
    }
}


public class es5 {
    public static void main(String[] args){
        Persona p1 = new Persona();
        p1.nome = "Nicolò"; 
        p1.eta = 17;

        Persona p2 = new Persona();
        p2.nome = "Nicola"; 
        p2.eta = 17;

        p1.presentati();
        p2.presentati();
    }


}
