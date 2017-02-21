package holding;

import typeinfo.pets.*;

import java.util.*;

import static myself.Print.print;

/**
 * Created by ty on 2016/9/21.
 */
public class PetMap {

    public static void main(String [] args) {
        Map<String, Pet> petMap = new HashMap<String, Pet>();
        petMap.put("my cat", new Cat());
        petMap.put("my dog", new Dog());
        petMap.put("my hamster", new Hamster());

        print(petMap);

        Pet dog = petMap.get("my dog");
        print(dog);;
        print(petMap.containsKey("my dog"));
        print(petMap.containsValue(dog));
    }
}
