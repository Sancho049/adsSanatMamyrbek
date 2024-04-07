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
                    break;
                case 5:
                    n= sc.nextInt();
                    System.out.println(Fib(n));
                    break;
                case 6:
                    double a= sc.nextInt();
                    n= sc.nextInt();
                    System.out.println(Pow(a,n));
                    break;
                case 7:
                    n = sc.nextInt();
                    reverse(n);
                    System.out.println();
                    break;
                case 8:
                    sc.nextLine();
                    String s = sc.nextLine();
                    System.out.println(digits(s));
                    break;
                case 9:
                    n= sc.nextInt();
                    int k= sc.nextInt();
                    System.out.println(binom(n,k));
                    break;
                case 10:
                    int d= sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println(gcd(d,b));
                    break;
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
    public static int Fib(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return Fib(n-1)+Fib(n-2);
        }
    }
    public static double Pow(double a,int n){
        if(n==0){
            return 1;
        }
       else if (n%2==0){
           return Pow(a*a,n/2);
        }
       else{
           return a*Pow(a,n-1);
        }
    }
    public static void reverse(int n){
        if (n==0){
            return;
        }
        Scanner sc = new Scanner(System.in);
        int current = sc.nextInt();
        reverse(n-1);
        System.out.printf("%d ", current);
    }
    public static boolean digits(String s){
        if(s.isEmpty()){
            return true;
        }
        char first=s.charAt(0);
        if (!Character.isDigit(first)){
            return false;
        }
        else{
            return digits(s.substring(1));
        }
    }
    public static int binom(int n, int k){
        if(k==0 || k==n){
            return 1;
        }
        return binom(n-1,k-1)+binom(n-1,k);
    }
    public static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }
        if (a>b){
            return gcd(a%b,b);
        }
        else{
            return gcd(a,b%a);
        }
    }
}