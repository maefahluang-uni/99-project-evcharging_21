package th.mfu.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import th.mfu.Entity.ChargingStationReview;
import th.mfu.Repository.ChargingStationReviewRepository;


@Service
public class ChargingStationReviewService {

    private final ChargingStationReviewRepository chargingStationReviewRepository;

    @Autowired
    public ChargingStationReviewService(ChargingStationReviewRepository chargingStationReviewRepository) {
        this.chargingStationReviewRepository = chargingStationReviewRepository;
    }

    public List<ChargingStationReview> getAllChargingStationReviews() {
        return chargingStationReviewRepository.findAll();
    }

    public ChargingStationReview getChargingStationReviewById(Long reviewId) {
        return chargingStationReviewRepository.findById(reviewId).orElse(null);
    }

    public ChargingStationReview createChargingStationReview(ChargingStationReview review) {
        return chargingStationReviewRepository.save(review);
    }

    public void deleteChargingStationReviewById(Long reviewId) {
        chargingStationReviewRepository.deleteById(reviewId);
    }

    // Other service methods for charging station reviews
}
