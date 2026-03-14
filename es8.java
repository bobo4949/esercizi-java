

public class Persona{

    int id;

    public void presentati(){
System.out.println();

    }

}

public class Studente extends Persona{

int matricola;

public void presentati(){
    System.out.println("override");

}

}

public class es8 {
    public static void main(String[] args) {
        Studente studente = new Studente();
        studente.presentati();
    
    }
}
