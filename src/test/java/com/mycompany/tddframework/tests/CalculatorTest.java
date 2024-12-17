package com.mycompany.tddframework.tests;

import com.mycompany.tddframework.core.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {

        var calculator = new Calculator();

        int result = calculator.add(3,2);

        Assertions.assertEquals(5, result, "2 + 3 should equal 5");

    }

}
