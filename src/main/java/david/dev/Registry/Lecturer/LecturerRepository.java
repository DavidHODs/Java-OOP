package david.dev.Registry.Lecturer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LecturerRepository extends JpaRepository<Lecturer, Long> {
    @Query("SELECT lec FROM Lecturer lec WHERE lec.email = ?1")
    Optional<Lecturer> findLecturerByEmail(String email);
}
