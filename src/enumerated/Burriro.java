package enumerated;

public class Burriro {
	Spiciness degress;
	public Burriro(Spiciness degress) { this.degress = degress; }
	
	public String toString() { return "Burrito is " + degress; }
	
	public static void main(String[] args) {
		System.out.println(new Burriro(Spiciness.NOT));
		System.out.println(new Burriro(Spiciness.MEDIUM));
		System.out.println(new Burriro(Spiciness.HOT));
	}
}
