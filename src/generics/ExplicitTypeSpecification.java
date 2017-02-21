package generics;

import java.util.*;
import typeinfo.pets.*;
import net.mindview.util.*;

/**
 * Created by ty on 2016/9/29.
 */
public class ExplicitTypeSpecification {
    static void f(Map<Person, List<Pet>> petPeople) {}

    public static void main(String[] args) {
        f(New.<Person, List<Pet>>map());
    }
}
