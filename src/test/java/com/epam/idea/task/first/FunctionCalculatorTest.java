package com.epam.idea.task.first;

import com.epam.idea.first.functionLogic.FunctionCalculator;
import org.junit.Assert;
import org.junit.Test;

public class FunctionCalculatorTest {
    @Test
    public void testfindFunctionValueShouldCalculateWhenNumberIsPositive(){
        FunctionCalculator calculator = new FunctionCalculator();
        double value = calculator.findFunctionValue(57);
        Assert.assertEquals(0.4846, value, 0.0001);
    }

    @Test
    public void testfindFunctionValueShouldCalculateWhenNumberIsNegative(){
        FunctionCalculator calculator = new FunctionCalculator();
        double value = calculator.findFunctionValue(-15);
        Assert.assertEquals(0.8559, value, 0.0001);
    }
}
