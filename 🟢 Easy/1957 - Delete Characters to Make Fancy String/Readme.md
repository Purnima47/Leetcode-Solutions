# 1957. Delete Characters to Make Fancy String

### `Easy`


<h2 align="center">
<a href="https://leetcode.com/problems/delete-characters-to-make-fancy-string/description/?envType=daily-question&envId=2024-11-01"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### A fancy string is a string where no three consecutive characters are equal.

#### Given a string `s`, delete the minimum possible number of characters from `s` to make it fancy.

#### Return the final string after the deletion. It can be shown that the answer will always be unique.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `s = "leeetcode"` | `"leetcode"` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

- Remove an 'e' from the first group of 'e's to create "leetcode". 

- No three consecutive characters are equal, so return "leetcode".

____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `s = "aaabaaaa"` | `"aabaa"` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

- Remove an 'a' from the first group of 'a's to create "aabaaaa".

- Remove two 'a's from the second group of 'a's to create "aabaa".

- No three consecutive characters are equal, so return "aabaa".


___

<h3>

<ins>**Example 3**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `s = "aab"` | `"aab"` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

- No three consecutive characters are equal, so return "aab".

___

## Constraints 🔍

> `1 <= s.length <= 10^5`</br>

> `s` consists only of lowercase English letters.

___

## Topics 📝

1. String


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/1957%20-%20Delete%20Characters%20to%20Make%20Fancy%20String/_1957DeleteCharacterstoMakeFancyString.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/1957%20-%20Delete%20Characters%20to%20Make%20Fancy%20String/_1957DeleteCharacterstoMakeFancyString.cpp)  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/1957%20-%20Delete%20Characters%20to%20Make%20Fancy%20String/_1957DeleteCharacterstoMakeFancyString.js) |
|![Python](https://img.shields.io/badge/python-3670A0?style=plastic&logo=python&logoColor=ffdd54)| [Python](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/1957%20-%20Delete%20Characters%20to%20Make%20Fancy%20String/_1957DeleteCharacterstoMakeFancyString.py) |