package pro.sky.java.course4.work5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course4.work5.model.StudentsAverageAge;
import pro.sky.java.course4.work5.service.StudentService;

import java.util.List;

@RestController
public class StudentsAverageAgeController {
    private final StudentService studentService;

    public StudentsAverageAgeController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student-average-age")
    public List<StudentsAverageAge> getStudentsAverageAge() {
        List<StudentsAverageAge> studentsAverageAge = studentService.getStudentsAverageAge();
        return studentsAverageAge;
    }
}
