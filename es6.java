
/*
Esercizio 6 – Costruttori

Modifica la classe Persona aggiungendo un costruttore che riceva nome ed eta come parametri e inizializzi gli attributi.

Nel main crea due oggetti Persona usando il costruttore e chiama il metodo presentati(). */
class Persona{
    String nome;
    int eta;

    Persona(String nome, int eta){
        this.nome = nome;
        this.eta = eta;
    }

    void presentati(){
        System.out.println("Ciao, mi chiamo " + nome + " e ho " + eta + " anni");
    }
}

public class es6 {
    public static void main(String[] args){

        Persona p1 = new Persona("Nicolò",17);
        Persona p2 = new Persona("Nicola",17);

        p1.presentati();
        p2.presentati();
    }
}