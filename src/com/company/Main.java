package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[7];
        int[] sortedArr = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            System.out.println("enter a number for sorting");
            arr[i] = Integer.parseInt( scanner.nextLine() );
        }

        for(int i=0; i<sortedArr.length; i++){
            int orderChecker = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[j] < arr[i]){
                    orderChecker++;
                }
            }
            while(arr[i] == sortedArr[i]){
                orderChecker++;
            }
            sortedArr[orderChecker] = arr[i];
        }

        for(int i=0; i<sortedArr.length; i++){
            System.out.println(sortedArr[i]);
        }
    }
}
