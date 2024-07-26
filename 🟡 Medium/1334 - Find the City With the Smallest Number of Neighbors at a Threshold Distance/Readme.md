# 1334. Find the City With the Smallest Number of Neighbors at a Threshold Distance

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance/description/?envType=daily-question&envId=2024-07-26"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### There are `n` cities numbered from `0` to `n-1`. Given the array `edges` where `edges[i] = [fromi, toi, weighti]` represents a bidirectional and weighted edge between cities `fromi` and `toi`, and given the integer `distanceThreshold`.

#### Return the city with the smallest number of cities that are reachable through some path and whose distance is at most `distanceThreshold`, If there are multiple such cities, return the city with the greatest number.

#### Notice that the distance of a path connecting cities `i` and `j` is equal to the sum of the edges' weights along that path.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

![1334_find_the_city_01](https://github.com/user-attachments/assets/0a09bfca-ccca-40dc-a779-22f650cccc02)


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `n = 4, edges = [[0,1,3],[1,2,1]`,`[1,3,4],[2,3,1]]`, `distanceThreshold = 4` | `3` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The figure above describes the graph. 
The neighboring cities at a distanceThreshold = 4 for each city are:
City 0 -> [City 1, City 2] 
City 1 -> [City 0, City 2, City 3] 
City 2 -> [City 0, City 1, City 3] 
City 3 -> [City 1, City 2] 
Cities 0 and 3 have 2 neighboring cities at a distanceThreshold = 4, but we have to return city 3 since it has the greatest number.

___
<h3>

<ins>**Example 2**:</ins> </br>

![1334_find_the_city_02](https://github.com/user-attachments/assets/569a74ff-90ca-4979-a50d-79db6af7ebba)

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `n = 5,` `edges = [[0,1,2],[0,4,8],[1,2,3],[1,4,2],[2,3,1],[3,4,1]]`, `distanceThreshold = 2` | `0` |

</h3>

___

## Constraints 🔍

> `2 <= n <= 100`</br>
> `1 <= edges.length <= n * (n - 1) / 2` </br>
> `edges[i].length == 3` </br>
> `0 <= fromi < toi n` </br>
> `1 <= weighti, distanceThreshold <= 10^4` </br>
> All pairs `(fromi, toi)` are distinct.
___

## Topics 📝

1. Dynamic Programming
2. Graph
3. Shortest Path

## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1334%20-%20Find%20the%20City%20With%20the%20Smallest%20Number%20of%20Neighbors%20at%20a%20Threshold%20Distance/_1334FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1334%20-%20Find%20the%20City%20With%20the%20Smallest%20Number%20of%20Neighbors%20at%20a%20Threshold%20Distance/_1334FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance.cpp)  |
