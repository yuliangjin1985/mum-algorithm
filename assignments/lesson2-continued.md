## Problem 1
Determine the asymptotic running time of the following procedure (an exact computation of number of basic operations is not necessary):

The asymptotic running time of the above procedure is $O(n^2)$.

### Explain (in your own words):
 + What is a decision problem?
 > A problem with ‘yes’ or ‘no’ output.

 + What does it mean to say that a decision problem belongs to NP?
 > NP stands for nondeterministic polynomial, it is a complexity class used to describe certain types of decision problems.

 + What is the Halting Problem?
 > The Halting Problem is to check whether a program will terminate or not with particular inputs.

 + What is a universal Java program?
 > A universal Java program accepts any normal Java Program and BigInteger inputs and runs the program with the inputs and returns the value.

### Why is BigInteger used as an argument for the method of a normal Java program?
 > Because this type of input actually could be any real java input types. It’s a encoded parameter type.

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
