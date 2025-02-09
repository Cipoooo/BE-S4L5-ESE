package weel_project.spbt_week_project1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "utenti")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Utente {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String username;
   private String fullname;
   private String mail;
   @OneToMany(mappedBy = "utente")
   private List<Prenotazione> lista_delle_Prenotazioni = new ArrayList<>();

    public Utente(String username, String fullname, String mail) {
        this.username = username;
        this.fullname = fullname;
        this.mail = mail;
    }
}
