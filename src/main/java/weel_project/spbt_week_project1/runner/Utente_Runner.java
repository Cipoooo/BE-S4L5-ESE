package weel_project.spbt_week_project1.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import weel_project.spbt_week_project1.entities.Utente;
import weel_project.spbt_week_project1.service.Utente_Service;

@Component
public class Utente_Runner implements CommandLineRunner {

    @Autowired Utente_Service utente_service;

    @Override
    public void run(String...args)throws Exception{
        Utente u = utente_service.generaU1();
        utente_service.salvaUtente(u);
        System.out.println("L' utente è stato creato");
    }
}
