# 2657. Find the Prefix Common Array of Two Arrays

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/description/?envType=daily-question&envId=2025-01-14"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### You are given two 0-indexed integer permutations `A` and `B` of length `n`.

#### `A` prefix common array of `A` and `B` is an array `C` such that `C[i]` is equal to the count of numbers that are present at or before the index `i` in both `A` and `B`.

#### Return the prefix common array of `A` and `B`.

#### `A` sequence of `n` integers is called a permutation if it contains all integers from `1` to `n` exactly once.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `A = [1,3,2,4], B = [3,1,2,4]` | `[0,2,3,4]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

At i = 0: no number is common, so C[0] = 0. <br>
At i = 1: 1 and 3 are common in A and B, so C[1] = 2. <br>
At i = 2: 1, 2, and 3 are common in A and B, so C[2] = 3. <br>
At i = 3: 1, 2, 3, and 4 are common in A and B, so C[3] = 4.

____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `A = [2,3,1], B = [3,1,2]` | `[0,1,3]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

At i = 0: no number is common, so C[0] = 0. <br>
At i = 1: only 3 is common in A and B, so C[1] = 1. <br>
At i = 2: 1, 2, and 3 are common in A and B, so C[2] = 3.

___

## Constraints 🔍

> `1 <= A.length == B.length == n <= 50`</br>

> `1 <= A[i], B[i] <= n` <br>

> `It is guaranteed that A and B are both a permutation of n integers.`

___

## Topics 📝

1. Array
2. Hash Table
3. Bit Manipulation


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2657%20-%20Find%20the%20Prefix%20Common%20Array%20of%20Two%20Arrays/_2657FindthePrefixCommonArrayofTwoArrays.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2657%20-%20Find%20the%20Prefix%20Common%20Array%20of%20Two%20Arrays/_2657FindthePrefixCommonArrayofTwoArrays.cpp)  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2657%20-%20Find%20the%20Prefix%20Common%20Array%20of%20Two%20Arrays/_2657FindthePrefixCommonArrayofTwoArrays.js) |
|![Python](https://img.shields.io/badge/python-3670A0?style=plastic&logo=python&logoColor=ffdd54)| [Python](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2657%20-%20Find%20the%20Prefix%20Common%20Array%20of%20Two%20Arrays/_2657FindthePrefixCommonArrayofTwoArrays.py) |
