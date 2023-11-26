package th.mfu.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import th.mfu.Entity.RestStop;

@Repository
public interface RestStopRepository extends JpaRepository<RestStop, Long> {
    // Custom query methods if needed
}
