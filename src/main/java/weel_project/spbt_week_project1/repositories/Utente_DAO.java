package weel_project.spbt_week_project1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import weel_project.spbt_week_project1.entities.Utente;

@Repository
public interface Utente_DAO extends JpaRepository<Utente, Long> {

    Utente cercaTramiteId(long id);

}
