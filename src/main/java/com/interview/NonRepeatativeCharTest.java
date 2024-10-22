package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatativeCharTest {
    public static void main(String[] args) {
        String st = "manishh";
        nonRepeatativeChar(st);
    }

    private static void nonRepeatativeChar(String st) {
       char[] ch = st.toCharArray();
        Map<String, Long> map = Arrays.asList(st.split("")).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<String> list =  map.entrySet().
                stream().filter(ma -> ma.getValue() < 2).
                map(m -> m.getKey())
                .collect(Collectors.toList());
        System.out.println(map);
        System.out.println(list);
    }
}
