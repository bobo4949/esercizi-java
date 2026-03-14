
/*Esercizio 7 – Incapsulamento

Modifica la classe Persona rendendo gli attributi nome ed eta private.

Aggiungi i metodi:
getNome()
setNome(String nome)
getEta()
setEta(int eta)
Il metodo setEta deve impedire di impostare un'età negativa.

Nel main crea un oggetto Persona e usa i metodi getter e setter per leggere e modificare i dati. */

class Persona {
    
    private String nome;
    private int eta;

    
    public Persona(String nome, int eta) {
        this.nome = nome;
        setEta(eta); 
    }

    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        if (eta >= 0) {
            this.eta = eta;
        } else {
            System.out.println("Errore: l'età non può essere negativa!");
        }
    }
}

 
public class es7 {
    public static void main(String[] args) {
        
        Persona persona = new Persona("Mario", 25);

        
        System.out.println("Nome: " + persona.getNome());
        System.out.println("Età: " + persona.getEta());

     
        persona.setNome("Luigi");
        persona.setEta(30);

        System.out.println("Nome aggiornato: " + persona.getNome());
        System.out.println("Età aggiornata: " + persona.getEta());

       
        persona.setEta(-5); 
    }
}



