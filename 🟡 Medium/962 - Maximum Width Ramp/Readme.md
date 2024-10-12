# 962. Maximum Width Ramp

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/maximum-width-ramp/description/?envType=daily-question&envId=2024-10-10"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### A ramp in an integer array `nums` is a pair `(i, j)` for which `i < j` and `nums[i] <= nums[j]`. The width of such a ramp is `j - i`.

#### Given an integer array `nums`, return the maximum width of a ramp in `nums`. If there is no ramp in nums, return `0`.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `nums = [6,0,8,2,1,5]` | `4` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The maximum width ramp is achieved at (i, j) = (1, 5): nums[1] = 0 and nums[5] = 5.

____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `nums = [9,8,1,0,1,9,4,0,4,1]` | `7` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The maximum width ramp is achieved at (i, j) = (2, 9): nums[2] = 1 and nums[9] = 1.


___

## Constraints 🔍

> `2 <= nums.length <= 5 * 10^4`</br>

> `0 <= nums[i] <= 5 * 10^4` 

___

## Topics 📝

1. Array
2. Stack
3. Monotonic Stack


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA]() |