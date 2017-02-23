package enumerated;

import static enumerated.OutCome.*;
import java.util.*;

interface Item {
	OutCome compete(Item it);
	OutCome eval(Paper p);
	OutCome eval(Scissors s);
	OutCome eval(Rock r);
}

class Paper implements Item {

	@Override
	public OutCome compete(Item it) {
		// TODO Auto-generated method stub
		return it.eval(this);
	}

	@Override
	public OutCome eval(Paper p) {
		// TODO Auto-generated method stub
		return DRAW;
	}

	@Override
	public OutCome eval(Scissors s) {
		// TODO Auto-generated method stub
		return WIN;
	}

	@Override
	public OutCome eval(Rock r) {
		// TODO Auto-generated method stub
		return LOSE;
	}
	
	public String toString() { return "Paper"; }
}

class Scissors implements Item  {

	@Override
	public OutCome compete(Item it) {
		// TODO Auto-generated method stub
		return it.eval(this);
	}

	@Override
	public OutCome eval(Paper p) {
		// TODO Auto-generated method stub
		return LOSE;
	}

	@Override
	public OutCome eval(Scissors s) {
		// TODO Auto-generated method stub
		return DRAW;
	}

	@Override
	public OutCome eval(Rock r) {
		// TODO Auto-generated method stub
		return WIN;
	}
	public String toString() { return "Scissors"; }
}

class Rock implements Item {

	@Override
	public OutCome compete(Item it) {
		// TODO Auto-generated method stub
		return it.eval(this);
	}

	@Override
	public OutCome eval(Paper p) {
		// TODO Auto-generated method stub
		return WIN;
	}

	@Override
	public OutCome eval(Scissors s) {
		// TODO Auto-generated method stub
		return LOSE;
	}

	@Override
	public OutCome eval(Rock r) {
		// TODO Auto-generated method stub
		return DRAW;
	}
	public String toString() { return "Rock"; }
}


public class RoshamBo1 {
	static final int SIZE = 20;
	private static Random rand = new Random(47);
	public static Item newItem() {
		switch(rand.nextInt(3)) {
		default:
		case 0: return new Scissors();
		case 1: return new Paper();
		case 2: return new Rock();
		}
	}
	
	public static void match(Item a, Item b) {
		System.out.println(a + " vs. " + b + ": " + a.compete(b));
	}
	
	public static void main(String [] args) {
		for(int i = 0; i < SIZE; i++)
			match(newItem(), newItem());
	}
}
