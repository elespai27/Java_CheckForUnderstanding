package Exceptions.ExceptionsThrows;

public class StringConverter {

   private int number;

    public StringConverter() {
        this.number = 0;
    }

    public int getNumber() {
        return number;
    }

    public int convertToInt (String stringUser) throws NumberFormatException {

        try {
            this.number = Integer.parseInt(stringUser);
            System.out.println(this.number);
        } catch (NumberFormatException ex) {
            System.err.println("invalid input, default value: " + 0);

        }


return this.number;
    }

}
