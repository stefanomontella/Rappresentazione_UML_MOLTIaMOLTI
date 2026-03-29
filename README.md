<img width="1156" height="698" alt="image" src="https://github.com/user-attachments/assets/86009c5b-21e4-4d66-8137-80a0ba179804" />


🎯 **Obiettivi del Progetto**

Il codice dimostra come gestire in memoria una relazione complessa di tipo **Molti-a-Molti (N:N)** tra entità indipendenti, applicando i seguenti concetti chiave di Programmazione a Oggetti:

* **Associazione Bidirezionale:** Ogni `Studente` conosce i propri esami superati e ogni `Esame` mantiene traccia degli studenti promossi, garantendo la coerenza dei dati su entrambi i lati.
* **Logica di Controllo:** Validazione del voto (maggiore o uguale a 18) prima dell'inserimento in carriera.
* **Sincronizzazione degli Oggetti:** Utilizzo della parola chiave `this` per collegare automaticamente le due istanze durante la registrazione di un esame.
* **Incapsulamento:** Protezione degli attributi tramite modificatori `private` e accesso controllato tramite metodi *Getter* e metodi di servizio dedicati.

---

🏗️ **Struttura delle Classi**

Il sistema è suddiviso in tre file principali:

### 1. Classe `Studente`
Rappresenta l'utente universitario e il suo libretto esami.
* **Attributi:** `nome`, `cognome`, `matricola` e una collezione `esameConseguito` (`ArrayList<Esame>`).
* **Metodi principali:**
    * `esameSuperato(voto, Esame)`: Se il voto è sufficiente, aggiunge l'esame alla propria lista e "notifica" l'oggetto Esame per aggiungere lo studente alla lista dei promossi.
    * `rimuoviEsame(Esame)`: Elimina il riferimento all'esame e coordina la rimozione dello studente dal registro del corso.

### 2. Classe `Esame`
Rappresenta il corso d'insegnamento e il relativo registro dei promossi.
* **Attributo `studenteEsaminato`:** Un `ArrayList<Studente>` che contiene tutti gli studenti che hanno superato con successo la prova.
* **Metodi di interazione:**
    * `studenteCandidato(Studente)`: Riceve lo studente e lo inserisce nel registro (previa verifica duplicati).
    * `rimuoviStudente(Studente)`: Gestisce la rimozione dello studente dalla lista interna.
    * `listaSuperati()`: Genera un report testuale formattato che elenca tutti i promossi del corso; include un controllo per segnalare se il registro è ancora vuoto.

### 3. Classe `Main`
Il punto di ingresso del programma dove avviene la simulazione pratica:
* **Istanziamento:** Creazione di oggetti `Studente` ed `Esame` (es. POO, Basi di Dati, Analisi).
* **Simulazione Carriera:** Registrazione di voti positivi e negativi per testare i filtri di sbarramento del metodo `esameSuperato`.
* **Verifica Relazioni:** Stampa delle liste degli esami per ogni corso per confermare la corretta associazione bidirezionale dei dati.
