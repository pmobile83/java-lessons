package ru.sber.javaschool;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArithmeticOperationsTest {

    static ArithmeticOperations ao;

    @BeforeClass
    public static void init () {
        ao = new ArithmeticOperations();
    }

    @Test
    public void addition() {
        int addition = ao.addition(5,7);
        assertEquals(12, addition);
    }

    @Test
    public void subtraction() {
        int subtraction = ao.subtraction(15,8);
        assertEquals(7, subtraction);
    }

    @Test
    public void multiplication() {
        int multiplication = ao.multiplication(2,9);
        assertEquals(18, multiplication);
    }

    @Test
    public void division() {
        double division = ao.division(9.0,3.0);
        assertEquals(3.0,division,0.0);
    }

    @Test
    public void power() {
        long power = ao.power(7,4);
        assertEquals(2401, power);
    }

    @Test
    public void compare() {
        String compare = ao.compare(25,20);
        assertEquals("Первое число больше второго на: 5", compare);
    }

    @Test
    public void greatestCommonFactor() {
        int greatestCommonFactor = ao.greatestCommonFactor(12,9);
        assertEquals(3, greatestCommonFactor);
    }
}
