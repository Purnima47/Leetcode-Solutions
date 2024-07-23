# 1552. Magnetic Force Between Two Balls 

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/magnetic-force-between-two-balls/description/"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### In the universe Earth C-137, Rick discovered a special form of magnetic force between two balls if they are put in his new invented basket. Rick has `n` empty baskets, the `ith` basket is at `position[i]`, Morty has `m` balls and needs to distribute the balls into the baskets such that the minimum magnetic force between any two balls is maximum.

#### Rick stated that magnetic force between two different balls at positions `x` and `y` is `|x - y|`.

#### Given the integer array `position` and the integer `m`. Return the required force.


---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

![1552_q3v1](https://github.com/user-attachments/assets/7eb919bf-5856-484e-b708-e21e499e78d0)


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `position = [1,2,3,4,7]`, `m = 3` | `3` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

Distributing the 3 balls into baskets 1, 4 and 7 will make the magnetic force between ball pairs [3, 3, 6]. The minimum magnetic force is 3. We cannot achieve a larger minimum magnetic force than 3.

___
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `position = [5,4,3,2,1,1000000000]`, `m = 2` | `999999999` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

We can use baskets 1 and 1000000000.

___

## Constraints 🔍

> `n == position.length`</br>

> `2 <= n <= 10^5` </br>

> `1 <= position[i] <= 10^9` </br>

> All integers in position are `distinct`. </br>

> `2 <= m <= position.length`

___

## Topics 📝

1. Array
2. Binary Search
3. Sorting

## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1552%20Magnetic%20Force%20Between%20Two%20Balls/_1552MagForceBW2Balls.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1552%20Magnetic%20Force%20Between%20Two%20Balls/_1552MagForceBW2Balls.cpp)  |
