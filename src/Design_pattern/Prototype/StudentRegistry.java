package Design_pattern.Prototype;



import java.util.HashMap;

public class StudentRegistry {
    private HashMap<String, StudentPrototype> map = new HashMap<>();

    void register(String key, StudentPrototype student){
        map.put(key, student);
    }

    public StudentPrototype get(String key){
        if(map.containsKey(key)){
            return map.get(key);
        }
        return null;
    }
}