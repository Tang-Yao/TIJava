package annotations;

import java.util.*;

public class PasswordUtils {
	@UseCase(id = 47, description = "Password must contain at least on numeric")
	public boolean validatePassword(String password) {
		return (password.matches("\\w*\\d\\w*"));
	}
	
	@UseCase(id = 48)
	public String entryptPassword(String password) {
		return new StringBuilder(password).reverse().toString();
	}
	
	@UseCase(id = 49, description = "New passwords can't equal priviously used ones")
	public boolean checkForNewPassword(List<Integer> prevPasswords, String password) {
		return !prevPasswords.contains(password);
	}
}
