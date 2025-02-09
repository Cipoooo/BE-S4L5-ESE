package weel_project.spbt_week_project1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import weel_project.spbt_week_project1.enumeration.Tipo_di_Postazione;

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
    private boolean isDisponibile;
    @OneToMany(mappedBy = "postazione")
    private List<Prenotazione> lista_delle_Prenotazioni = new ArrayList<>();

    public Postazione(String descrizione, Tipo_di_Postazione tipo_di_postazione, int maxNum, Edificio edificio, boolean isDisponibile) {
        this.descrizione = descrizione;
        this.tipo_di_postazione = tipo_di_postazione;
        this.maxNum = maxNum;
        this.edificio = edificio;
        this.isDisponibile = isDisponibile;
    }
}
