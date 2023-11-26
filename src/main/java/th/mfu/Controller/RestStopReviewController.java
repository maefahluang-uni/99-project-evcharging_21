package th.mfu.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import th.mfu.Entity.RestStopReview;
import th.mfu.Service.RestStopReviewService;

@RestController
@RequestMapping("/api/rest-stop-reviews")
public class RestStopReviewController {

    @Autowired
    private RestStopReviewService restStopReviewService;

    @GetMapping
    public List<RestStopReview> getAllRestStopReviews() {
        return restStopReviewService.getAllRestStopReviews();
    }

    @PostMapping
    public RestStopReview createRestStopReview(@RequestBody RestStopReview review) {
        return restStopReviewService.createRestStopReview(review);
    }

    // Other endpoints for rest stop reviews
}
