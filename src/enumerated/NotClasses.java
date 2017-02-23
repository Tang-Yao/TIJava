package enumerated;

import static net.mindview.util.Print.*;

enum LikeClasses {
	WINKEN { void behavior() { print("Behavior1()"); } },
	BLINKEN { void behavior() { print("Behavior2()"); } },
	NOD { void behavior() { print("Behavior3()"); } };
	
	abstract void behavior();
}

public class NotClasses {

}
