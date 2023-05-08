package Abstract_Interface;

import javax.security.auth.Subject;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Student extends Human implements Playable {

    Subjects[] subjectsForLearning = new Subjects[7];

    public Set<Subjects> setOfSubjects = new HashSet<>();

    public Student(String name, int id) {
        super(name, id);

    }

    @Override
    public void introduceYourself() {
        System.out.println("I'm a Student " + this.getName() + " already know " + this.setOfSubjects.toString());
    }

    @Override
    public void play() {
        System.out.println("I'm playing football");
    }



}
