package weel_project.spbt_week_project1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "postazioni")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Postazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descrizione;
    @Enumerated(EnumType.STRING)
    private Tipo_di_Postazione tipo_di_postazione;
    private int maxNum;
    @ManyToMany
    @JoinColumn(name = "edificio_id")
    private Edificio edificio;
    private boolean disponibile;
    @OneToMany
    private List<Prenotazione> lista_delle_Prenotazioni = new ArrayList<Prenotazione>();

    public Postazione(String descrizione, Tipo_di_Postazione tipo_di_postazione, int maxNum, Edificio edificio, boolean disponibile, List<Prenotazione> lista_delle_Prenotazioni) {
        this.descrizione = descrizione;
        this.tipo_di_postazione = tipo_di_postazione;
        this.maxNum = maxNum;
        this.edificio = edificio;
        this.disponibile = true;
    }
}
