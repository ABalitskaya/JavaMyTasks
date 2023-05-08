package Abstract_Interface;

import java.util.List;

public class Teacher extends Human implements Teachable, Playable {
    public Teacher(String name, int id) {
        super(name, id);
        // это конструктор (вызов конструктора родителя)
        // teacher fields init
    }

    @Override
    public String getName() {
        return "Teacher " + super.getName();
    }

    @Override
    public void introduceYourself() {
        System.out.println("I'm a teacher");

    }

    @Override
    public void teach(Student student, Subjects subject) {
        System.out.println("Teacher " + this.getName() + " teaches " + student.getName());
        student.setOfSubjects.add(subject);
    }

    @Override
    public void teach(List<Student> students, Subjects subjects) {
        for (Student student: students) {
            this.teach(student, subjects);
        }
    }


    @Override
    public void play() {
        System.out.println("I play chess");
    }
}
