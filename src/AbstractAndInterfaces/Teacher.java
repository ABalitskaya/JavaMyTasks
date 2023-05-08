package AbstractAndInterfaces;

public class Teacher extends Human implements MoveToUniversity {

    int lessonCounts;
    public Teacher (String name, String secondName) {
        super(name, secondName);
        lessonCounts = 0;
    }
    public void bePresentOnLesson (String lessonID) {

        lessonCounts +=1;
    }
    public void run () {
        System.out.println("I'm teacher " + getName() + " and I'm running");
    }
    public void walk () {

    }

}
