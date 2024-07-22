# 2418. Sort the People

### `Easy`


<h2 align="center">
<a href="https://leetcode.com/problems/sort-the-people/description/?envType=daily-question&envId=2024-07-22"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### You are given an array of strings `names`, and an array `heights` that consists of distinct positive integers. Both arrays are of length `n`.

#### For each index `i`, `names[i]` and `heights[i]` denote the name and height of the `ith` person.

#### Return `names` sorted in _descending order by the people's heights_.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `names = ["Mary","John","Emma"]`, `heights = [180,165,170]` | `["Mary","Emma","John"]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

Mary is the tallest, followed by Emma and John.

___
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `names = ["Alice","Bob","Bob"]`, `heights = [155,185,150]` | `["Bob","Alice","Bob"]` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The first Bob is the tallest, followed by Alice and the second Bob.

___

## Constraints 🔍

> `n == names.length == heights.length`</br>
> `1 <= n <= 10^3`</br>
> `1 <= names[i].length <= 20`</br>
> `1 <= heights[i] <= 10^5`</br>
> `names[i]` consists of lower and upper case English letters.</br>
> All the values of `heights` are distinct.

___

## Topics 📝

1. Array
2. Hash Table
3. String
4. Sorting

## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/2418%20-%20Sort%20the%20People/_2418SortThePeople.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/2418%20-%20Sort%20the%20People/_2418SortThePeople.cpp)  |
