package david.dev.Registry.Lecturer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class LecturerConfig {
    @Bean
    CommandLineRunner commandLineRunner(LecturerRepository repository) {
        return args -> {
            Lecturer obam = new Lecturer("124", "David Obam", "do@email.com", LocalDate.of(2000, 3, 14), "Male", "Sciences", "Senior Lecturer", "Level Adviser");

            Lecturer fem = new Lecturer("126", "Fem Oguns", "fg@email.com", LocalDate.of(1995, 5, 19), "Male", "Sciences", "Senior Lecturer", "Level Adviser");

            obam.setCode(obam.getCode());
            fem.setCode(obam.getCode());

            repository.saveAll(
                    List.of(obam, fem)
            );
        };
    }
}
