package com.epam.idea.first.data;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConsoleDataAcquier implements DataAcquier {
    Map <String, Integer> numbers = new HashMap<>();
    @Override
    public Map<String, Integer> putNumbersToMap() {
        try(Scanner scanner = new Scanner(System.in)) {
            for (String key : new String[]{"a", "b", "h"}){
                System.out.println("Input " + key + ": ");
                if (scanner.hasNextInt()) {
                    numbers.put(key, scanner.nextInt());
                }else {
                    throw new NullPointerException("Enter only number.");
                }
            }
            return numbers;
        }
    }
    @Override
    public int getNumber(String str){
        return numbers.get(str);
    }
}
