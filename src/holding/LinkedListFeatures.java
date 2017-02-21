package holding;

import typeinfo.pets.Hamster;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;
import typeinfo.pets.Rat;

import java.util.LinkedList;

import static myself.Print.print;

/**
 * Created by 唐瑶 on 2016/9/21.
 */
public class LinkedListFeatures {
    public static void main(String [] args) {
        LinkedList<Pet> pets = new LinkedList<Pet>(Pets.arrayList(5));
        print(pets);
        print(pets.getFirst());
        print(pets.element());
        print(pets.peek());
        print(pets.remove());
        print(pets.poll());
        print(pets);
        pets.addFirst(new Rat());
        print(pets);
        pets.offer(Pets.randomPet());
        print(pets);
        pets.add(Pets.randomPet());
        print(pets);
        pets.addLast(new Hamster());
        print(pets);
        print(pets.removeLast());

    }
}
