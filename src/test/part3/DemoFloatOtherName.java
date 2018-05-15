package test.part3;

public class DemoFloatOtherName {
	public static void main(String[] args) {
		DemoFloat demoFloat1 = new DemoFloat();
		DemoFloat demoFloat2 = new DemoFloat();
		demoFloat1.t = 9.0f;
		demoFloat2.t = demoFloat1.t;
		System.out.println(demoFloat2.t);
	}	
}

class DemoFloat {
	float t;
}
