package com.allinone.practice;

public class DuplicatePrintTest {

    public static void main(String[] args) {

        int arr[] = {45,6,3,4,7,8,4,5,36,56,12,83,19,43,0,12,12};

        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate "+arr[j]);
                }
            }
        }
    }
}
