# 1395. Count Number of Teams

### `Medium`


<h2 align="center">
<a href=""><strong>Question Link</strong></a>
</h2>


## Description 📑

#### There are `n` soldiers standing in a line. Each soldier is assigned a unique `rating` value.

#### You have to form a team of 3 soldiers amongst them under the following rules:

- Choose 3 soldiers with index (`i`, `j`, `k`) with rating (`rating[i]`, `rating[j]`, `rating[k]`).

- A team is valid if: (`rating[i] < rating[j] < rating[k]`) or (`rating[i] > rating[j] > rating[k]`) where (`0 <= i < j < k < n`).

#### Return the number of teams you can form given the conditions. (soldiers can be part of multiple teams).

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `rating = [2,5,3,4,1]` | `3` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

We can form three teams given the conditions. (2,3,4), (5,4,1), (5,3,1). 
___
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `rating = [2,1,3]` | `0` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

We can't form any team given the conditions.

___
<h3>

<ins>**Example 3**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `rating = [1,2,3,4]` | `4` |

</h3>

___

## Constraints 🔍

> `n == rating.length`</br>

> `3 <= n <= 1000`</br>

> `1 <= rating[i] <= 10^5`</br>

> All the integers in `rating` are unique.

___

## Topics 📝

1. Array
2. Dynamic Programming
3. Binary Indexed Tree

## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1395%20-%20Count%20Number%20of%20Teams/_1395CountNumberOfTeams.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1395%20-%20Count%20Number%20of%20Teams/_1395CountNumberOfTeams.cpp)  |
