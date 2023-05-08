package AbstractAndInterfaces;

import java.util.ArrayList;
import java.util.List;

public class DrawMovingObject {

    List<MoveToUniversity> objcts = new ArrayList<>();

    public void addObj(MoveToUniversity obj) {
        objcts.add(obj);
    }
    public void drawEveryOneRunning() {
        for(MoveToUniversity obj : objcts) { //Цикл, проходимся по всем элементам списка
            obj.run();
        }
    }
}
