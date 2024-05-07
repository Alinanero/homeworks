package de.telran.hw19_01_24;

class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("Invalid login");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}

class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("Invalid password");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}

public class RegistrationValidator {
    public static boolean validateCredentials(String login, String password, String confirmPassword) {
        try {
            validateLogin(login);
            validatePassword(password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Exception caught: " + e.getMessage());
            return false;
        }
    }

    private static void validateLogin(String login) throws WrongLoginException {
        if (!login.matches("[a-zA-Z0-9_]+") || login.length() >= 20) {
            throw new WrongLoginException();
        }
    }

    private static void validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        if (!password.matches("[a-zA-Z0-9_]+") || password.length() >= 20 || !password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
    }

    public static void main(String[] args) {
        // Пример использования метода
        String validLogin = "user123";
        String invalidLogin = "invalid@login";
        String validPassword = "pass123";
        String invalidPassword = "password@123";

        boolean result1 = validateCredentials(validLogin, validPassword, validPassword);
        System.out.println("Validation result 1: " + result1);

        boolean result2 = validateCredentials(invalidLogin, validPassword, validPassword);
        System.out.println("Validation result 2: " + result2);

        boolean result3 = validateCredentials(validLogin, invalidPassword, invalidPassword);
        System.out.println("Validation result 3: " + result3);
    }
}
