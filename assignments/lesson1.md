## Problem 1
Short Answer and Coding. The questions for Problem 1 are mostly about the Halting Problem, and the discussion given in the slides for Lesson 1.
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

### Halting Problem
When you examine the code in HaltingCalculator, it seems obvious that the halts method will never be able to detect that an input program fails to terminate normally, unless the program happens to throw a runtime exception (if, however, the input program goes into an infinite loop, the halts method has no way to detect this). So, it should be obvious that we have failed to provide an algorithm that solves the Halting Problem. Why don’t these observations provide us with a proof that there is no algorithmic solution to the Halting Problem?
 > This version of HaltingCalculator does not produce proper output when halts method enters into an infinite loop. If we change the logic of the HaltingCalculator it might produce right output even through the halts enters into an infinite loop. So, this could not prove that there is no solution for halting problems. The example of SelfApp could prove that the HaltProblem is unresolvable.

## Problem 2
GCD Algorithm. Write a Java method int gcd(int m, int n) which accepts positive integer inputs m, n and outputs the greatest common divisor of m and n.
   public static int gcd(int m, int n) {
       int maxDivisor = 1;
       int divisor = m >= n ? n : m;
       for(int i=1; i <= divisor; i++) {
         if(m % i == 0 && n % i == 0) {
           maxDivisor = i;
         }
       }
       return maxDivisor;
     }

## Problem 3
Brute Force Solution. Formulate your own procedure for solving the SubsetSum Problem. Think of it as a Java method subsetsum that accepts as input S,k, and outputs a subsetT ofSwiththepropertythatthesumofthesi inT iskifsuchaT exists,ornullifno such T can be found. (A non-null return value can be thought of as a return of “true” and a null return value signifies “false.”) Implement your idea in Java code.

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
      }```
## Problem 4
Suppose you have been given a solution T to an instance of the SubsetSum problem with S = {s0, s1, . . . , sn−1} and k some non-negative integer. (Recall that T is a solution if it is a subset of S the sum of whose elements is equal to k.) Suppose that sn−1 belongs to T. Is it necessarily true that the set T − {sn−1} is a solution to the SubsetSum problem with inputs S′,k′ whereS′ ={s0,s1,...,sn−2}andk′ =k−sn−1? Explain. Hint. Thesumofanemptyset of integers is (by convention) equal to 0.
 > It's true that  T − {sn−1} is a solution. Because the sum of T is equal to k, and the sum of T - {sn-1} is equal to k - sn-1, so it's still a solution.
