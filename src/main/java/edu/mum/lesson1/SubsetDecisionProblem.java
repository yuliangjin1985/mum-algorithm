package edu.mum.lesson1;

import java.util.HashSet;
import java.util.Set;

public class SubsetDecisionProblem {
  public static void main(String[] args) {
    System.out.println(subsetsum(new int[]{1,2,3}, 5));
    System.out.println(subsetsum(new int[]{1,2,3}, 7));
    System.out.println(subsetsum(new int[]{1,2,3}, 6));
  }

  public static Set<Integer> subsetsum(int[] S, int k) {
    if(S == null) return null;

    if(k == 0) return new HashSet<Integer>();

    int len = S.length;

    Set<Set<Integer>> sets = new HashSet<Set<Integer>>();

    sets.add(new HashSet<Integer>());
    for (int i=0;i<len;i++) {
      int num = S[i];
      Set<Set<Integer>> temp = new HashSet<Set<Integer>>();
      for (Set<Integer> set : sets) {
        HashSet<Integer> integers = new HashSet<Integer>(set);
        integers.add(num);
        temp.add(integers);
      }

      for (Set<Integer> integers : temp) {
        sets.add(integers);
      }
    }

    for (Set<Integer> set : sets) {
      int sum = 0;
      for (Integer integer : set) {
        sum += integer;
      }
      if(sum == k) return set;
    }

    return null;
  }
}
