# Remove Duplicates from Sorted Array

### `Easy`


<h2 align="center">
<a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### Given an integer array `nums` sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in `nums`.

#### Consider the number of unique elements of `nums` to be `k`, to get accepted, you need to do the following things:

- Change the array `nums` such that the first k elements of `nums` contain the unique elements in the order they were present in `nums` initially. The remaining elements of `nums` are not important as well as the size of `nums`.

- Return `k`.

#### The judge will test your solution with the following code:

 int[] nums = [...]; // Input array
 int[] expectedNums = [...]; // The expected answer with correct length

 int k = removeDuplicates(nums); // Calls your implementation

 assert k == expectedNums.length;
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
| `nums = [1,1,2]` | `2, nums = [1,2,_]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
___
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `nums = [0,0,1,1,1,2,2,3,3,4]` | `5, nums = [0,1,2,3,4,_,_,_,_,_]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

___

## Constraints 🔍

> `1 <= nums.length <= 3 * 10^4`</br>

> `-100 <= nums[i] <= 100`</br>

> `nums is sorted in non-decreasing order.`

___

## Topics 📝

1. Array
2. Two Pointers

## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/26%20-%20Remove%20Duplicates%20from%20Sorted%20Array/_26RemoveDuplicatesFromSortedArray.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/26%20-%20Remove%20Duplicates%20from%20Sorted%20Array/_26RemoveDuplicatesFromSortedArray.cpp)  |
