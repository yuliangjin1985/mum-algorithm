## Problem 1
Must every dense graph be connected? Explain.
No, A dense graph is a graph with theta(n^2) edges, it's not necessarily a connected graph.

## Problem 2

 ![Anser of question 2](https://github.com/yuliangjin1985/mum-algorithm/blob/master/assignments/pics/IMG_4286.JPG)
## Problem 3
a. There is no shortest path.
b. The Dijkstra's approach is better. Cause BFS search become too high when the weight between becomes bigger(say 10000, the height would be at lest 10000)

## Problem 4
Describe an algorithm for deleting a key from a heap-based priority queue that runs in O(log n) time, where n is the number of nodes. (Hint: You may use auxiliary storage as the priority queue is built and maintained. Assume there are no two nodes have the same key.) This technique is needed for the optimized Dijkstra algorithm discussed in the slides.
a. Store the heap using an array
b. Add a hash table the key is the value of the vertex, and the value is the index of the vertex in the array of the heap.
c. Whenever add a vertex, remove the root, down heap operation happens, update the hash table to make sure any time the hash table store the accurate values
d. When to delete a vertex, locate it takes O(1) and rebalence operation takes O(logn), so the deletion also takes O(logn)

## Problem 5
 ![Anser of question 2](https://github.com/yuliangjin1985/mum-algorithm/blob/master/assignments/pics/IMG_4303.JPG)

## Problem 6
The goal of this exercise is to devise a feasible algorithm that decides whether an input integer is prime.
Because the right output of this algorithm each time is 1/2, so in the for loop execute the algorithm a few times the probability of success would be increased.
