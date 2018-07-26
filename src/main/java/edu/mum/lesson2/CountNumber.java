package edu.mum.lesson2;

public class CountNumber {

  /**
   * You are given a length-n array A consisting of 0s and 1s, arranged in sorted order. Give an o(n) algorithm that counts the total number of 0s and 1s in the array. Your algorithm may not make use of auxiliary storage such as arrays or hashtables (more precisely, the only additional space used, beyond the given array, is O(1)). You must give an argument to show that your algorithm runs in o(n) time.
   * @param ints
   * @return
   */
  public static int countNumber(int[] ints) {
    int len = ints.length;
    if(ints[0] == 1) return len;
    if(ints[len-1] == 0) return 0;
    int index = findFirstOne(ints, 0, ints.length);
    return ints.length - index;
  }

  private static int findFirstOne(int[] ints, int low, int high) {
    int mid = (low + high) / 2;
    if(ints[mid] == 1 && ints[mid-1] == 0) {
      return mid;
    } else if(ints[mid] == 1) {
      return findFirstOne(ints, low, mid -1);
    } else {
      return findFirstOne(ints, mid + 1, high);
    }
  }

  public static void main(String[] args) {
    System.out.println(countNumber(new int[]{0,0,1}));
    System.out.println(countNumber(new int[]{0,0,1,1}));
    System.out.println(countNumber(new int[]{0,0,1,1,1,1,1,1,1,1}));
    System.out.println(countNumber(new int[]{0,0,0,1,1,1,1,1,1,1,1}));
  }
}
