package weel_project.spbt_week_project1.entities;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "edifici")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Edificio {

       @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String nome;
        private String indirizzo;
        private String citta;
        @OneToMany(fetch = FetchType.EAGER)
        private List<Postazione> lista_delle_postazioni = new ArrayList<Postazione>();

        public Edificio(String nome, String indirizzo, String citta, List<Postazione> lista_delle_postazioni) {
            this.nome = nome;
            this.indirizzo = indirizzo;
            this.citta = citta;
            this.lista_delle_postazioni = lista_delle_postazioni;
        }

        public void addPostazione(Postazione postazione){
            this.lista_delle_postazioni.add(postazione);
        }

}
