package weel_project.spbt_week_project1.service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import weel_project.spbt_week_project1.entities.Edificio;
import weel_project.spbt_week_project1.repositories.Edificio_DAO;

@Service
public class Edificio_Service {

    @Autowired @Qualifier("edificio1") ObjectProvider<Edificio> e1Provider;
    @Autowired @Qualifier("edificio2") ObjectProvider<Edificio> e2Provider;
    @Autowired @Qualifier("edificio3") ObjectProvider<Edificio> e3Provider;

    @Autowired
    Edificio_DAO edificio_dao;

    public Edificio generaE1(){
        return e1Provider.getObject();
    }

    public Edificio generaE2(){
        return e2Provider.getObject();
    }
    public Edificio generaE3(){
        return e3Provider.getObject();
    }

    public void salvaEdificio(Edificio e){
        edificio_dao.save(e);
    }

}
