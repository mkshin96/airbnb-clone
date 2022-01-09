package clone.airbnb.accommodation.repository;

import clone.airbnb.accommodation.Accommodation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccommodationRepository extends JpaRepository<Accommodation, Long> {
}
