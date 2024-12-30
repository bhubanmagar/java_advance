// Step 1: Create a custom checked exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message); // Pass the message to the parent Exception class
    }
}

public class costumExceptionDemo {
    public static void main(String[] args) {
        try {
            // Step 2: Call a method that may throw the custom exception
            registerUser(15); // Throws the custom exception
        } catch (InvalidAgeException e) {
            // Step 3: Handle the custom exception
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }

    public static void registerUser(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18 to register.");
        } else {
            System.out.println("User registered successfully!");
        }
    }
}
