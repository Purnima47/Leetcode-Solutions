# 2419. Longest Subarray With Maximum Bitwise AND

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/longest-subarray-with-maximum-bitwise-and/description/?envType=daily-question&envId=2024-09-14"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### You are given an integer array `nums` of size `n`.

#### Consider a non-empty subarray from `nums` that has the maximum possible bitwise AND.

- In other words, let `k` be the maximum value of the bitwise AND of any subarray of `nums`. Then, only subarrays with a bitwise AND equal to `k` should be considered.

#### Return the length of the longest such subarray.

#### The bitwise AND of an array is the bitwise AND of all the numbers in it.

#### A subarray is a contiguous sequence of elements within an array.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `nums = [1,2,3,3,2,2]` | `2` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The maximum possible bitwise AND of a subarray is 3. <br>
The longest subarray with that value is [3,3], so we return 2.

____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `nums = [1,2,3,4]` | `1` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The maximum possible bitwise AND of a subarray is 4. <br>
The longest subarray with that value is [4], so we return 1.

___


## Constraints 🔍

> `1 <= nums.length <= 10^5`</br>

> `1 <= nums[i] <= 10^6` 

___

## Topics 📝

1. Array
2. Bit Manipulation
3. Brainteaser


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2419%20-%20Longest%20Subarray%20With%20Maximum%20Bitwise%20AND/_2419LongestSubarrayWithMaximumBitwiseAND.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2419%20-%20Longest%20Subarray%20With%20Maximum%20Bitwise%20AND/_2419LongestSubarrayWithMaximumBitwiseAND.cpp)  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2419%20-%20Longest%20Subarray%20With%20Maximum%20Bitwise%20AND/_2419LongestSubarrayWithMaximumBitwiseAND.js) |
|![C](https://img.shields.io/badge/c-%2300599C.svg?style=plastic&logo=c&logoColor=white)| [C](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2419%20-%20Longest%20Subarray%20With%20Maximum%20Bitwise%20AND/_2419LongestSubarrayWithMaximumBitwiseAND.c) |
|![Python](https://img.shields.io/badge/python-3670A0?style=plastic&logo=python&logoColor=ffdd54)| [Python](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2419%20-%20Longest%20Subarray%20With%20Maximum%20Bitwise%20AND/_2419LongestSubarrayWithMaximumBitwiseAND.py) |
