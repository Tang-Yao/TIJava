package Demo;

public class DemoStringInit {
	public static void main(String[] args) {
		//new DemoString();
		System.out.println(new DemoString().string);
	}
}

class DemoString {
	public DemoString() {
		// TODO Auto-generated constructor stub
	}
	String string;
}

class DemoStringFirst {
	String string = "hello";
	public DemoStringFirst() {
		// TODO Auto-generated constructor stub
		String world = "world";
	}
}
