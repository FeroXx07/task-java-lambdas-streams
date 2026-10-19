package level_3;

public class Main {
    ClassRoom classRoom = new ClassRoom(true);
    void main() {
        classRoom.showStudentsNameAge();
        classRoom.filterWithNameStartWith("a");
        classRoom.filterWithGradeEqualOrHigher(5f);
        classRoom.filterWithGradeEqualOrHigherExcludeCourse(5f,"PHP");
        classRoom.filterAllStudentsOfCourseAndOfAge("JAVA", 18);
    }
}
