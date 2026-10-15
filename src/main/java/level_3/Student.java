package level_3;

import java.util.Locale;

public class Student {
    private final String name;
    private final int age;
    private final int year;
    private final float grade;

    public Student(String name, int age, int year, float grade) {
        this.name = name;
        this.age = age;
        this.year = year;
        this.grade = grade;
    }

    public String getName() { return name;}
    public String getNameNormalized(){return name.toUpperCase(Locale.ROOT);}
    public int getAge() { return age; }
    public int getYear() { return year; }
    public float getGrade() { return grade; }
}
