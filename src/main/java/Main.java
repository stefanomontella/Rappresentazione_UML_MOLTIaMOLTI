import java.util.ArrayList;

public class Main {
    public static void main (String[] args){

        Studente DE1000452 = new Studente("Mario", "Rossi", "DE1000452");
        Studente DE1000816 = new Studente("Luca", "Verdi", "DE1000816");
        Studente DE1000671 = new Studente("Giovanni", "Bianchi", "DE1000671");

        Esame POO = new Esame("Programmazione a Oggetti");
        Esame BD = new Esame("Basi Di Dati");
        Esame Analisi = new Esame("Analisi - I");

        DE1000452.esameSuperato(28, POO);
        DE1000816.esameSuperato(30, POO);
        DE1000671.esameSuperato(15, POO);

        DE1000671.esameSuperato(24,BD);

        POO.listaSuperati();
        BD.listaSuperati();
        Analisi.listaSuperati();

    }
}
