## Problem 1
Determine the asymptotic running time of the following procedure (an exact computation of number of basic operations is not necessary):

    int[] arrays(int n) {
                   int[] arr = new int[n];
                   for(int i = 0; i < n; ++i){
    arr[i] = 1;
                   }
                   for(int i = 0; i < n; ++i) {
                      for(int j = i; j < n; ++j){
                         arr[i] += arr[j] + i + j;
    } }
    return arr; }

The asymptotic running time of the above procedure is $$O(n^2)$$.

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

## Problem 2
When you examine the code in HaltingCalculator, it seems obvious that the halts method will never be able to detect that an input program fails to terminate normally, unless the program happens to throw a runtime exception (if, however, the input program goes into an infinite loop, the halts method has no way to detect this). So, it should be obvious that we have failed to provide an algorithm that solves the Halting Problem. Why don’t these observations provide us with a proof that there is no algorithmic solution to the Halting Problem?