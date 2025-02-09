package weel_project.spbt_week_project1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import weel_project.spbt_week_project1.entities.Edificio;

@Repository
public interface Edificio_DAO extends JpaRepository<Edificio, Long> {

    Edificio cercaTramiteId(long id);

}
