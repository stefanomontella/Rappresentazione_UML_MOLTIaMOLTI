import java.util.ArrayList;

public class Studente {
    private String nome;
    private String cognome;
    private String matricola;
    ArrayList<Esame> esameConseguito;

    public Studente(String nome, String cognome, String matricola){
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
        this.esameConseguito = new ArrayList<>();
    }

    public void esameSuperato(int voto, Esame esameSuperato){

        if(voto>=18){
            this.esameConseguito.add(esameSuperato);
            esameSuperato.studenteCandidato(this);
        }
    }

    public void rimuoviEsame(Esame esame) {
        if (this.esameConseguito.contains(esame)) {
            this.esameConseguito.remove(esame);
            esame.rimuoviStudente(this);

            System.out.println("Relazione eliminata da entrambi i lati.");
        }
    }

    public String getNome(){
        return this.nome;
    }

    public String getCognome(){
        return this.cognome;
    }

    public String getMatricola(){
        return this.matricola ;
    }

}
