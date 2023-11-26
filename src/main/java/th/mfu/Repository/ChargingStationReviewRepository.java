package th.mfu.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.mfu.Entity.ChargingStationReview;

@Repository
public interface ChargingStationReviewRepository extends JpaRepository<ChargingStationReview, Long> {
    // Custom query methods or additional operations if needed
}
