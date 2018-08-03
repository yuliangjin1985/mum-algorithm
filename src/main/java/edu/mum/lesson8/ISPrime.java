package edu.mum.lesson8;

public class ISPrime {


  public static boolean isPrime(int number) {
    int sqrt = (int) Math.sqrt(number) + 1;
    for (int i = 2; i < sqrt; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }

}
