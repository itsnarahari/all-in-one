package com.allinone.practice;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RemoveDuplicatesWithJava8 {

    public static void main(String[] args) {
//        Integer[] arr = new Integer[]{1, 2, 3, 4, 3, 2, 4, 2};
//        System.out.println(Arrays.stream(arr).findAny());
//        Set<Integer> setWithoutDups = Arrays.stream(arr).collect(Collectors.toSet());
//
//        System.out.println(setWithoutDups);

        Integer[] arr=new Integer[]{100,24,13,44,114,200,40,112};
       OptionalDouble optionalDouble =  Arrays.stream(arr).mapToInt(n -> n*n).filter(n-> n>10000).average();
        System.out.println(optionalDouble.getAsDouble());

        Predicate predicate = new Predicate() {
            @Override
            public boolean test(Object o) {
                return false;
            }
        };

        predicate.test(true);
    }
}
