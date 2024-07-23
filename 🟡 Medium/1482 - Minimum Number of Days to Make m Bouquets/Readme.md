# 1482. Minimum Number of Days to Make m Bouquets

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/description/"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### You are given an integer array `bloomDay`, an integer `m` and an integer `k`.

#### You want to make `m` bouquets. To make a bouquet, you need to use `k` adjacent flowers from the garden.

#### The garden consists of `n` flowers, the `ith` flower will bloom in the `bloomDay[i]` and then can be used in exactly one bouquet.

#### Return the minimum number of days you need to wait to be able to make m bouquets from the garden. If it is impossible to make `m` bouquets return `-1`.


---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `bloomDay = [1,10,3,10,2]`, `m = 3`, `k = 1` | `3` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

Let us see what happened in the first three days. x means flower bloomed and _ means flower did not bloom in the garden.

We need 3 bouquets each should contain 1 flower.

- After day 1: [x, _, _, _, _]    // we can only make one bouquet.
- After day 2: [x, _, _, _, x]    // we can only make two bouquets.
- After day 3: [x, _, x, _, x]    // we can make 3 bouquets. The answer is 3.

___
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `bloomDay = [1,10,3,10,2]`, `m = 3`, `k = 2` | `-1` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

We need 3 bouquets each has 2 flowers, that means we need 6 flowers. We only have 5 flowers so it is impossible to get the needed bouquets and we return -1.

___
<h3>

<ins>**Example 3**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `bloomDay = [7,7,7,7,12,7,7]`, `m = 2`, `k = 3` | `12` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

We need 2 bouquets each should have 3 flowers.
Here is the garden after the 7 and 12 days:

- After day 7: [x, x, x, x, _, x, x]
We can make one bouquet of the first three flowers that bloomed. We cannot make another bouquet from the last three flowers that bloomed because they are not adjacent.
- After day 12: [x, x, x, x, x, x, x]
It is obvious that we can make two bouquets in different ways.

___

## Constraints 🔍

> `bloomDay.length == n`</br>

> `1 <= n <= 10^5` </br>

> `1 <= bloomDay[i] <= 10^9` </br>

> `1 <= m <= 10^6` </br>

> `1 <= k <= n`

___

## Topics 📝

1. Array
2. Binary Search

## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1482%20-%20Minimum%20Number%20of%20Days%20to%20Make%20m%20Bouquets/_1482MinNoOfDaysToMakemBouquets.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1482%20-%20Minimum%20Number%20of%20Days%20to%20Make%20m%20Bouquets/_1482MinNoOfDaysToMakemBouquets.cpp)  |
