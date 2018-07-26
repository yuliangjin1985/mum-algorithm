# Questions and Answers of Lab 2

## 1
Determine the asymptotic running time of the following procedure (an exact computation of number of basic operations is not necessary):

    int[] arrays(int n) {
       int[] arr = new int[n];
       for(int i = 0; i < n; ++i){
            arr[i] = 1;
       }
       for(int i = 0; i < n; ++i) {
          for(int j = i; j < n; ++j){
             arr[i] += arr[j] + i + j;
            }
       }
        return arr;
    }

The asymptotic running time of the above procedure is $O(n^2)$.

## 2
Consider the following problem: As input you are given two sorted arrays of integers. Your objective is to design an algorithm that would merge the two arrays together to form a new sorted array that contains all the integers contained in the two arrays. For example, on input
           [1, 4, 5, 8, 17], [2, 4, 8, 11, 13, 21, 23, 25]
the algorithm would output the following array:
     [1,2,4,4,5,8,8, 11, 13, 17, 21, 23, 25]
For this problem, do the following:

 +  Design an algorithm Merge to solve this problem and write your algorithm description using the pseudo-code syntax discussed in class.
 +  Examining your pseudo-code, determine the asymptotic running time of this merge algorithm
 ![Answer of the above two questions](https://github.com/yuliangjin1985/mum-algorithm/blob/master/assignments/pics/IMG_4151.JPG)
 +  Implement your pseudo-code as a Java method merge having the following signature: int[] merge(int[] arr1, int[] arr2). Be sure to test your method in a main method to be sure it really works!

```java
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

## 3
 ![Anser of question 3](https://github.com/yuliangjin1985/mum-algorithm/blob/master/assignments/pics/IMG_4153.JPG)

