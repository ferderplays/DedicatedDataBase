package net.ferderplays.ddb.utils;

import java.util.HashMap;

public class DataBase {
    public HashMap<String, Object> database = new HashMap<>();
    public HashMap<String, Object> data = new HashMap<>();

    public HashMap<String, Object> getDatabase() {
        return database;
    }

    public Object getData(String key) {
        return data.get(key);
    }
}
