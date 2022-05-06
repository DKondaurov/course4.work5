package pro.sky.java.course4.work5.service;

import pro.sky.java.course4.work5.model.Student;
import pro.sky.java.course4.work5.model.StudentCount;
import pro.sky.java.course4.work5.model.StudentsAverageAge;
import pro.sky.java.course4.work5.model.StudentsFromEndOfTheListById;

import java.util.Collection;
import java.util.List;
import java.util.OptionalDouble;

public interface StudentService {
    Student addStudent(Student student);

    Student findStudent(long id);

    void removeStudent(long id);

    Student editStudent(Student student);

    Collection<Student> filterStudentByAge(int age);

    Collection<Student> filterStudentsByAgeBetween(int min, int max);

    List<StudentCount> getCountStudents();

    List<StudentsAverageAge> getStudentsAverageAge();

    List<StudentsFromEndOfTheListById> getStudentsFromEndOfTheListById();

    List<Student> findAllStudentsByAlphabet();

    OptionalDouble studentsMiddleAge();
}
