# 88. Merge Sorted Array

### `Easy`


<h2 align="center">
<a href="https://leetcode.com/problems/merge-sorted-array/description/"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### You are given two integer arrays `nums1` and `nums2`, sorted in non-decreasing order, and two integers `m` and `n`, representing the number of elements in `nums1` and `nums2` respectively.

#### Merge `nums1` and `nums2` into a single array sorted in non-decreasing order.

#### The final sorted array should not be returned by the function, but instead be stored inside the array `nums1`. To accommodate this, `nums1` has a length of `m + n`, where the first `m` elements denote the elements that should be merged, and the last `n` elements are set to 0 and should be ignored. `nums2` has a length of `n`.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `nums1 = [1,2,3,0,0,0]`, `m = 3`, `nums2 = [2,5,6]`, `n = 3` | `[1,2,2,3,5,6]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The arrays we are merging are [1,2,3] and [2,5,6]. <br>
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `nums1 = [1]`, `m = 1`, `nums2 = []`, `n = 0` | `[1]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The arrays we are merging are [1] and []. <br>
The result of the merge is [1].

___

<h3>

<ins>**Example 3**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `nums1 = [0]`, `m = 0`, `nums2 = [1]`, `n = 1` | `[1]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The result of the merge is [1]. <br>
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.

___

## Constraints 🔍

> `nums1.length == m + n`</br>

> `nums2.length == n` <br>

> `0 <= m, n <= 200` <br>

> `1 <= m + n <= 200` <br>

> `-10^9 <= nums1[i], nums2[j] <= 10^9`

___

## Topics 📝

1. Array
2. Two Pointers
3. Sorting


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA]() |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++]()  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript]() |
