package Design_pattern.Prototype;

import Design_pattern.Builder.Student;

import java.util.HashMap;

public class StudentRegistry {
    private HashMap<String, Student> map = new HashMap<>();

    void register(String key, Student student){
        map.put(key, student);
    }

    public Student get(String key){
        if(map.containsKey(key)){
            return map.get(key);
        }
        return null;
    }
}