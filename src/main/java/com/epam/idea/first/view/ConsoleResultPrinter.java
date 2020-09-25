package com.epam.idea.first.view;

import com.epam.task.second.functionLogic.FunctionCalculator;

public class ConsoleResultPrinter implements ResultPrinter {
    FunctionCalculator f1 = new FunctionCalculator();

    @Override
    public void print(int a, int b, int h) {
        System.out.printf("%7s %9s\n", "X", "F(X)");
        for (int x = a; x <= b; x += h) {
            System.out.printf("%7d  %9.2f\n", x, f1.findFunctionValue(x));
        }
    }
}
