# 1653. Minimum Deletions to Make String Balanced

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/description/"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### You are given a string s consisting only of characters `'a'` and `'b'`​​​​.

#### You can delete any number of characters in `s` to make `s` balanced. `s` is balanced if there is no pair of indices `(i,j)` such that `i < j` and `s[i] = 'b'` and `s[j]= 'a'`.

#### Return the minimum number of deletions needed to make `s` balanced.


---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `s = "aababbab"` | `2` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

You can either:

- Delete the characters at 0-indexed positions 2 and 6 ("aababbab" -> "aaabbb"), or

- Delete the characters at 0-indexed positions 3 and 6 ("aababbab" -> "aabbbb").

___
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `s = "bbaaaaabb"` | `2` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The only solution is to delete the first two characters.

___

## Constraints 🔍

> `1 <= s.length <= 10^5`</br>

> `s[i]` is `'a'` or `'b'`​​.

___

## Topics 📝

1. String
2. Dynamic Programming
3. Stack

## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1653%20-%20Minimum%20Deletions%20to%20Make%20String%20Balanced/_1653MinDelToMakeStringBalanced.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1653%20-%20Minimum%20Deletions%20to%20Make%20String%20Balanced/_1653MinDelToMakeStringBalanced.cpp)  |
