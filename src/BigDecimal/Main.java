package BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        BigDecimal number1 = new BigDecimal(2.6987);
        BigDecimal number2 = new BigDecimal(3.986);

        System.out.println(number1.add(number2).setScale(2, RoundingMode.HALF_EVEN));
        System.out.println(number1.subtract(number2));
        System.out.println(number1.multiply(number2));
        System.out.println(number1.divide(number2, 2, RoundingMode.HALF_UP));


    }
}
