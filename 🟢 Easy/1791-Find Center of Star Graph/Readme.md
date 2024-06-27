# 1791. Find Center of Star Graph

### `Easy`


<h2 align="center">
<a href="https://leetcode.com/problems/find-center-of-star-graph/description/?envType=daily-question&envId=2024-06-27"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### There is an undirected star graph consisting of `n` nodes labeled from `1` to `n`. A star graph is a graph where there is one center node and exactly `n - 1` edges that connect the center node with every other node.

#### You are given a 2D integer array `edges` where each `edges[i] = [ui, vi]` indicates that there is an edge between the nodes `ui` and `vi`. _Return the center of the given star graph_.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

![star_graph](https://github.com/Purnima47/Purnima47/assets/111565835/9113bc59-dd9a-4771-a66a-9648c5eb7ac4)


| _INPUT_ | _OUTPUT_ |
| :-----------: | :-----------: |
| edges = [[1,2],[5,1],[1,3],[1,4]] | 1 |
</h3>

<h3>
<ins>Explanation:</ins>
</h3>

As shown in the figure above, node 2 is connected to every other node, so 2 is the center.
___
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUT_ | _OUTPUT_ |
| :-----------: | :-----------: |
| edges = [[1,2],[5,1],[1,3],[1,4]] | 1 |



</h3>

___

## Constraints 🔍

> `3 <= n <= 105`</br>
> `edges.length == n - 1` </br>
> `edges[i].length == 2` </br>
> `1 <= ui, vi <= n` </br>
> `ui != vi` </br>
> `The given edges represent a valid star graph`.
___

## Topics 📝

1. Graph

## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/1791-Find%20Center%20of%20Star%20Graph/_1791FindCenterOfStarGraph.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/1791-Find%20Center%20of%20Star%20Graph/_1791FindCenterOfStarGraph.cpp)  |
|![Python](https://img.shields.io/badge/python-3670A0?style=plastic&logo=python&logoColor=ffdd54)| [Python](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/1791-Find%20Center%20of%20Star%20Graph/__1791FindCenterOfStarGraph.py) |
|![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=plastic&logo=javascript&logoColor=%23F7DF1E)| [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/1791-Find%20Center%20of%20Star%20Graph/_1791FindCenterOfStarGraph.js) |
|![C](https://img.shields.io/badge/c-%2300599C.svg?style=plastic&logo=c&logoColor=white)| [C](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/1791-Find%20Center%20of%20Star%20Graph/_1791FindCenterOfStarGraph.c) |
