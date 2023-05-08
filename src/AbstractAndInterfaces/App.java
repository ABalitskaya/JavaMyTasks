package AbstractAndInterfaces;

public class App {
    public static void main(String[] args) {
        Student stedent1 = new Student("Irina", "Ivanova");
        Student student2 = new Student("Sasha", "Petrov");
        Teacher teacher = new Teacher("Petr", "Smirnov");
        Teacher teacher2 = new Teacher("Oksana", "Gromova");

        DrawMovingObject dmo = new DrawMovingObject();

        dmo.addObj(teacher);
        dmo.addObj(teacher2);
        dmo.addObj(stedent1);
        dmo.addObj(student2);

        dmo.drawEveryOneRunning();

        teacher.bePresentOnLesson("Math");
        teacher.bePresentOnLesson("Math");
        teacher2.bePresentOnLesson("Biology");
        stedent1.bePresentOnLesson("Math");
        teacher.bePresentOnLesson("Biology");
        // Сделать, чтоб сдесь были не строки, а элементы списка

    }
}
