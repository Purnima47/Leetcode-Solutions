# 1438. Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/description/"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### Given an array of integers `nums` and an integer `limit`, return the size of the longest non-empty subarray such that the absolute difference between any two elements of this subarray is less than or equal to `limit`.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `nums = [8,2,4,7]`, `limit = 4` | `2` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

All subarrays are: 

- [8] with maximum absolute diff |8-8| = 0 <= 4.
- [8,2] with maximum absolute diff |8-2| = 6 > 4. 
- [8,2,4] with maximum absolute diff |8-2| = 6 > 4.
- [8,2,4,7] with maximum absolute diff |8-2| = 6 > 4.
- [2] with maximum absolute diff |2-2| = 0 <= 4.
- [2,4] with maximum absolute diff |2-4| = 2 <= 4.
- [2,4,7] with maximum absolute diff |2-7| = 5 > 4.
- [4] with maximum absolute diff |4-4| = 0 <= 4.
- [4,7] with maximum absolute diff |4-7| = 3 <= 4.
- [7] with maximum absolute diff |7-7| = 0 <= 4. 

Therefore, the size of the longest subarray is 2.

___
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `nums = [10,1,2,4,7,2]`, `limit = 5` | `4` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The subarray [2,4,7,2] is the longest since the maximum absolute diff is |2-7| = 5 <= 5.

___
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `nums = [4,2,2,2,4,4,2,2]`, `limit = 0` | `3` |

</h3>

___

## Constraints 🔍

> `1 <= nums.length <= 10^5`</br>
> `1 <= nums[i] <= 10^9` </br>
> `0 <= limit <= 10^9` </br>

___

## Topics 📝

1. Array
2. Queue
3. Sliding Window
4. Heap (Priority Queue)
5. Ordered Set
6. Monotonic Queue

## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1438%20-%20Longest%20Continuous%20Subarray%20With%20Absolute%20Diff%20Less%20Than%20or%20Equal%20to%20Limit/_1438LongContSubArrWithAbsDiffLessThanOrEqualToLimit.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1438%20-%20Longest%20Continuous%20Subarray%20With%20Absolute%20Diff%20Less%20Than%20or%20Equal%20to%20Limit/_1438LongContSubArrWithAbsDiffLessThanOrEqualToLimit..cpp)  |
