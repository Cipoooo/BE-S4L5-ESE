package weel_project.spbt_week_project1.config;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import weel_project.spbt_week_project1.entities.Edificio;
import weel_project.spbt_week_project1.entities.Postazione;
import weel_project.spbt_week_project1.entities.Prenotazione;
import weel_project.spbt_week_project1.entities.Utente;
import weel_project.spbt_week_project1.enumeration.Tipo_di_Postazione;
import weel_project.spbt_week_project1.repositories.Edificio_DAO;
import weel_project.spbt_week_project1.repositories.Postazione_DAO;
import weel_project.spbt_week_project1.repositories.Prenotazione_DAO;
import weel_project.spbt_week_project1.repositories.Utente_DAO;

import java.time.LocalDate;
import java.util.Locale;

@Configuration
public class AppConfig {

    @Autowired Edificio_DAO edificio_dao;
    @Autowired Postazione_DAO postazione_dao;
    @Autowired Utente_DAO utente_dao;
    @Autowired Prenotazione_DAO prenotazione_dao;

    Faker fake = Faker.instance(new Locale("it-IT"));

    //TUTTI I BEAN AVRANNO LO SCOPE DI DEFAULT
    //BEAN UTENTI----------------
    @Bean("user1")
    public Utente user1Bean(){
        return new Utente("user1", fake.name().fullName(), fake.internet().emailAddress());
    }

    @Bean("user2")
    public Utente user2Bean(){
        return new Utente("user2", fake.name().fullName(), fake.internet().emailAddress());
    }

    @Bean("user3")
    public Utente user3Bean(){
        return new Utente("user3", fake.name().fullName(), fake.internet().emailAddress());
    }

    //BEAN EDIFICIO--------------
    @Bean("edificio1")
    public Edificio edifcioBean1(){
        return new Edificio("edificioP", fake.address().streetAddress(),fake.address().cityName());
    }

    @Bean("edificio2")
    public Edificio edifcioBean2(){
        return new Edificio("edificioP", fake.address().streetAddress(),fake.address().cityName());
    }

    @Bean("edificio3")
    public Edificio edifcioBean3(){
        return new Edificio("edificioP", fake.address().streetAddress(),fake.address().cityName());
    }

    //BEAN POSTAZIONI----------------
    @Bean("postazione1")
    public Postazione postazione1Bean(){
        return new Postazione("postazione del coriandolo", Tipo_di_Postazione.OPENSPACE,100,edificio_dao.cercaTramiteId(1),true);
    }

    @Bean("postazione2")
    public Postazione postazione2Bean(){
        return new Postazione("postazione del choppy", Tipo_di_Postazione.PRIVATO,30,edificio_dao.cercaTramiteId(2),true);
    }

    @Bean("postazione3")
    public Postazione postazione3Bean(){
        return new Postazione("postazione della scapolottina numero 3", Tipo_di_Postazione.SALA,1,edificio_dao.cercaTramiteId(3),true);
    }

    //BEAN PRENOTAZIONE--------------
    @Bean
    public Prenotazione prenotazione(){
        LocalDate data_di_prenotazione = LocalDate.of(2019,2,18);
        return new Prenotazione(postazione_dao.cercaTramiteId(1),data_di_prenotazione,utente_dao.cercaTramiteId(1));
    }
}
