# 2914. Minimum Number of Changes to Make Binary String Beautiful

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/minimum-number-of-changes-to-make-binary-string-beautiful/description/?envType=daily-question&envId=2024-11-05"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### You are given a 0-indexed binary string s having an even length.

#### A string is beautiful if it's possible to partition it into one or more substrings such that:

- Each substring has an even length.

- Each substring contains only 1's or only 0's.

#### You can change any character in s to 0 or 1.

#### Return the minimum number of changes required to make the string s beautiful.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `s = "1001"` | `2` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>


We change s[1] to 1 and s[3] to 0 to get string "1100". <br>
It can be seen that the string "1100" is beautiful because we can partition it into "11|00". <br>
It can be proven that 2 is the minimum number of changes needed to make the string beautiful.

____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `s = "10"` | `1` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>


We change s[1] to 1 to get string "11". <br>
It can be seen that the string "11" is beautiful because we can partition it into "11". <br>
It can be proven that 1 is the minimum number of changes needed to make the string beautiful.

___

<h3>

<ins>**Example 3**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `s = "0000"` | `0` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

We don't need to make any changes as the string "0000" is beautiful already.

___

## Constraints 🔍

> `2 <= s.length <= 10^5`</br>

> `s` has an even length. <br>

> `s[i]` is either `'0'` or `'1'`.

___

## Topics 📝

1. String


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2914%20-%20Minimum%20Number%20of%20Changes%20to%20Make%20Binary%20String%20Beautiful/_2914MinimumNumberofChangestoMakeBinaryStringBeautiful.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2914%20-%20Minimum%20Number%20of%20Changes%20to%20Make%20Binary%20String%20Beautiful/_2914MinimumNumberofChangestoMakeBinaryStringBeautiful.cpp)  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2914%20-%20Minimum%20Number%20of%20Changes%20to%20Make%20Binary%20String%20Beautiful/_2914MinimumNumberofChangestoMakeBinaryStringBeautiful.js) |
|![Python](https://img.shields.io/badge/python-3670A0?style=plastic&logo=python&logoColor=ffdd54)| [Python](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2914%20-%20Minimum%20Number%20of%20Changes%20to%20Make%20Binary%20String%20Beautiful/_2914MinimumNumberofChangestoMakeBinaryStringBeautiful.py) |
