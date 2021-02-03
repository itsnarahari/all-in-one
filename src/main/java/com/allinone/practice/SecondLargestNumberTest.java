package com.allinone.practice;

public class SecondLargestNumberTest {

    public static void main(String[] args) {
        int arr[] = {45,6,3,4,7,8,4,5,36,56,12,83,19,43,0};
        int first=0;int second=0;
        for(int obj: arr){

            if(first<obj){
                second = first;
                first=obj;
            }else if(second<obj){
                second=obj;
            }
        }
        System.out.println(second);
    }
}
