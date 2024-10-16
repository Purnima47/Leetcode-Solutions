# 1405. Longest Happy String

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/longest-happy-string/description/?envType=daily-question&envId=2024-10-16"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### A string `s` is called happy if it satisfies the following conditions:

- `s` only contains the letters `'a'`, `'b'`, and 
`'c'`.

- `s` does not contain any of `"aaa"`, `"bbb"`, or 
`"ccc"` as a substring.

- `s` contains at most `a` occurrences of the 
letter `'a'`.

- `s` contains at most `b` occurrences of the 
letter `'b'`.

- `s` contains at most `c` occurrences of the 
letter `'c'`.

#### Given three integers `a`, `b`, and `c`, return the longest possible happy string. If there are multiple longest happy strings, return any of them. If there is no such string, return the empty string `""`.

#### A substring is a contiguous sequence of characters within a string.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `a = 1, b = 1, c = 7` | `"ccaccbcc"` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

"ccbccacc" would also be a correct answer.
____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `a = 7, b = 1, c = 0` | `"aabaa"` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

It is the only correct answer in this case.


___

## Constraints 🔍

> `0 <= a, b, c <= 100`</br>

> `a + b + c > 0` 

___

## Topics 📝

1. String
2. Greedy
3. Heap (Priority Queue)


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1405%20-%20Longest%20Happy%20String/_1405LongestHappyString.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1405%20-%20Longest%20Happy%20String/_1405LongestHappyString.cpp)  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1405%20-%20Longest%20Happy%20String/_1405LongestHappyString.js) |
|![Python](https://img.shields.io/badge/python-3670A0?style=plastic&logo=python&logoColor=ffdd54)| [Python](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/1405%20-%20Longest%20Happy%20String/_1405LongestHappyString.py) |
