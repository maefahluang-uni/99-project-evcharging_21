package th.mfu.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import th.mfu.Entity.ChargingStationReview;
import th.mfu.Service.ChargingStationReviewService;

@RestController
@RequestMapping("/api/charging-station-reviews")
public class ChargingStationReviewController {

    @Autowired
    private ChargingStationReviewService chargingStationReviewService;

    @GetMapping
    public List<ChargingStationReview> getAllChargingStationReviews() {
        return chargingStationReviewService.getAllChargingStationReviews();
    }

    @PostMapping
    public ChargingStationReview createChargingStationReview(@RequestBody ChargingStationReview review) {
        return chargingStationReviewService.createChargingStationReview(review);
    }

    // Other endpoints for charging station reviews
}
