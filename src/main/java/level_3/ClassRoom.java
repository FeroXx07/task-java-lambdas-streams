package level_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ClassRoom {
    List<Student> students;

    public ClassRoom() {
        students = seed();
    }

    public void showStudentsNameAge() {
        System.out.println("Name Age - Basic");
        students.forEach(student -> System.out.println(student.getName() + " " + student.getAge()));
    }

    public void showStudentsNameStartWith(String character) {
        String normalizedCharacter = character.toUpperCase(Locale.ROOT);
        System.out.println("Name Age - Filtered by starting with " + normalizedCharacter);
        List<Student> filteredList = students
                .stream()
                .filter(student -> student.getNameNormalized().startsWith(normalizedCharacter))
                .toList();
        filteredList.forEach(student -> System.out.println(student.getName() + " " + student.getAge()));
    }
    private List<Student> seed() {
        students = new ArrayList<>();
        students.add(new Student("Angel", 22, 2, 7.8f));
        students.add(new Student("Maria", 20, 1, 8.5f));
        students.add(new Student("Carlos", 21, 2, 6.7f));
        students.add(new Student("Anna", 19, 1, 9.2f));
        students.add(new Student("Pedro", 23, 3, 5.8f));
        students.add(new Student("Laura", 22, 2, 7.4f));
        students.add(new Student("Jordi", 20, 1, 6.9f));
        students.add(new Student("Sofia", 24, 4, 9.5f));
        students.add(new Student("Pablo", 21, 2, 4.6f));
        students.add(new Student("Elena", 19, 1, 7.1f));
        students.add(new Student("Ali", 23, 3, 8.8f));
        return students;
    }
}
