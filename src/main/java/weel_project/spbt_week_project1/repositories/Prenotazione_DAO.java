package weel_project.spbt_week_project1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import weel_project.spbt_week_project1.entities.Prenotazione;

@Repository
public interface Prenotazione_DAO extends JpaRepository<Prenotazione, Long>{}
