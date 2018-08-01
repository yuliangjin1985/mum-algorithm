package edu.mum.lesson2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RemoveDuplicate {
  public static List<Integer> removeDups(List<Integer> L) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (Integer integer : L) {
      if(!map.containsKey(integer)) {
        map.put(integer, 1);
        list.add(integer);
      }
    }
    return list;
  }

  public static void main(String[] args) {
    ArrayList<Integer> integers = new ArrayList<Integer>();
    integers.add(5);
    integers.add(5);
    integers.add(5);
    integers.add(5);
    integers.add(5);
    integers.add(6);
    integers.add(7);
    integers.add(9);

    for (Integer integer : integers) {
      System.out.print(integer + " ");
    }

    System.out.println();
    List<Integer> integers1 = removeDups(integers);
    for (Integer integer : integers1) {
      System.out.print(integer + " ");
    }
  }
}
