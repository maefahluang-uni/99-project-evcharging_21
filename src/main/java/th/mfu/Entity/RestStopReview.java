package th.mfu.Entity;

import javax.persistence.*;

@Entity
@Table(name = "RestStopReviews")
public class RestStopReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;

    private Long restStopId;

    private Long userId;

    private int rating;

    private String comment;

    // Other review fields and relationships

    public RestStopReview() {
        // Default constructor
    }

    public RestStopReview(Long restStopId, Long userId, int rating, String comment) {
        this.restStopId = restStopId;
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

    public Long getRestStopId() {
        return restStopId;
    }

    public void setRestStopId(Long restStopId) {
        this.restStopId = restStopId;
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
