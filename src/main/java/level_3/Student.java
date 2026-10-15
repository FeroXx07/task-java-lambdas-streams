package level_3;

public class Student {
    private final String name;
    private final int age;
    private final int year;
    private final int grade;

    public Student(String name, int age, int year, int grade) {
        this.name = name;
        this.age = age;
        this.year = year;
        this.grade = grade;
    }

    public String getName() { return name;}
    public int getAge() { return age; }
    public int getYear() { return year; }
    public int getGrade() { return grade; }
}
