import Model.Event;

import java.util.HashMap;
import java.util.LinkedList;

public class Storage {
    private HashMap<String,Event> eventList;

    private static Storage instance;

    private Storage() {
    }

    public static Storage getInstance() { //
        if (instance == null) {        //если объект еще не создан
            instance = new Storage();    //создать новый объект
        }
        return instance;        // вернуть ранее созданный объект
    }
}
