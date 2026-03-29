import java.util.ArrayList;

public class Esame {
    private String nomeCorso;
    ArrayList<Studente> studenteEsaminato;

    public Esame(String nomeCorso){
        this.nomeCorso = nomeCorso;
        this.studenteEsaminato = new ArrayList<>();
    }

    public void studenteCandidato(Studente studente){
        if(!this.studenteEsaminato.contains(studente)) {
            this.studenteEsaminato.add(studente);
        }
    }

    public void rimuoviStudente(Studente studente){
        this.studenteEsaminato.remove(studente);
    }

    public void listaSuperati() {
        if (!this.studenteEsaminato.isEmpty()) {
            System.out.println("-----------------------");
            System.out.println("LISTA DEL CORSO STUDENTI PROMOSSI:  " + nomeCorso);
            for (Studente elementi : this.studenteEsaminato) {
                System.out.println("NOME: " + elementi.getNome() + ", COGNOME: " + elementi.getCognome() + ", MATRICOLA: " + elementi.getMatricola());
            }
        } else {
            System.out.println("-----------------------");
            System.out.println("CORSO: " + nomeCorso +  " - Nessun studente ha passato l'esame");
        }
    }
}
