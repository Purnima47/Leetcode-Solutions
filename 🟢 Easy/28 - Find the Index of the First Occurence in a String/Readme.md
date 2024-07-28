# 28. Find the Index of the First Occurrence in a String

### `Easy`


<h2 align="center">
<a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### Given two strings `needle` and `haystack`, return the index of the first occurrence of `needle` in `haystack`, or `-1` if `needle` is not part of `haystack`.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `haystack = "sadbutsad"`, `needle = "sad"` | `0` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

"sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.

___
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `haystack = "leetcode"`, `needle = "leeto"` | `-1` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

"leeto" did not occur in "leetcode", so we return -1.

___

## Constraints 🔍

> `1 <= haystack.length, needle.length <= 10^4`</br>
>  `haystack` and `needle` consist of only lowercase English characters.

___

## Topics 📝

1. Two Pointers
2. String
3. String Matching

## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/28%20-%20Find%20the%20Index%20of%20the%20First%20Occurence%20in%20a%20String/_28FindTheIndexOfTheFirstOccurenceInAString.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/28%20-%20Find%20the%20Index%20of%20the%20First%20Occurence%20in%20a%20String/_28FindTheIndexOfTheFirstOccurenceInAString.cpp)  |
