package weel_project.spbt_week_project1.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import weel_project.spbt_week_project1.entities.Edificio;
import weel_project.spbt_week_project1.service.Edificio_Service;

@Component
public class Edificio_Runner implements CommandLineRunner {

    @Autowired Edificio_Service edificio_service;

    @Override
    public void run(String...args) throws Exception{
        Edificio e = edificio_service.generaE1();
        edificio_service.salvaEdificio(e);
        System.out.println("L' edificio è stato generato");
    }

}
