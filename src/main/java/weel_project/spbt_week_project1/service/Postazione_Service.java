package weel_project.spbt_week_project1.service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import weel_project.spbt_week_project1.entities.Postazione;
import weel_project.spbt_week_project1.repositories.Postazione_DAO;

@Service
public class Postazione_Service {

    @Autowired @Qualifier(value = "postazione1") ObjectProvider<Postazione> p1Provider;
    @Autowired @Qualifier(value = "postazione2") ObjectProvider<Postazione> p2Provider;
    @Autowired @Qualifier(value = "postazione3") ObjectProvider<Postazione> p3Provider;

    @Autowired Postazione_DAO postazione_dao;

    public Postazione generaP1(){
        return p1Provider.getObject();
    }

    public Postazione generaP2(){
        return p2Provider.getObject();
    }

    public Postazione generaP3(){
        return p3Provider.getObject();
    }

    public void salvaPostazione(Postazione p){
        postazione_dao.save(p);
    }

}
