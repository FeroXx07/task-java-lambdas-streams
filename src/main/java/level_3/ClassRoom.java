package level_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ClassRoom {
    List<Student> students;

    public ClassRoom(boolean doSeed) {
        students = new ArrayList<>();

        if (doSeed)
            students = seed();
    }

    public void addStudent(Student student) {students.add(student);}

    public void showStudentsNameAge() {
        System.out.println("Info - Basic");
        students.forEach(System.out::println);
    }

    public List<Student> filterWithNameStartWith(String character) {
        String normalizedCharacter = character.toUpperCase(Locale.ROOT);
        System.out.println("Name Age - Filtered by starting with " + normalizedCharacter);
        List<Student> filteredList = students
                .stream()
                .filter(student -> student.getNameNormalized().startsWith(normalizedCharacter))
                .toList();
        filteredList.forEach(System.out::println);
        return filteredList;
    }

    public List<Student> filterWithGradeEqualOrHigher(float minGrade){
        System.out.println("Name Age - Filtered by grade higher than " + minGrade);
        List<Student> filteredList = students
                .stream()
                .filter(student -> student.getGrade() >= minGrade)
                .toList();
        filteredList.forEach(System.out::println);
        return filteredList;
    }

    public List<Student> filterWithGradeEqualOrHigherExcludeCourse(float minGrade, String course){
        System.out.println("Name Age - Filtered by grade higher than " + minGrade + " and excluding course " + course);
        List<Student> filteredList = students
                .stream()
                .filter(student -> student.getGrade() >= minGrade)
                .filter(student -> !student.getCourse().equalsIgnoreCase(course))
                .toList();
        filteredList.forEach(System.out::println);
        return filteredList;
    }

    public List<Student> filterAllStudentsOfCourseAndOfAge(String course, int age){
        System.out.println("Name Age - Filtered by course " + course);
        List<Student> filteredList = students
                .stream()
                .filter(student -> student.getAge() >= age)
                .filter(student -> student.getCourse().equalsIgnoreCase(course))
                .toList();
        filteredList.forEach(System.out::println);
        return filteredList;
    }

    private List<Student> seed() {
        students.add(new Student("Angel", 22, "JAVA", 7.8f));
        students.add(new Student("Maria", 20, "PHP", 8.5f));
        students.add(new Student("Carlos", 21, "JAVA", 6.7f));
        students.add(new Student("Anna", 19, "PHP", 9.2f));
        students.add(new Student("Pedro", 23, "PYTHON", 5.8f));
        students.add(new Student("Laura", 22, "JAVA", 7.4f));
        students.add(new Student("Jordi", 20, "PHP", 6.9f));
        students.add(new Student("Sofia", 24, "PHP", 9.5f));
        students.add(new Student("Pablo", 17, "JAVA", 4.6f));
        students.add(new Student("Elena", 19, "PHP", 7.1f));
        students.add(new Student("Ali", 23, "PHP", 8.8f));
        return students;
    }
}
