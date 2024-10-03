# 1590. Make Sum Divisible by P

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/make-sum-divisible-by-p/description/?envType=daily-question&envId=2024-10-03"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### Given an array of positive integers `nums`, remove the smallest subarray (possibly empty) such that the sum of the remaining elements is divisible by `p`. It is not allowed to remove the whole array.

#### Return the length of the smallest subarray that you need to remove, or `-1` if it's impossible.

#### A subarray is defined as a contiguous block of elements in the array.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `nums = [3,1,4,2], p = 6` | `1` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The sum of the elements in nums is 10, which is not divisible by 6. We can remove the subarray [4], and the sum of the remaining elements is 6, which is divisible by 6.

____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `nums = [6,3,5,2], p = 9` | `2` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

We cannot remove a single element to get a sum divisible by 9. The best way is to remove the subarray [5,2], leaving us with [6,3] with sum 9.

___

<h3>

<ins>**Example 3**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `nums = [1,2,3], p = 3` | `0` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

Here the sum is 6. which is already divisible by 3. Thus we do not need to remove anything.

___

## Constraints 🔍

> `1 <= nums.length <= 10^5`</br>

> `1 <= nums[i] <= 10^9` <br>

> `1 <= p <= 10^9`

___

## Topics 📝

1. Array
2. Hash Table
3. Prefix Sum


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1590%20-%20Make%20Sum%20Divisible%20by%20P/_1590MakeSumDivisiblebyP.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1590%20-%20Make%20Sum%20Divisible%20by%20P/_1590MakeSumDivisiblebyP.cpp)  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1590%20-%20Make%20Sum%20Divisible%20by%20P/_1590MakeSumDivisiblebyP.js) |
|![Python](https://img.shields.io/badge/python-3670A0?style=plastic&logo=python&logoColor=ffdd54)| [Python](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1590%20-%20Make%20Sum%20Divisible%20by%20P/_1590MakeSumDivisiblebyP.py) |
