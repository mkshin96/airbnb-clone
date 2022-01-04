package clone.airbnb.accommodation;

import com.navercorp.fixturemonkey.FixtureMonkey;
import com.navercorp.fixturemonkey.generator.BuilderArbitraryGenerator;
import org.junit.jupiter.api.RepeatedTest;

import static org.assertj.core.api.Assertions.assertThat;

public class AccommodationTest {

    @RepeatedTest(100)
    void 정상적으로_인스턴스를_생성한다() {
        FixtureMonkey fixture = FixtureMonkey.builder()
                .putGenerator(Accommodation.class, BuilderArbitraryGenerator.INSTANCE)
                .build();

        Accommodation accommodation = fixture.giveMeOne(Accommodation.class);

        assertThat(accommodation).isNotNull();
        assertThat(accommodation.getName()).isNotBlank();
        assertThat(accommodation.getDescription()).isNotNull();
        assertThat(accommodation.getAddress()).isNotBlank();
        assertThat(accommodation.getLatitude()).isNotBlank();
        assertThat(accommodation.getLongitude()).isNotBlank();
        assertThat(accommodation.getBasicPrice()).isGreaterThanOrEqualTo(1_000);
        assertThat(accommodation.getPersonCount()).isGreaterThanOrEqualTo(1);
    }
}