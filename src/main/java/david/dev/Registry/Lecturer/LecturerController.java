package david.dev.Registry.Lecturer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/lecturer")
public class LecturerController {
    private final LecturerService lecturerService;

    @Autowired
    public LecturerController(LecturerService lecturerService) {
        this.lecturerService = lecturerService;
    }

    @GetMapping
    public List<Lecturer> getLecturers() {
        return lecturerService.getLecturers();
    }

    @PostMapping
    public void registerNewLecturer(@RequestBody Lecturer lecturer) {
        lecturerService.addNewLecturer(lecturer);
    }

    @DeleteMapping(path="{lecturerId}")
    public void deleteLecturer(@PathVariable("lecturerId") Long lecturerId) {
        lecturerService.deleteLecturer(lecturerId);
    }
}
