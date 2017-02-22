package enumerated.cartoons;

import java.util.Random;

import net.mindview.util.Generator;

enum CartoonCharacter implements Generator<CartoonCharacter> {
	SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;
	
	private Random rand = new Random(47);
	@Override
	public CartoonCharacter next() {
		// TODO Auto-generated method stub
		return values()[rand.nextInt(values().length)];
	}
}

public class EnumImplementation {
	public static <T> void printNext(Generator<T> rg)  {
		System.out.println(rg.next() + ", ");
	}
	
	public static void main(String [] args) {
		CartoonCharacter cc = CartoonCharacter.BOB;
		for (int i = 0; i < 10; i++)
			printNext(cc);
	}
}
