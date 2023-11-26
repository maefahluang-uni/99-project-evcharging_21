package th.mfu.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import th.mfu.Entity.RestStopReview;
import th.mfu.Repository.RestStopReviewRepository;

@Service
public class RestStopReviewService {

    private final RestStopReviewRepository restStopReviewRepository;

    @Autowired
    public RestStopReviewService(RestStopReviewRepository restStopReviewRepository) {
        this.restStopReviewRepository = restStopReviewRepository;
    }

    public List<RestStopReview> getAllRestStopReviews() {
        return restStopReviewRepository.findAll();
    }

    public RestStopReview getRestStopReviewById(Long reviewId) {
        return restStopReviewRepository.findById(reviewId).orElse(null);
    }

    public RestStopReview createRestStopReview(RestStopReview review) {
        return restStopReviewRepository.save(review);
    }

    public void deleteRestStopReviewById(Long reviewId) {
        restStopReviewRepository.deleteById(reviewId);
    }

    // Other service methods for rest stop reviews
}
