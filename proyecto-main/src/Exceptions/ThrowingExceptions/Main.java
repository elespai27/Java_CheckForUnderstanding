package Exceptions.ThrowingExceptions;

public class Main {
    public static void main(String[] args) {
        String name = null;
        String lastName = "Hidalgo";

        try {
            String fullName = concat(name, lastName);
            System.out.println("Full name: " + fullName);
        } catch (IllegalArgumentException e) {
            System.out.println("error: " + e.getMessage());
        }

    }

    public static String concat(String name, String lastName) {
        if (name == null || name.trim().isEmpty() || lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException(("The name or LastName cannot be Empty or Null"));
        }
        return name + " " + lastName;
    }

}
