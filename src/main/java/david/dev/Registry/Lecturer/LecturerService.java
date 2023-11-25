package david.dev.Registry.Lecturer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LecturerService {
    private final LecturerRepository lecturerRepository;

    @Autowired
    public LecturerService(LecturerRepository lecturerRepository) {
        this.lecturerRepository = lecturerRepository;
    }

    public List<Lecturer> getLecturers() {
        return lecturerRepository.findAll();
    }

    public void addNewLecturer(Lecturer lecturer) {
        Optional<Lecturer> lecturerByEmail = lecturerRepository.findLecturerByEmail(lecturer.getEmail());

        if (lecturerByEmail.isPresent()) {
            throw new IllegalStateException("email taken");
        }

        lecturerRepository.save(lecturer);
    }

    public void deleteLecturer(Long lecturerId) {
        boolean exists = lecturerRepository.existsById(lecturerId);
        if (!exists) {
            throw new IllegalStateException("lecturer with id " + lecturerId + " does not exist!!");
        }
        lecturerRepository.deleteById(lecturerId);
    }
}
