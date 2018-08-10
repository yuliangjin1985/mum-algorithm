## Problem 1
A. Is the graph G connected? If not, what are the connected components for G?
No, connected components are: (A, B, C, F, H, G),(D, E, I)

B. Draw a spanning tree/forest for G

C. Is G a Hamiltonian graph?
No, because there is no Hamiltonian cycle in this graph.

D. Is there a Vertex Cover of size less than or equal to 5 for G? If so, what is the Vertex Cover?
Yes, the Vertex cover is (D, E, F, A, G).

## Problem 2
Hamiltonian Graphs. The following graph has a Hamiltonian cycle. Find it.

## Problem 3
Vertex Covers. Create an algorithm for computing the smallest size of a vertex cover for a graph. The input of your algorithm is a set V of vertices along with a set E of edges. Assume you have the following functions available (no need to implement these):
 computeEndpoints(edge) – returns the vertices that are at the endpoints of the input edge
 belongsTo(vertex, set) – returns true if the input vertex is a member of the given set
 ![Anser of question 2](https://github.com/yuliangjin1985/mum-algorithm/blob/master/assignments/pics/IMG_4270.JPG)
## Problem 4

 ![Anser of question 2](https://github.com/yuliangjin1985/mum-algorithm/blob/master/assignments/pics/IMG_4271.JPG)

## Problem 5
Write the pesudo-code for compute connected components algorithm discussed in class. Your algorithm can be built on top of DFS discussed in the slides.

 ![Anser of question 2](https://github.com/yuliangjin1985/mum-algorithm/blob/master/assignments/pics/IMG_4274.JPG)

## Problem 6
Write the pesudo-code for the algorithm, discussed in class, that computes the shortest path length between two vertices in a graph. You can assume that: a. The graph is connected. b. A version of BFS is provided that accepts a specified starting vertex.
 ![Anser of question 2](https://github.com/yuliangjin1985/mum-algorithm/blob/master/assignments/pics/IMG_4275.JPG)
