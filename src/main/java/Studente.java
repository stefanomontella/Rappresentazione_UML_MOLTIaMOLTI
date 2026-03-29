import java.util.ArrayList;

public class Studenti {
    private String nome;
    private String cognome;
    private String matricola;
    ArrayList<Esami> esamiConseguiti;

    public Studenti(String nome, String cognome, String matricola){
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
        this.esamiConseguiti = new ArrayList<>();
    }

}
