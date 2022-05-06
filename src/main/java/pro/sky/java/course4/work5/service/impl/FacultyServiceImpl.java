package pro.sky.java.course4.work5.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pro.sky.java.course4.work5.model.Faculty;
import pro.sky.java.course4.work5.repository.FacultyRepository;
import pro.sky.java.course4.work5.service.FacultyService;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class FacultyServiceImpl implements FacultyService {

    private final FacultyRepository facultyRepository;
    Logger logger = LoggerFactory.getLogger(FacultyServiceImpl.class);

    public FacultyServiceImpl(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    @Override
    public Faculty addFaculty(Faculty faculty) {
        logger.debug("Requesting a method addFaculty");
        return facultyRepository.save(faculty);
    }

    @Override
    public Faculty findFaculty(long id) {
        logger.debug("Requesting a method findFaculty");
        return facultyRepository.findById(id).get();
    }

    @Override
    public void removeFaculty(long id) {
        logger.debug("Requesting a method removeFaculty");
        facultyRepository.deleteById(id);
    }

    @Override
    public Faculty editFaculty(Faculty faculty) {
        logger.debug("Requesting a method editFaculty");
        return facultyRepository.save(faculty);
    }

    @Override
    public Collection<Faculty> filterFacultyByColor(String color, String name) {
        logger.debug("Requesting a method filterFacultyByColor");
        return facultyRepository.findFacultyByColorIgnoreCaseOrNameIgnoreCase(color, name);
    }

    @Override
    public List<Faculty> longestNameFaculty() {
        logger.debug("Requesting a method longestNameFaculty");
        return Collections.singletonList(facultyRepository.findAll().stream()
                .max(Comparator.comparing(Faculty -> Faculty.getName().length()))
                .get());
    }

    @Override
    public int valueOfTheFormula() {
        long start = System.currentTimeMillis();
        logger.debug("Requesting a method valueOfTheFormula");
        int sum = Stream
                .iterate(1, a -> a + 1)
                .limit(5_000_000)
                .mapToInt(Integer::intValue)
                .parallel()
                .sum();
        logger.debug("finish a method valueOfTheFormula time sum {}", System.currentTimeMillis() - start);
        return sum;
    }

}
