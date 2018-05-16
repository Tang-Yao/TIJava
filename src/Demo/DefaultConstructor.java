package Demo;

class Bird {
	int i;
}

class Bush {
	public Bush(int i) {
		// TODO Auto-generated constructor stub
	}
	public Bush(double d) {
		// TODO Auto-generated constructor stub
	}
}
public class DefaultConstructor {
	public static void main(String[] args) {
		Bird bc = new Bird(); 
		//Bush bush = new Bush();   // wrong
		Bush bush = new Bush(1); // right
		Bush bush2 =  new Bush(1.0); // right
		
	}
}
