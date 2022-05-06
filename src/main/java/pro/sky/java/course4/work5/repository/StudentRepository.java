package pro.sky.java.course4.work5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pro.sky.java.course4.work5.model.Student;
import pro.sky.java.course4.work5.model.StudentCount;
import pro.sky.java.course4.work5.model.StudentsAverageAge;
import pro.sky.java.course4.work5.model.StudentsFromEndOfTheListById;

import java.util.Collection;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Collection<Student> findStudentByAge(int age);

    Collection<Student> findByAgeBetween(int man, int max);

    @Query(value = "SELECT COUNT(student) AS student FROM student", nativeQuery = true)
    List<StudentCount> getCountStudents();

    @Query(value = "SELECT avg(age) AS student from student", nativeQuery = true)
    List<StudentsAverageAge> getStudentsAverageAge();

    @Query(value = "SELECT * FROM student ORDER BY id DESC LIMIT 5", nativeQuery = true)
    List<StudentsFromEndOfTheListById> getStudentsFromEndOfTheListById();
}
