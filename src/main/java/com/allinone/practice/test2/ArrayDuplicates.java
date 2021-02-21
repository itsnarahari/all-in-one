package com.allinone.practice.test2;

import java.util.Stack;

public class ArrayDuplicates {

    public static void array_duplicates(int... arr){

        Stack stack = new Stack();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    stack.push(arr[j]);
                }
            }
        }
        System.out.println(stack.pop());
        System.out.println(stack.search(78));
    }

    public static void main(String[] args) {
        int arr[] = {45,78,65,96,36,78,96,1,6,7,9,3,1};
        array_duplicates(arr);
    }
}
