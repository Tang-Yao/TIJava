package generics;

import typeinfo.pets.*;
import java.util.*;

/**
 * Created by ty on 2016/9/29.
 */
public class LimitsOfInference {
    static void f(Map<Person, List<? extends Pet>> petPeople) {}

    public static void main(String[] args) {

    }
}
