package clone.airbnb.cost;

import clone.airbnb.accommodation.Accommodation;
import clone.airbnb.common.entity.BaseEntity;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Entity
public class Cost extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "cost_id")
    private Long id;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private Long price;

    @ManyToOne(fetch = FetchType.LAZY)
    private Accommodation accommodation;
}
