package th.mfu.Entity;

import javax.persistence.*;

@Entity
@Table(name = "ChargingStationReviews")
public class ChargingStationReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;

    private Long stationId;

    private Long userId;

    private int rating;

    private String comment;

    // Other review fields and relationships

    public ChargingStationReview() {
        // Default constructor
    }

    public ChargingStationReview(Long stationId, Long userId, int rating, String comment) {
        this.stationId = stationId;
        this.userId = userId;
        this.rating = rating;
        this.comment = comment;
        // Other fields can be initialized here if needed
    }

    // Getters and setters

    public Long getReviewId() {
        return reviewId;
    }

    public void setReviewId(Long reviewId) {
        this.reviewId = reviewId;
    }

    public Long getStationId() {
        return stationId;
    }

    public void setStationId(Long stationId) {
        this.stationId = stationId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    // Other getters and setters for additional fields and relationships
}
