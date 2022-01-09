package clone.airbnb.accommodation.web;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class AccommodationDto {

    private long accommodationId;

    private String title;

    private int personCount;

    private String accommodationType;

    private List<String> imagePath = new ArrayList<>();

    private int reviewCount;
}
