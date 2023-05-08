package AbstractAndInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student extends Human implements MoveToUniversity {

    List<String> lessonsIDs; //Тут храним список предметов, пока список пустой
    public Student (String name, String secondName) {
        super(name, secondName);
        //studentLessons = new HashMap<String, Integer>();
    }

    // Отслеживает, на каких уроках был
    /*public void bePresentOnLesson (String lessonID) {
        if (!studentLessons.containsKey(lessonID)) {
            studentLessons.put(lessonID, 1);
        } else {
            Integer value = studentLessons.get(lessonID);
            studentLessons.put(lessonID, value);
        }

    } */

    // Сохранить все ID уроков, где был студент
    public void bePresentOnLesson (String lessonID) {
        lessonsIDs.add(lessonID);
    }

    public void run () {
        System.out.println("I'm student " + getName() + " and I'm running");
    }
    public void walk() {
        //
    }

}
