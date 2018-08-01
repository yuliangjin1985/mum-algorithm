package edu.mum.lesson1;

/**
 * GCD Algorithm. Write a Java method int gcd(int m, int n) which accepts positive integer inputs m, n and outputs the
 * greatest common divisor of m and n.
 */
public class GCD {
  public static int gcd(int m, int n) {
    int maxDivisor = 1;
    int divisor = m >= n ? n : m;
    for(int i=1; i <= divisor; i++) {
      if(m % i == 0 && n % i == 0) {
        maxDivisor = i;
      }
    }
    return maxDivisor;
  }

  public static void main(String[] args) {
    System.out.println(gcd(34, 17));
    System.out.println(gcd(33, 17));
    System.out.println(gcd(24, 7));
    System.out.println(gcd(34, 68));
    System.out.println(gcd(23, 17));
    System.out.println(gcd(3, 3));
  }
}
