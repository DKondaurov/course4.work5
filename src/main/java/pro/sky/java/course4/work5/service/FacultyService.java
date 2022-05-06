package pro.sky.java.course4.work5.service;

import pro.sky.java.course4.work5.model.Faculty;

import java.util.Collection;
import java.util.List;

public interface FacultyService {

    Faculty addFaculty(Faculty faculty);

    Faculty findFaculty(long id);

    void removeFaculty(long id);

    Faculty editFaculty(Faculty faculty);

    Collection<Faculty> filterFacultyByColor(String color, String name);

    List<Faculty> longestNameFaculty();

    int valueOfTheFormula();
}
