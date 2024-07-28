# Remove Element

### `Easy`


<h2 align="center">
<a href="https://leetcode.com/problems/remove-element/"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

#### Consider the number of elements of `nums` which are not equal to `val` be `k`, to get accepted, you need to do the following things:

- Change the array `nums` such that the first `k` elements of `nums` contain the elements which are not equal to `val`. The remaining elements of `nums` are not important as well as the size of `nums`.

- Return `k`.

#### The judge will test your solution with the following code:

 int[] nums = [...]; // Input array
 int val = ...; // Value to remove
 int[] expectedNums = [...]; // The expected answer with correct length.   // It is sorted with no values equaling val.

 int k = removeDuplicates(nums); // Calls your implementation

 assert k == expectedNums.length;
 sort(nums, 0, k); // Sort the first k elements of nums
 for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
 }

#### If all assertions pass, then your solution will be accepted.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `nums = [3,2,2,3]`, `val = 3` | `2, nums = [2,2,_,_]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
___
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `nums = [0,1,2,2,3,0,4,2]`, `val = 2` | `5, nums = [0,1,4,0,3,_,_,_]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).

___

## Constraints 🔍

> `0 <= nums.length <= 100`</br>

> `0 <= nums[i] <= 50`</br>

> `0 <= val <= 100`

___

## Topics 📝

1. Array
2. Two Pointers

## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/26%20-%20Remove%20Duplicates%20from%20Sorted%20Array/_26RemoveDuplicatesFromSortedArray.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/26%20-%20Remove%20Duplicates%20from%20Sorted%20Array/_26RemoveDuplicatesFromSortedArray.cpp)  |
