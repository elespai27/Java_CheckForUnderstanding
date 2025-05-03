package Exceptions.ExceptionsThrows;

public class Main {
    public static void main(String[] args) {
       StringConverter number = new StringConverter();
       number.convertToInt("125");
       number.convertToInt("abc");

    }
}
