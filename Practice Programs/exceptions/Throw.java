package exceptions;
public class Throw {
	public static void login(String username, String password) {
        System.out.println("Processing login for user: " + username);
        if (!password.equals("Secret123")) {
        	throw new IllegalArgumentException("Access Denied: Incorrect password!");
        }
	}
        public static void main(String[] args) {
            try {
                // 3. Attempting to log in with a wrong password ("wrongPass")
                login("john_doe", "wrongPass");
                
            } catch (IllegalArgumentException e) {
                // 4. Safely intercept the error we threw inside the login method
                System.out.println("Security Alert: " + e.getMessage());
            }
        }
}
