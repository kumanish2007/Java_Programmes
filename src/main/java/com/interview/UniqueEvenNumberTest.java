package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UniqueEvenNumberTest {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> l2 = Arrays.asList(3,4,5,67,4);
        List<Integer> l3 = Arrays.asList(4,0,1,0,1);

        List<List<Integer>> l4 = Arrays.asList(l1, l2, l3);
        //ele%2==0
        List<Integer> l5 = l4.stream().flatMap(l -> l.stream()).collect(Collectors.toList());
        System.out.println("List value" + l5);
        Optional<Integer> opt = l5.stream().filter(e -> e%2==0).map(n -> n*2).findFirst();
        if(opt.isPresent()){
            System.out.println(opt.get());
        }
    }
}
