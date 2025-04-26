package Loops;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //#1 Create a new array multipliying that value by the value of the next position
        int [] numbers = {5, 4, 3, 2, 1};
        int [] numbersMult = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            //se usa módulo para que el último se multiplique por el primero
            int nextIndex = (i + 1) % numbers.length;
            numbersMult[i] = numbers[i] * numbers[nextIndex];
        }
        //Mostrar resultados

        for (int i = 0; i < numbersMult.length; i++) {
            System.out.println(numbersMult[i]);
        }
        //#2 New array in a inverted version

        int[] numbers2 = {1, 2, 3, 4, 5};
        int[] numbersInverted = new int[numbers2.length];

        for (int i = numbers2.length - 1 ; i >= 0; i--) {
            numbersInverted[i] = numbers2[i];
            System.out.println(numbersInverted[i]);
        }

    }
}