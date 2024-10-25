# 3162. Find the Number of Good Pairs I

### `Easy`


<h2 align="center">
<a href="https://leetcode.com/problems/find-the-number-of-good-pairs-i/description/?envType=problem-list-v2&envId=apx83dph"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### You are given 2 integer arrays `nums1` and `nums2` of lengths `n` and `m` respectively. You are also given a positive integer `k`.

#### A pair `(i, j)` is called good if `nums1[i]` is divisible by `nums2[j] * k` (`0 <= i <= n - 1`, `0 <= j <= m - 1`).

#### Return the total number of good pairs.


---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `nums1 = [1,3,4]`, `nums2 = [1,3,4]`, `k = 1` | `5` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The 5 good pairs are `(0, 0)`, `(1, 0)`, `(1, 1)`, `(2, 0)`, and `(2, 2)`.

____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `nums1 = [1,2,4,12]`, `nums2 = [2,4]`, `k = 3` | `2` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The 2 good pairs are `(3, 0)` and `(3, 1)`.


___

## Constraints 🔍

> `1 <= n, m <= 50`</br>

> `1 <= nums1[i], nums2[j] <= 50` <br>

> `1 <= k <= 50`

___

## Topics 📝

1. Array
2. Hash Table


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/3162%20-%20Find%20the%20Number%20of%20Good%20Pairs%20I/_3162FindtheNumberofGoodPairsI.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/3162%20-%20Find%20the%20Number%20of%20Good%20Pairs%20I/_3162FindtheNumberofGoodPairsI.cpp)  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/3162%20-%20Find%20the%20Number%20of%20Good%20Pairs%20I/_3162FindtheNumberofGoodPairsI.js) |
|![C](https://img.shields.io/badge/c-%2300599C.svg?style=plastic&logo=c&logoColor=white)| [C](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/3162%20-%20Find%20the%20Number%20of%20Good%20Pairs%20I/_3162FindtheNumberofGoodPairsI.c) |
|![Python](https://img.shields.io/badge/python-3670A0?style=plastic&logo=python&logoColor=ffdd54)| [Python](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/3162%20-%20Find%20the%20Number%20of%20Good%20Pairs%20I/_3162FindtheNumberofGoodPairsI.py) |
