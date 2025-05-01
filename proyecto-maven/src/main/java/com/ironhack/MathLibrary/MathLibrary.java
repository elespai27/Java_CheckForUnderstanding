package com.ironhack.MathLibrary;

import java.util.ArrayList;
import java.util.List;

public class MathLibrary {


    public int add(int number1, int number2) {

        return number1 + number2;

    }

    public int sumList(List<Integer> numbers) {


//        List<Integer> numbers = new ArrayList<>();
//
//        numbers.add(125);
//        numbers.add(12);
//        numbers.add(15);
//        numbers.add(1255);
//        numbers.add(1258);

        int sum = 0;
        for (int num : numbers){
            sum += num;
        }

        return sum;
    }
}
