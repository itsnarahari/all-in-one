package com.allinone.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class MultiThreading {


    public static void main(String[] args) {

        List<Callable> callables = new ArrayList<>();
        for(int i=1;i<=5;i++){

            callables.add((Callable<Object>) () -> null);
        }

    }


}
