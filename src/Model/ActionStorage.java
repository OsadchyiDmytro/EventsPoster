package Model;

import java.util.HashMap;
import java.util.LinkedList;

public class ActionStorage {
    private HashMap <String, LinkedList<Event>> eventList;

    private static ActionStorage instance;

    private ActionStorage() {
    }

    public static ActionStorage getInstance() { // #3
        if (instance == null) {        //если объект еще не создан
            instance = new ActionStorage();    //создать новый объект
        }
        return instance;        // вернуть ранее созданный объект
    }
}
