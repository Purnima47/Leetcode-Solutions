# 2192. All Ancestors of a Node in a Directed Acyclic Graph

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/all-ancestors-of-a-node-in-a-directed-acyclic-graph/description/"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### You are given a positive integer `n` representing the number of nodes of a Directed Acyclic Graph (DAG). The nodes are numbered from `0` to `n - 1` (inclusive).

#### You are also given a 2D integer array `edges`, where `edges[i] = [fromi, toi]` denotes that there is a unidirectional edge from `fromi` to `toi` in the graph.

#### Return a list `answer`, where `answer[i]` is the list of ancestors of the `ith` node, sorted in ascending order.

#### A node u is an ancestor of another node `v` if `u` can reach `v` via a set of edges.


---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

![2192_e1](https://github.com/user-attachments/assets/a1eae3ee-7a2b-40ff-8a7c-695999c0131b)

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `n = 8`, `edgeList = [[0,3],[0,4],[1,3],[2,4],[2,7],[3,5],[3,6],[3,7],[4,6]]` | `[[],[],[],[0,1],[0,2],[0,1,3],[0,1,2,3,4],[0,1,2,3]]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>
The above diagram represents the input graph.

1. Nodes 0, 1, and 2 do not have any ancestors.
2. Node 3 has two ancestors 0 and 1.
3. Node 4 has two ancestors 0 and 2.
4. Node 5 has three ancestors 0, 1, and 3.
5. Node 6 has five ancestors 0, 1, 2, 3, and 4.
6. Node 7 has four ancestors 0, 1, 2, and 3.

___
<h3>

<ins>**Example 2**:</ins> </br>

![2192_e2](https://github.com/user-attachments/assets/d258ae56-2d0f-4263-b3e9-edd7b4cff695)

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `n = 5`, `edgeList = [[0,1],[0,2],[0,3],[0,4],[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]` | `[[],[0],[0,1],[0,1,2],[0,1,2,3]]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>
The above diagram represents the input graph.

1. Node 0 does not have any ancestor.
2. Node 1 has one ancestor 0.
3. Node 2 has two ancestors 0 and 1.
4. Node 3 has three ancestors 0, 1, and 2.
5. Node 4 has four ancestors 0, 1, 2, and 3.

___

## Constraints 🔍

> `1 <= n <= 1000`</br>
> `0 <= edges.length <= min(2000, n * (n - 1) / 2`</br>
>`edges[i].length == 2` </br>
> `0 <= fromi, toi <= n - 1` </br>
> `fromi != toi` </br>
> There are no duplicate edges. </br>
> The graph is directed and acyclic.

___

## Topics 📝

1. Depth-First Search
2. Breadth-First Search
3. Graph
4. Topological Sort

## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2192%20-%20All%20Ancestors%20of%20a%20Node%20in%20a%20Directed%20Acylic%20Graph/_2192AllAncesOfANodeInADirectedAcyclicGraph.java) |
