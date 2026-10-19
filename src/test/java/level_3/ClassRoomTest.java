package level_3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ClassRoomTest {

    ClassRoom classRoom;

    @BeforeEach
    void setUp() {
        classRoom = new ClassRoom(false);
        classRoom.addStudent(new Student("Angel", 22, "JAVA", 7.8f));
        classRoom.addStudent(new Student("Maria", 20, "PHP", 8.5f));
        classRoom.addStudent(new Student("Carlos", 21, "JAVA", 6.7f));
        classRoom.addStudent(new Student("Anna", 19, "PHP", 9.2f));
        classRoom.addStudent(new Student("Pedro", 23, "PYTHON", 5.8f));
        classRoom.addStudent(new Student("Laura", 22, "JAVA", 7.4f));
        classRoom.addStudent(new Student("Jordi", 20, "PHP", 6.9f));
        classRoom.addStudent(new Student("Sofia", 24, "PHP", 9.5f));
        classRoom.addStudent(new Student("Pablo", 17, "JAVA", 4.6f));
        classRoom.addStudent(new Student("Elena", 19, "PHP", 7.1f));
        classRoom.addStudent(new Student("Ali", 23, "PHP", 8.8f));
    }

    @Test
    void filterWithNameStartWith() {
        String character = "a";
        List<String> names = List.of("Angel", "Anna", "Ali");
        List<Student> studentsFiltered = classRoom.filterWithNameStartWith(character);
        List<String> namesFiltered = studentsFiltered.stream().map(Student::getName).toList();

        assertThat(namesFiltered).containsExactlyElementsOf(names);
    }

    @Test
    void filterWithGradeEqualOrHigher() {
        float minGrade = 5f;
        List<String> names = List.of("Pablo");
        List<Student> studentsFiltered = classRoom.filterWithGradeEqualOrHigher(minGrade);
        List<String> namesFiltered = studentsFiltered.stream().map(Student::getName).toList();

        assertThat(namesFiltered).doesNotContainAnyElementsOf(names);
    }

    @Test
    void filterWithGradeEqualOrHigherExcludeCourse() {
        float minGrade = 5f;
        String excludeCourse = "PHP";
        List<String> names = List.of("Angel", "Carlos", "Pedro", "Laura");
        List<Student> studentsFiltered = classRoom.filterWithGradeEqualOrHigherExcludeCourse(minGrade, excludeCourse);
        List<String> namesFiltered = studentsFiltered.stream().map(Student::getName).toList();

        assertThat(namesFiltered).containsExactlyElementsOf(names);
    }

    @Test
    void filterAllStudentsOfCourseAndOfAge() {
        int minAge = 18;
        String course = "JAVA";
        List<String> names = List.of("Angel", "Carlos", "Laura");
        List<Student> studentsFiltered = classRoom.filterAllStudentsOfCourseAndOfAge(course, minAge);
        List<String> namesFiltered = studentsFiltered.stream().map(Student::getName).toList();

        assertThat(namesFiltered).containsExactlyElementsOf(names);
    }
}