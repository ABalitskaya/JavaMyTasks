package Abstract_Interface;

import java.util.List;

public interface Teachable {

    void teach(Student student, Subjects subjects);
    void teach(List<Student> students, Subjects subjects);
}
