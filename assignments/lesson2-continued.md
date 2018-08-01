## Problem 2
Assume the running time T(n) for a particular algorithm satisfies the following recurrence relation:
T(1) = c
T(n) = T(n-1) + T(n-1) + T(n-2) + d (for some c, d > 0)
Use the technique of computing running time for the Fib algorithm discussed in class to solve the recurrence.

 ![Anser of question 2](https://github.com/yuliangjin1985/mum-algorithm/blob/master/assignments/pics/guessing_method.jpg)

## Problem 3

 ![Anser of question 3](https://github.com/yuliangjin1985/mum-algorithm/blob/master/assignments/pics/IMG_4160.JPG)
## Problem 4
Devise an iterative algorithm for computing the Fibonacci numbers and compute its running time.
 ![Anser of question 3](https://github.com/yuliangjin1985/mum-algorithm/blob/master/assignments/pics/IMG_4165.JPG)


## 5
 ![Anser of question 3](https://github.com/yuliangjin1985/mum-algorithm/blob/master/assignments/pics/master_formula.jpg)

## Problem 6
You are given a length-n array A consisting of 0s and 1s, arranged in sorted order. Give an o(n) algorithm that counts the total number of 0s and 1s in the array. Your algorithm may not make use of auxiliary storage such as arrays or hashtables (more precisely, the only additional space used, beyond the given array, is O(1)). You must give an argument to show that your algorithm runs in o(n) time.
**Answer:**: Use the binary search to find the index of the first number 1, then the length of the array subtracted by the index is the number of the 1s. Time complexity is O(logn) which is also o(n).

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
