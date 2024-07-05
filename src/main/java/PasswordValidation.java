

public class PasswordValidation {
    public static void main(String[] args) {

    }
    // Method to Ensure Password is at Least 8 Characters Long
  public static boolean checkLength( String password) {
        if (password.length() >= 8) {
            return true;
        } return false; // return password.lenght ()>=8;
      }

  // With another method, you want to check if the password contains digits
    public static boolean checkDigit( String password) {
        return password.matches(".*[0-9].*");
    }
    public static boolean checkUpperCase( String password) {
        return password.matches(".*[A-Z].*");
    }
    public static boolean checkLowerCase( String password) {
        return password.matches(".*[a-z].*");


    }}