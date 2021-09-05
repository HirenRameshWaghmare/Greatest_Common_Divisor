package com.nisren.gcd;

public class Main {
    /**
     * Q. Write a program to find GCD of two numbers with recursion
     * GCD Greatest common divisor
     * is the largest pos integer that divides the number without a reminder
     * gcd(8,12)=4
     * 8=2*2*2
     * 12=2*2*3
     * Euclidean algorithm
     * gcd(a,0)=a
     * gcd(48=a,18=b)
     * Step 1: 48/18 = 2 reminder 12
     * Step 1: 18/12 = 1 reminder 6
     * Step 1: 12/6 = 2 reminder 0
     * gcd=6
     *
     * 1. Write Recursive Case
     * 2. Write Base Case
     * 3. Handle unintentional/wrong input
     */
    public static void main(String[] args) {

        Main recursion = new Main();
        int result = recursion.gcd(48,18);
        System.out.println(result);
    }

    public int gcd(int a, int b){
        //Handle Unintentional/invalid input
        if (a<0 || b<0){
            return -1;
        }
        //Base Case
        if (b==0){
            return a;
        }
        //Recursive Case
        return gcd(b, a%b);
    }

}
