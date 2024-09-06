# 2028. Find Missing Observations

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/find-missing-observations/description/?envType=daily-question&envId=2024-09-05"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### You have observations of `n + m` 6-sided dice rolls with each face numbered from `1` to `6`. `n` of the observations went missing, and you only have the observations of `m` rolls. Fortunately, you have also calculated the average value of the `n + m` rolls.

#### You are given an integer array `rolls` of length `m` where `rolls[i]` is the value of the `ith` observation. You are also given the two integers `mean` and `n`.

#### Return an array of length `n` containing the missing observations such that the average value of the `n + m` rolls is exactly `mean`. If there are multiple valid answers, return any of them. If no such array exists, return an empty array.

#### The average value of a set of `k` numbers is the sum of the numbers divided by `k`.

#### Note that `mean` is an integer, so the sum of the `n + m` rolls should be divisible by `n + m`.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `rolls = [3,2,4,3]`, `mean = 4`, `n = 2` | `[6,6]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The mean of all n + m rolls is (3 + 2 + 4 + 3 + 6 + 6) / 6 = 4.

____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `rolls = [1,5,6]`, `mean = 3`, `n = 4` | `[2,3,2,2]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The mean of all n + m rolls is (1 + 5 + 6 + 2 + 3 + 2 + 2) / 7 = 3.

___

<h3>

<ins>**Example 3**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `rolls = [1,2,3,4]`, `mean = 6`, `n = 4` | `[]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

It is impossible for the mean to be 6 no matter what the 4 missing rolls are.

___

## Constraints 🔍

> `m == rolls.length`</br>

> `1 <= n, m <= 10^5`. <br>

> `1 <= rolls[i], mean <= 6`

___

## Topics 📝

1. Array
2. Math
3. Simulation


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2028%20-%20Find%20Missing%20Observations/_2028FindMissingObservations.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2028%20-%20Find%20Missing%20Observations/_2028FindMissingObservations.cpp)  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2028%20-%20Find%20Missing%20Observations/_2028FindMissingObservations.js) |
