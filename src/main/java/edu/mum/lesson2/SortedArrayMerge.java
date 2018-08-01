package edu.mum.lesson2;

public class SortedArrayMerge {

  public static int[] merge(int[] arr1, int[] arr2) {
    int len1 = arr1.length;
    int len2 = arr2.length;
    int[] arr3 = new int[len1 + len2];
    int a=0, b=0, c=0;
    while(a<len1 && b<len2) {
      if(arr1[a] <= arr2[b]) {
        arr3[c++] = arr1[a++];
      } else {
        arr3[c++] = arr2[b++];
      }
    }
    while(a<len1) {
      arr3[c++] = arr1[a++];
    }
    while (b<len2) {
      arr3[c++] = arr2[b++];
    }
    return arr3;
  }

  public static void main(String[] args) {
    int[] ints = merge(new int[]{1, 3, 6, 8, 10, 30, 100}, new int[]{2, 5, 8, 9, 50, 900});
    for (int anInt : ints) {
      System.out.print(anInt + " ");
    }
  }
}
