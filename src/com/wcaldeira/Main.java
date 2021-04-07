package com.wcaldeira;

public class Main {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int lastIndex = intArray.length - 1; lastIndex > 0; lastIndex --){

            for (int i = 0; i < lastIndex; i ++){

                if (intArray[i] > intArray[i + 1]){
                    swap(intArray, i, i+1);
                }

            }
        }

        for (int elemt : intArray){
            System.out.println(elemt);
        }
    }

    public static void swap(int [] listItens, int i, int j){
        if(i == j){
            return;
        }

        int temp = listItens[i];
        listItens[i] = listItens[j];
        listItens[j] = temp;
    }
}
