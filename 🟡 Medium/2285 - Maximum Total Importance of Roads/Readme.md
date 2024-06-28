# 2285. Maximum Total Importance of Roads

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/maximum-total-importance-of-roads/?envType=daily-question&envId=2024-06-28"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### You are given an integer `n` denoting the number of cities in a country. The cities are numbered from `0` to `n - 1`.

#### You are also given a 2D integer array `roads` where `roads[i] = [ai, bi]` denotes that there exists a bidirectional road connecting cities `ai` and `bi`.

#### You need to assign each city with an integer value from `1 to n`, where each value can only be used once. The _importance_ of a road is then defined as the _sum_ of the values of the two cities it connects.

#### Return _the maximum total importance of all roads possible after assigning the values optimally_.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

![ex1drawio2285](https://github.com/Purnima47/Leetcode-Solutions/assets/111565835/6bdc4948-9146-4ad9-81d8-310b281cf789)


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
|  `n = 5`, `roads = [[0,1],[1,2],[2,3],[0,2],[1,3],[2,4]]` | `43` |
</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The figure above shows the country and the assigned values of [2,4,5,3,1].
- The road (0,1) has an importance of 2 + 4 = 6.
- The road (1,2) has an importance of 4 + 5 = 9.
- The road (2,3) has an importance of 5 + 3 = 8.
- The road (0,2) has an importance of 2 + 5 = 7.
- The road (1,3) has an importance of 4 + 3 = 7.
- The road (2,4) has an importance of 5 + 1 = 6.
The total importance of all roads is 6 + 9 + 8 + 7 + 7 + 6 = 43.
It can be shown that we cannot obtain a greater total importance than 43.
___
<h3>

<ins>**Example 2**:</ins> </br>

![ex2drawio2285](https://github.com/Purnima47/Leetcode-Solutions/assets/111565835/9197985a-19a0-47d5-801c-c8933c9900f1)

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `n = 5`, `roads = [[0,3],[2,4],[1,3]]` |  `20` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The figure above shows the country and the assigned values of [4,3,2,5,1].
- The road (0,3) has an importance of 4 + 5 = 9.
- The road (2,4) has an importance of 2 + 1 = 3.
- The road (1,3) has an importance of 3 + 5 = 8.
The total importance of all roads is 9 + 3 + 8 = 20.
It can be shown that we cannot obtain a greater total importance than 20.
___

## Constraints 🔍

> `2 <= n <= 5 * 104`</br>
> `1 <= roads.length <= 5 * 104` </br>
> `roads[i].length == 2` </br>
> `0 <= ai, bi <= n - 1` </br>
> `ai != bi` </br>
> `There are no duplicate roads.`
___

## Topics 📝

1. Greedy
2. Graph
3. Sorting
4. Heap (Priority Queue)

## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/1791-Find%20Center%20of%20Star%20Graph/_1791FindCenterOfStarGraph.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/1791-Find%20Center%20of%20Star%20Graph/_1791FindCenterOfStarGraph.cpp)  |
|![Python](https://img.shields.io/badge/python-3670A0?style=plastic&logo=python&logoColor=ffdd54)| [Python](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/1791-Find%20Center%20of%20Star%20Graph/__1791FindCenterOfStarGraph.py) |
|![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=plastic&logo=javascript&logoColor=%23F7DF1E)| [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/1791-Find%20Center%20of%20Star%20Graph/_1791FindCenterOfStarGraph.js) |
