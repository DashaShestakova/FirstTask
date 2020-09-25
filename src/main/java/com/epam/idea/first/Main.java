package com.epam.idea.first;


import com.epam.idea.first.data.DataAcquier;
import com.epam.idea.first.data.DataAcquierFactory;
import com.epam.idea.first.view.ConsoleResultPrinter;
import com.epam.idea.first.view.ResultPrinter;

public class Main {
    public static void main(String[] args) {
        //получить значения
        DataAcquier dataAcquier = DataAcquierFactory.createDataAcquier("console");
        dataAcquier.putNumbersToMap();
        int a = dataAcquier.getNumber("a");
        int b = dataAcquier.getNumber("b");
        int h = dataAcquier.getNumber("h");

        //рассчет и вывод результата
        ResultPrinter resultPrinter = new ConsoleResultPrinter();
        resultPrinter.print(a, b, h);
    }
}
