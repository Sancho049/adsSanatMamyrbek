package org.example;

import java.util.Scanner;

public class minelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println(min(n,arr));
    }
    public static int min(int n, int[] arr){
        if(n==0){
            return Integer.MIN_VALUE;
        }
        int min1 = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min1) {
                min1 = arr[i];
            }
        }
        return min1;
    }
}