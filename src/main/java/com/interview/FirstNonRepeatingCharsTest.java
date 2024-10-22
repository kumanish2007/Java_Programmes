package org.example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonRepeatingCharsTest {
    public static void main(String[] args) {
    String s = "apple";
        nonRepeatingChars(s);
        test();
        Integer i1 = 12;
        Integer i2 = 12;
        System.out.println(i1==i2);
    }

    private static void nonRepeatingChars(String st){
        LinkedHashMap<String, Long> map = Stream.of(st.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.printf("Map values : "+ map);
        String nonRepeat = map.entrySet().stream().filter(m -> m.getValue() == 1).map(a -> a.getKey()).findFirst().get();
        System.out.printf("Non repeating char :"+ nonRepeat);
    }

    private static void test(){
        Object obj = "This is a string";
        if(obj instanceof Integer){
            Integer i = (Integer) obj;
            System.out.printf(i.toString());
        }
    }
}
