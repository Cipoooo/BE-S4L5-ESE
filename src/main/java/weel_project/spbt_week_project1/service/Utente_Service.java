package weel_project.spbt_week_project1.service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import weel_project.spbt_week_project1.entities.Utente;
import weel_project.spbt_week_project1.repositories.Utente_DAO;

@Service
public class Utente_Service {

    @Autowired @Qualifier(value = "user1") ObjectProvider<Utente> u1Provider;
    @Autowired @Qualifier(value = "user2") ObjectProvider<Utente> u2Provider;
    @Autowired @Qualifier(value = "user3") ObjectProvider<Utente> u3Provider;

    @Autowired Utente_DAO utente_dao;

    public Utente generaU1(){
        return u1Provider.getObject();
    }

    public Utente generaU2(){
        return u2Provider.getObject();
    }

    public Utente generaU3(){
        return u3Provider.getObject();
    }

    public void salvaUtente(Utente u){
        utente_dao.save(u);
    }

}
