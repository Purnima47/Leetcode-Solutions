# 2045. Second Minimum Time to Reach Destination

### `Hard`


<h2 align="center">
<a href="https://leetcode.com/problems/second-minimum-time-to-reach-destination/description/?envType=daily-question&envId=2024-07-28"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### A city is represented as a bi-directional connected graph with `n` vertices where each vertex is labeled from `1` to `n` (inclusive). The edges in the graph are represented as a 2D integer array edges, where each `edges[i] = [ui, vi]` denotes a bi-directional edge between vertex `ui` and vertex `vi`. Every vertex pair is connected by at most one edge, and no vertex has an edge to itself. The time taken to traverse any edge is `time` minutes.

#### Each vertex has a traffic signal which changes its color from green to red and vice versa every `change` minutes. All signals change at the same time. You can enter a vertex at any time, but can leave a vertex only when the signal is green. You cannot wait at a vertex if the signal is green.

#### The second minimum value is defined as the smallest value strictly larger than the minimum value.

- For example the second minimum value of `[2, 3, 4]` is `3`, and the second minimum value of `[2, 2, 4]` is `4`.

#### Given `n`, `edges`, `time`, and `change`, return the second minimum time it will take to go from vertex `1` to vertex `n`.

#### Notes:

- You can go through any vertex any number of times, including `1` and `n`.

- You can assume that when the journey starts, all signals have just turned green.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

![20e1](https://github.com/user-attachments/assets/56b8378e-73cd-45cd-b23a-5e84501db811)

![2045e2](https://github.com/user-attachments/assets/feff3935-9a63-4396-ac56-bc0cf2418184)



| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `n = 5`, `edges = [[1,2],[1,3],[1,4],[3,4],[4,5]]`, `time = 3`, `change = 5` | `13` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The figure on the left shows the given graph.
The blue path in the figure on the right is the minimum time path.
The time taken is:

- Start at 1, time elapsed=

- 1 -> 4: 3 minutes, time elapsed=3

- 4 -> 5: 3 minutes, time elapsed=6

Hence the minimum time needed is 6 minutes.

The red path shows the path to get the second minimum time.

- Start at 1, time elapsed=0

- 1 -> 3: 3 minutes, time elapsed=3

- 3 -> 4: 3 minutes, time elapsed=6

- Wait at 4 for 4 minutes, time elapsed=10

- 4 -> 5: 3 minutes, time elapsed=13

Hence the second minimum time is 13 minutes.
___
<h3>

<ins>**Example 2**:</ins> </br>

![2045eg2](https://github.com/user-attachments/assets/05e96321-b465-4779-8830-e82bd55df9ed)


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `n = 2`, `edges = [[1,2]]`, `time = 3`, `change = 2` | `11` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The minimum time path is 1 -> 2 with time = 3 minutes.

The second minimum time path is 1 -> 2 -> 1 -> 2 with time = 11 minutes.

___

## Constraints 🔍

> `2 <= n <= 10^4`</br>

> `n - 1 <= edges.length <= min(2 * 10^4, n * (n - 1) / 2)` </br>

> `edges[i].length == 2` </br>

> `1 <= ui, vi <= n` </br>

> `ui != vi` </br>

> There are no duplicate edges. </br>

> Each vertex can be reached directly or indirectly from every other vertex. </br>

> `1 <= time, change <= 10^3`

___

## Topics 📝

1. Breadth - First Search
2. Graph
3. Shortest Path

## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%94%B4%20Hard/2045%20-%20Second%20Minimum%20Time%20to%20Reach%20Destination/_2045SecondMinimumTimeToReachDestination.java) |