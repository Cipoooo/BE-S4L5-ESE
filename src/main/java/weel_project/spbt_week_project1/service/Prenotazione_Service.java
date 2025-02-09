package weel_project.spbt_week_project1.service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import weel_project.spbt_week_project1.entities.Prenotazione;
import weel_project.spbt_week_project1.repositories.Prenotazione_DAO;

@Service
public class Prenotazione_Service {

    @Autowired @Qualifier(value = "prenotazione") ObjectProvider<Prenotazione> prenotazioneProvider;

    @Autowired Prenotazione_DAO prenotazione_dao;

    public Prenotazione generaP(){
        return prenotazioneProvider.getObject();
    }

    public void salvaPrenotazione(Prenotazione pr){
        prenotazione_dao.save(pr);
    }

}
