package com.ironhack.MathLibrary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MathLibraryTest {

    private MathLibrary math;

@Test
        public void add() {
    MathLibrary result = new MathLibrary();
    assertEquals(-45, result.add(-20, -25));
    assertEquals(-48, result.add(-15, -33));
    assertEquals(-485, result.add(-155, -330));


}
@BeforeEach
@DisplayName("Creates an instance of MathLibrary to use in all tests")
public void setUp() {
 math = new MathLibrary();
}

    @Test
    @DisplayName("Sums a list of positive integers")
    void sumListPositive() {

    List<Integer> numbers = new ArrayList<>();

        numbers.add(125);
        numbers.add(12);
        numbers.add(15);
        numbers.add(1255);
        numbers.add(1258);
    assertEquals(2665, math.sumList(numbers));

    }

    @Test
    @DisplayName("Sums a list of negative integers")
    void sumListNegative() {

    List<Integer> numbers = new ArrayList<>();

        numbers.add(-125);
        numbers.add(-12);
        numbers.add(-15);
        numbers.add(-1255);
        numbers.add(-1258);
    assertEquals(-2665, math.sumList(numbers));
    }

    @Test
    @DisplayName("Sums a list of negative integers")
    void sumListMixed() {

    List<Integer> numbers = new ArrayList<>();

        numbers.add(-125);
        numbers.add(12);
        numbers.add(15);
        numbers.add(-1255);
        numbers.add(-1258);
    assertEquals(-2611, math.sumList(numbers));
    }
}