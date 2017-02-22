package enumerated;

import static net.mindview.util.Print.*;

public enum OzWitch {
	WEST("Miss Glach, aka the Wicked Witch of the West"),
	NORTH("Glinda, the Good Witch of the North"),
	EAST("Wicked Witch of the East, wearer of the Ruby " + "Splippers, crushed by Dorothy's house"),
	SOUTH("Good by inference, but missing");
	
	private String description;
	private OzWitch(String description) { this.description = description; }
	
	public String getDescription() { return description; }
	
	public static void main(String [] args) {
		for (OzWitch witch : OzWitch.values()) {
			print(witch + ": " + witch.getDescription());
		}
	}
}
