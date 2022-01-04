package clone.airbnb.accommodation;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Getter @NoArgsConstructor
public class Accommodation {

    @Id @GeneratedValue
    @Column(name = "acc_id")
    private Long id;

    @NotBlank
    private String name;

    @Lob
    @NotNull
    private String description;

    @NotBlank
    private String address;

    @NotBlank
    private String latitude;

    @NotBlank
    private String longitude;

    @Min(value = 1_000)
    private long basicPrice;

    @Min(value = 1)
    private int personCount;

    @Builder
    public Accommodation(@NotBlank String name, @NotNull String description, @NotBlank String address, @NotBlank String latitude, @NotBlank String longitude, @Min(value = 1_000) long basicPrice, @Min(value = 1) int personCount) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.basicPrice = basicPrice;
        this.personCount = personCount;
    }
}
