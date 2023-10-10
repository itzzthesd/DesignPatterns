package ProtoNRegistryPackage;

import java.util.HashMap;

public class StudentRegistry {
    HashMap<String, Student> map = new HashMap<>();

    public Student get(String key){
        return map.get(key);
    }

    public void register(String key, Student val){
        map.put(key,val);
    }
}
