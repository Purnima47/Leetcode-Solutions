# 2530. Maximal Score After Applying K Operations

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/maximal-score-after-applying-k-operations/description/?envType=daily-question&envId=2024-10-14"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### You are given a 0-indexed integer array `nums` and an integer `k`. You have a starting score of `0`.

#### In one operation:

- choose an index `i` such that `0 <= i < nums.length`,

- increase your score by `nums[i]`, and

- replace `nums[i]` with `ceil(nums[i] / 3)`.
Return the maximum possible score you can attain after applying exactly k operations.

#### Return the maximum possible score you can attain after applying exactly `k` operations.

#### The ceiling function `ceil(val)` is the least integer greater than or equal to `val`.


---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `nums = [10,10,10,10,10]`, `k = 5` | `50` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

Apply the operation to each array element exactly once. The final score is 10 + 10 + 10 + 10 + 10 = 50.

____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `nums = [1,10,3,3,3]`, `k = 3` | `17` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

You can do the following operations:

- Operation 1: Select i = 1, so nums becomes [1,4,3,3,3]. Your score increases by 10.

- Operation 2: Select i = 1, so nums becomes [1,2,3,3,3]. Your score increases by 4.

- Operation 3: Select i = 2, so nums becomes [1,1,1,3,3]. Your score increases by 3.

The final score is 10 + 4 + 3 = 17.

___

## Constraints 🔍

> `1 <= nums.length, k <= 10^5`</br>

> `1 <= nums[i] <= 10^9` 

___

## Topics 📝

1. Array
2. Greedy
3. Heap (Priority Queue)


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2530%20-%20Maximal%20Score%20After%20Applying%20K%20Operations/_2530MaximalScoreAfterApplyingKOperations.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2530%20-%20Maximal%20Score%20After%20Applying%20K%20Operations/_2530MaximalScoreAfterApplyingKOperations.cpp)  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2530%20-%20Maximal%20Score%20After%20Applying%20K%20Operations/_2530MaximalScoreAfterApplyingKOperations.js) |
