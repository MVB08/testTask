package com.company.testTask;

import java.util.*;

public class TestClass {

    public void testFunction(String[] mass) {
        Map<String, Set<Integer>> mapArr = new LinkedHashMap<>();
        for (int i = 0; i < mass.length - 1; i++) {
            Set<Integer> integerSet = new HashSet<>();
            for (int j = i + 1; j < mass.length; j++) {

                if (mass[i].length() == mass[j].length()) {
                    char[] charArr = mass[i].toCharArray();
                    Arrays.sort(charArr);
                    char[] charArr1 = mass[j].toCharArray();
                    Arrays.sort(charArr1);
                    if (Arrays.equals(charArr, charArr1)) {
                        integerSet.add(i);
                        integerSet.add(j);
                        mapArr.putIfAbsent(mass[i], integerSet);
                    }
                }
            }
        }
        for (Map.Entry<String, Set<Integer>> entry : mapArr.entrySet()) {
            String key = entry.getKey();
            char[] newChar = key.toCharArray();
            for (char c : newChar) {
                System.out.print(c);
            }
            Set<Integer> value = entry.getValue();
            System.out.println(" = " + value);
        }
    }
}
