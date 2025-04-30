//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Exercise Data Type
        int value_int = 20;
        String value_string = "Java";
        double value_double = 23.63;
        System.out.println("my integer: " + value_int + " my String: " + value_string + " my Float: " + value_double);

        //Exercise Operators
        int numberDouble = -20;

        if (numberDouble <= -10 || numberDouble >= 10) System.out.println("the variable is double");
        else System.out.println("The variable is not double");

        //Exercise Conditionals
        int num1 = 2;
        int num2 = 1;
        int num3 = 1;
        int smallest = 0;

        if (num1 <= num2 && num1 <= num3) {
            smallest = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            smallest = num2;
        }else if (num3 <= num1 && num3 <= num2) {
            smallest = num3;
        }
        System.out.println("the smallest value is: " + smallest);

        //String Methods
        //Call Method
        String formatted = productFormatter(" Choco late ", "2025-04-22");
        System.out.println(formatted);
    }

    public static String productFormatter (String productName, String date) {
        //trim
        String result = productName.trim();
        //UpperCase
        result = productName.toUpperCase();
        //Change _
        result = productName.replace(" ", "_");
        //Date at the end
        result = result + date;
        //Return
        return result;


    }
}