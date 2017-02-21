package holding;

import typeinfo.pets.*;

import java.util.*;

import static myself.Print.print;

/**
 * Created by ty on 2016/9/21.
 */
public class MapOfList {

    public static Map<Person, List<? extends Pet>>
        petPeople = new HashMap<Person, List<? extends Pet>>();

    static {
        petPeople.put(new Person("Dawn"),
                Arrays.asList(new Cymric("Molly"), new Mutt("Spot")));
        petPeople.put(new Person("Kate"),
                Arrays.asList(new Cat("Shackleton"), new Cat("Spot"), new Dog("Margret")));
        petPeople.put(new Person("Marilyn"),
                Arrays.asList(new Pug("Louie akea lLouis Snorkelstein Dupree"),
                        new Cat("Standford aka Stinkly el Megro"),
                        new Cat("Pinkola")));
        petPeople.put(new Person("Luke"),
                Arrays.asList(new Rat("Fuzzy"), new Rat("Fizzy")));
        petPeople.put(new Person("Isaac"),
                Arrays.asList(new Cymric("Freckly")));
    }

    public static void main(String [] args) {
        print("People : " + petPeople.keySet());
        print("Pets : " + petPeople.values());

        for(Person person : petPeople.keySet()) {
            print(person + " has : ");

            for(Pet pet : petPeople.get(person)) {
                print("     " + pet);
            }
        }
    }

}
