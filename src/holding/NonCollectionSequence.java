package holding;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.*;

/**
 * Created by Administrator on 2016/9/22.
 */


class PetSequnce {
    protected Pet[] pets = Pets.creatArray(8);
}


public class NonCollectionSequence extends PetSequnce {

    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {

            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence();
        InterfaceVsIterator.display(nc.iterator());
    }
}
