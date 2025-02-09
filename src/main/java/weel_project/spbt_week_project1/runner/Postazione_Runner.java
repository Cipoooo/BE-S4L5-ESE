package weel_project.spbt_week_project1.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import weel_project.spbt_week_project1.entities.Postazione;
import weel_project.spbt_week_project1.service.Postazione_Service;

@Component
public class Postazione_Runner implements CommandLineRunner {

    @Autowired Postazione_Service postazione_service;

    @Override
    public void run(String...args)throws Exception{
        Postazione p = postazione_service.generaP1();
        postazione_service.salvaPostazione(p);
        System.out.println("La Postazione è stata creata");
    }
}
