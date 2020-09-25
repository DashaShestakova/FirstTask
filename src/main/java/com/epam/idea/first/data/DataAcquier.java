package com.epam.idea.first.data;

import java.util.Map;

public interface DataAcquier {
    Map<String, Integer> putNumbersToMap();
    int getNumber(String str);
}
