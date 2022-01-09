package clone.airbnb.review;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Entity
public class Review {

    @Id @GeneratedValue
    @Column(name = "review_id")
    private Long id;

    private String content;

    private LocalDateTime startDate;

    private LocalDateTime endDate;
}
