package weel_project.spbt_week_project1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import weel_project.spbt_week_project1.entities.Postazione;

@Repository
public interface Postazione_DAO extends JpaRepository<Postazione, Long> {

    Postazione cercaTramiteId(long id);

}
