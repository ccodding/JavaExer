import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    private List<String> students;

    public ListExercise() {
//        System.out.println(students);
        this.students = new ArrayList<>();
        this.students.add("abc");
        this.students.add("abc1");
        this.students.add("abc2");
        this.students.add("abc3");
    }

    public List<String> getStudents() {
        return this.students;
    }


}