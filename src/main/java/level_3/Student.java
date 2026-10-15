package level_3;

import java.util.Locale;
import java.util.StringJoiner;

public class Student {
    private final String name;
    private final int age;
    private final String course;
    private final float grade;

    public Student(String name, int age, String course, float grade) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }

    public String getName() { return name;}
    public String getNameNormalized(){return name.toUpperCase(Locale.ROOT);}
    public int getAge() { return age; }
    public String getCourse() { return course; }
    public float getGrade() { return grade; }

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("age=" + age)
                .add("course='" + course + "'")
                .add("grade=" + grade)
                .toString();
    }
}
