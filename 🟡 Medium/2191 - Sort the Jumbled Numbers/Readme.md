# 2191. Sort the Jumbled Numbers

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/sort-the-jumbled-numbers/description/?envType=daily-question&envId=2024-07-24"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### You are given a 0-indexed integer array `mapping` which represents the mapping rule of a shuffled decimal system. `mapping[i] = j` means digit `i` should be mapped to digit `j` in this system.

#### The mapped value of an integer is the new integer obtained by replacing each occurrence of digit i in the integer with `mapping[i]` for all `0 <= i <= 9`.

#### You are also given another integer array `nums`. Return the array `nums` sorted in non-decreasing order based on the mapped values of its elements.

#### Notes:

 Elements with the same mapped values should appear in the same relative order as in the input.

 The elements of `nums` should only be sorted based on their mapped values and not be replaced by them.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `mapping = [8,9,4,0,2,1,3,5,7,6]`, `nums = [991,338,38]` | `[338,38,991]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

Map the number 991 as follows:

1. mapping[9] = 6, so all occurrences of the digit 9 will become 6.
2. mapping[1] = 9, so all occurrences of the digit 1 will become 9.

Therefore, the mapped value of 991 is 669.
338 maps to 007, or 7 after removing the leading zeros.
38 maps to 07, which is also 7 after removing leading zeros.
Since 338 and 38 share the same mapped value, they should remain in the same relative order, so 338 comes before 38.
Thus, the sorted array is [338,38,991].
___
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `mapping = [0,1,2,3,4,5,6,7,8,9]`, `nums = [789,456,123]` | `[123,456,789]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

789 maps to 789, 456 maps to 456, and 123 maps to 123. Thus, the sorted array is [123,456,789].

___

## Constraints 🔍

> `mapping.length == 10`</br>
> `0 <= mapping[i] <= 9` </br>
> All the values of `mapping[i]` are unique. </br>
> `1 <= nums.length <= 3 * 10^4` </br>
> `0 <= nums[i] < 10^9`

___

## Topics 📝

1. Array
2. Sorting

## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2191%20-%20Sort%20the%20Jumbled%20Numbers/_2191SortTheJumbledNumbers.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2191%20-%20Sort%20the%20Jumbled%20Numbers/_2191SortTheJumbledNumbers.cpp)  |
