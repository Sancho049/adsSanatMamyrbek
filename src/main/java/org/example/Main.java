package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер задачи :");
            int userChoice = sc.nextInt();
            int n;
            int[] arr;
            switch (userChoice) {
                case 1:
                    n = sc.nextInt();
                    arr = new int[n];
                    for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                    }
                    System.out.println(min(n, arr));
                    break;
                case 2:
                    n = sc.nextInt();
                    arr = new int[n];
                    for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                    }
                    System.out.println(average(n,arr));
                    break;
                case 3:
                    n = sc.nextInt();
                    if (Prime_(n)){
                        System.out.println("prime");
                    }
                    else{
                        System.out.println("composite");
                    }
                    break;
                case 4:
                    n = sc.nextInt();
                    System.out.println(Factorial(n));
            }
        }
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
    public static double average(int n, int[] arr){
        if(n==0){
            return 0;
        }
        int aver=0;
        for (int i = 0; i < n; i++) {
            aver =(aver+arr[i] ) ;
        }
        return (double) aver/n;
    }
    public static boolean Prime_(int n) {

        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    public static int Factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n* Factorial(n-1);
        }
    }
}