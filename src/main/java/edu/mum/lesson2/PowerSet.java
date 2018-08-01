package edu.mum.lesson2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PowerSet {

  public static List<Set<Integer>> powerSet(List<Integer> X) {
    List<Set<Integer>> P = new ArrayList<Set<Integer>>();
    HashSet<Integer> S = new HashSet<Integer>();
    P.add(S);
    HashSet<Integer> T = new HashSet<Integer>();
    while(!X.isEmpty()) {
      List<Set<Integer>> temp = new ArrayList<Set<Integer>>();
      Integer f = X.remove(0);
      //When iterate over P, P should not be modified(like adding elements or delete elements during the process of
      // iteration) at the same time, otherwise ConcurrentModificationException will be thrown.
      for (Set<Integer> x : P) {
        T = new HashSet<Integer>(x);
        T.add(f);
        temp.add(T);
      }

      for (Set<Integer> integers : temp) {
        P.add(integers);
      }
    }
    return P;
  }

  public static void main(String[] args) {
    ArrayList<Integer> integers = new ArrayList<Integer>();
    integers.add(5);
    integers.add(6);
    integers.add(7);
    integers.add(8);
    integers.add(9);
    List<Set<Integer>> sets = powerSet(integers);
    for (Set<Integer> set : sets) {
      for (Integer integer : set) {
        System.out.print(integer + " ");
      }
      System.out.println();
    }
  }
}
