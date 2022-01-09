package clone.airbnb.images;

import clone.airbnb.accommodation.Accommodation;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class AccommodationImage {

    @Id @GeneratedValue
    @Column(name = "accommodation_image_id")
    private Long id;

    private String path;

    @ManyToOne(fetch = FetchType.LAZY)
    private Accommodation accommodation;
}
