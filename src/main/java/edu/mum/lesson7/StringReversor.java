package edu.mum.lesson7;

import java.util.Stack;

public class StringReversor {
  public static String reverse(String s) {
    String[] split = s.split(" ");
    StringBuilder stringBuilder = new StringBuilder();
    for (String s1 : split) {
      stringBuilder.append(reverseWord(s1) + " ");
    }
    return stringBuilder.toString();
  }

  public static String reverseByStack(String s) {
    StringBuilder stringBuilder = new StringBuilder();
    Stack<Character> characters = new Stack<Character>();
    char[] chars = s.toCharArray();
    for(int i=0;i<chars.length;i++) {
      if(' ' != chars[i]) {
        characters.push(chars[i]);
      } else {
        while (!characters.isEmpty()) {
          stringBuilder.append(characters.pop());
        }
        stringBuilder.append(' ');
      }
    }

    while (!characters.isEmpty()) {
      stringBuilder.append(characters.pop());
    }
    return stringBuilder.toString();
  }

  private static String reverseWord(String s) {
    StringBuilder stringBuilder = new StringBuilder();
    char[] chars = s.toCharArray();
    for(int i=chars.length-1;i>=0;i--) {
      stringBuilder.append(chars[i]);
    }
    return stringBuilder.toString();
  }

  public static void main(String[] args) {
    System.out.println(reverse("we test coders"));
    System.out.println(reverseByStack("we test coders"));
  }
}
