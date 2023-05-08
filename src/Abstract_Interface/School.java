package Abstract_Interface;

import java.util.Arrays;
import java.util.List;

public class School {
    public static void main(String[] args) {

        Student student1 = new Student("Tom", 1);
        Student student2 = new Student("Bob", 2);
        Student student3 = new Student("Mary", 3);
        Teacher teacher = new Teacher("Mr. Thompson", 4);

        List<Human> peopleAtSchool = Arrays.asList(student1, student2, student3, teacher);
        List<Student> studentsAtSchool = Arrays.asList(student1,student2,student3);
        for (Human human: peopleAtSchool) {
            System.out.println(human.getName());
            human.introduceYourself();
        }

        student1.play();
        teacher.teach(studentsAtSchool, Subjects.GEOGRAPHY);
        teacher.play();

        List<Playable> players = Arrays.asList(student1, student2, student3, teacher);
        for (Playable player: players) {
            player.play();
        }

        for (Human human: peopleAtSchool) {
            human.introduceYourself();
        }





        //System.out.println(Arrays.asList(student1.getName(),
                //student2.getName(), student3.getName(), teacher.getName()));



    }
}
