package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {      //started the infinity loop to choose a task
            System.out.println("Input a number of the task : ");
            int userChoice = sc.nextInt();// this @param userChoice show us the number of task
            int n;
            int[] arr;
            switch (userChoice) { // we use switch case structure to define the @param of task and start a function
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

    /**
     * this method find the minimum of the given array
     * It iterates through whole array and each step compare current element of array with variable min1 that collect
     * the minimum value of the previous elements of array
     * Time complexity: O(n), where n is the input length of array
     * The algorithm iterates through all elements in array
     * resulting in linear time complexity
     * @param n the length of array
     * @param arr array where we find rhe min element
     * @return the minimum of the array
     */
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

    /**
     * This method finds the average value in the given array.
     * It iterates through the entire array, summing all its elements,
     * and then divides this sum by the number of elements in the array to get the average value.
     * Time complexity: O(n), where n is the input length of the array.
     * The algorithm iterates through all elements in the array, resulting in linear time complexity.
     * @param n the length of the array
     * @param arr the array from which to find the average value
     * @return the average value of the array
     */
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
    /**
     * This method checks if a given number is prime.
     * It first handles edge cases: if the number is less than or equal to 1, it's not prime.
     * If the number is less than or equal to 3, it's prime.
     * Then, it checks divisibility by 2 and 3 to eliminate multiples of these numbers.
     * After that, it iterates through potential divisors starting from 5 up to the square root of the number, checking divisibility.
     * If the number is divisible by any of these potential divisors, it's not prime.
     * Time complexity: O(sqrt(n)), where n is the input number.
     * The algorithm iterates through potential divisors up to the square root of the input number.
     * resulting in square root time complexity
     * @param n the number to check for primality
     * @return true if the number is prime, false otherwise
     */
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
    /**
     * This method calculates the factorial of a given number.
     * It uses a recursive approach.
     * Time complexity: 0(n), where n is the input number.
     * The recursive algorithm iterates through all numbers from n to 1,
     * resulting in linear time complexity.
     * @param n The number for which the factorial is to be calculated.
     * @return The factorial of the given number.
            */
    public static int Factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n* Factorial(n-1);
        }
    }
    /**
     * This method calculates the Fibonacci number at a given position using recursion.
     * It follows the Fibonacci sequence definition: Fib(0) = 0, Fib(1) = 1, and Fib(n) = Fib(n-1) + Fib(n-2) for n > 1.
     * Time complexity: O(2^n), where n is the input number.
     * This is because the algorithm recursively computes Fibonacci numbers, leading to an exponential time complexity.
     * @param n the position in the Fibonacci sequence
     * @return the Fibonacci number at position n
     */
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
    /**
     * This method calculates the power of a given number to an integer exponent using recursion.
     * It follows the exponentiation by squaring algorithm, which is an efficient way to compute powers.
     * Time complexity: O(log n), where n is the exponent.
     * This is because the algorithm effectively halves the exponent at each step, leading to a logarithmic time complexity.
     * @param a the base number
     * @param n the exponent
     * @return the result of raising 'a' to the power of 'n'
     */
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
    /**
     * This method reverses the order of 'n' integers entered by the user.
     * It recursively reads 'n' integers from the user and then prints them in reverse order.
     * Time complexity: O(n), where n is the number of integers entered.
     * The algorithm reads 'n' integers from the user and prints them, resulting in linear time complexity.
     * @param n the number of integers to reverse
     *because this method is static void there isn't return
     */
    public static void reverse(int n){
        if (n==0){
            return;
        }
        Scanner sc = new Scanner(System.in);
        int current = sc.nextInt();
        reverse(n-1);
        System.out.printf("%d ", current);
    }
    /**
     * This method checks if a given string consists only of digits.
     * It recursively checks each character of the string to ensure it's a digit.
     * Time complexity: O(n), where n is the length of the string.
     * The algorithm examines each character of the string once, resulting in linear time complexity.
     * @param s the input string to check
     * @return true if the string consists only of digits, false otherwise
     */
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
    /**
     * This method calculates the binomial coefficient "n choose k" using recursion.
     * It follows Pascal's rule: C(n, k) = C(n-1, k-1) + C(n-1, k), with base cases C(n, 0) = C(n, n) = 1.
     * Time complexity: O(2^n), where n is the larger of 'n' and 'k'.
     * The algorithm recursively computes binomial coefficients by considering all possible combinations,
     * leading to exponential time complexity.
     * @param n the total number of items
     * @param k the number of items to choose
     * @return the binomial coefficient "n choose k"
     */
    public static int binom(int n, int k){
        if(k==0 || k==n){
            return 1;
        }
        return binom(n-1,k-1)+binom(n-1,k);
    }
    /**
     * This method calculates the greatest common divisor (GCD) of two integers 'a' and 'b' using recursion.
     * It uses the Euclidean algorithm to find the GCD.
     * Time complexity: O(log(min(a, b))), where 'a' and 'b' are the input integers.
     * The algorithm reduces the problem size at each step by using modulo operation,
     * resulting in logarithmic time complexity.
     * @param a the first integer
     * @param b the second integer
     * @return the greatest common divisor of 'a' and 'b'
     */
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