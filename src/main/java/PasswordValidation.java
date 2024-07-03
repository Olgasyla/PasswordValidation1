

public class PasswordValidation {
    public static void main(String[] args) {


    }
    // Method to Ensure Password is at Least 8 Characters Long
  public static boolean checkLength( String password) {
        if (password.length() == 0) {
            return false;
        }
            return password.length() >= 8;
  }
   // With another method, you want to check if the password contains digits
}
