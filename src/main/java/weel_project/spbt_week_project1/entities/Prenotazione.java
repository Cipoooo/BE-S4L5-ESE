package weel_project.spbt_week_project1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "prenotazioni")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Prenotazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "postazione_id")
    private Postazione postazione;
    private LocalDate data_di_prenotazione;
    @ManyToOne
    @JoinColumn(name = "utente_id")
    private Utente utente;

    public Prenotazione(Postazione postazione, LocalDate data_di_prenotazione, Utente utente) {
        this.postazione = postazione;
        this.data_di_prenotazione = data_di_prenotazione;
        this.utente = utente;
    }
}
