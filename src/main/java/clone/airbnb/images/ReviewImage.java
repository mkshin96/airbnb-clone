package clone.airbnb.images;

import clone.airbnb.review.Review;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter @NoArgsConstructor
@Entity
public class ReviewImage {

    @Id @GeneratedValue
    @Column(name = "review_image_id")
    private Long id;

    private String path;

    @ManyToOne(fetch = FetchType.LAZY)
    private Review review;
}
