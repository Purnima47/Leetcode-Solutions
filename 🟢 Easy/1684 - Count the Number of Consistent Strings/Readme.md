# 1684. Count the Number of Consistent Strings

### `Easy`


<h2 align="center">
<a href="https://leetcode.com/problems/count-the-number-of-consistent-strings/description/?envType=daily-question&envId=2024-09-12"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### You are given a string `allowed` consisting of distinct characters and an array of strings `words`. A string is consistent if all characters in the string appear in the string `allowed`.

#### Return the number of consistent strings in the array `words`.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `allowed = "ab"`, `words = ["ad","bd","aaab","baa","badab"]` | `2` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.

____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `allowed = "abc"`, `words = ["a","b","c","ab","ac","bc","abc"]` | `7` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

All strings are consistent.

___

<h3>

<ins>**Example 3**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `allowed = "cad"`, `words = ["cc","acd","b","ba","bac","bad","ac","d"]` | `4` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

Strings "cc", "acd", "ac", and "d" are consistent.

___

## Constraints 🔍

> `1 <= words.length <= 10^4`</br>

> `1 <= allowed.length <= 26` <br>

> `1 <= words[i].length <= 10` <br>

> The characters in `allowed` are distinct. <br>

> `words[i]` and allowed contain only lowercase English letters.

___

## Topics 📝

1. Array
2. Hash Table
3. String
4. Bit Manipulation
5. Counting


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/1684%20-%20Count%20the%20Number%20of%20Consistent%20Strings/_1684CounttheNumberofConsistentStrings.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/1684%20-%20Count%20the%20Number%20of%20Consistent%20Strings/_1684CounttheNumberofConsistentStrings.cpp)  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/1684%20-%20Count%20the%20Number%20of%20Consistent%20Strings/_1684CounttheNumberofConsistentStrings.js) |
