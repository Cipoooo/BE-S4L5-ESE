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

        public Edificio(String nome, String indirizzo, String citta) {
            this.nome = nome;
            this.indirizzo = indirizzo;
            this.citta = citta;
        }


}
