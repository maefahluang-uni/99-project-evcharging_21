package th.mfu.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import th.mfu.Entity.RestStopReview;

@Repository
public interface RestStopReviewRepository extends JpaRepository<RestStopReview, Long> {
    // Custom query methods if needed
}
