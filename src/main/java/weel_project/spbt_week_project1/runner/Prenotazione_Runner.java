package weel_project.spbt_week_project1.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import weel_project.spbt_week_project1.entities.Prenotazione;
import weel_project.spbt_week_project1.service.Prenotazione_Service;

@Component
public class Prenotazione_Runner implements CommandLineRunner {

    @Autowired Prenotazione_Service prenotazione_service;

    @Override
    public void run(String...args)throws Exception{
        Prenotazione pr = prenotazione_service.generaP();
        prenotazione_service.salvaPrenotazione(pr);
        System.out.println("La tua prenotazione è stata confermata");
    }
}
