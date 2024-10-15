# 2938. Separate Black and White Balls

### `Medium`


<h2 align="center">
<a href="https://leetcode.com/problems/separate-black-and-white-balls/description/?envType=daily-question&envId=2024-10-15"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### There are `n` balls on a table, each ball has a color black or white.

#### You are given a 0-indexed binary string `s` of length `n`, where `1` and `0` represent black and white balls, respectively.

#### In each step, you can choose two adjacent balls and swap them.

#### Return the minimum number of steps to group all the black balls to the right and all the white balls to the left.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `s = "101"` | `1` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

We can group all the black balls to the right in the following way:

- Swap s[0] and s[1], s = "011".

Initially, 1s are not grouped together, requiring at least 1 step to group them to the right.

____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `s = "100"` | `2` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

We can group all the black balls to the right in the following way:

- Swap s[0] and s[1], s = "010".

- Swap s[1] and s[2], s = "001".

It can be proven that the minimum number of steps needed is 2.

___

<h3>

<ins>**Example 3**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `s = "0111"` | `0` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

All the black balls are already grouped to the right.

___

## Constraints 🔍

> `1 <= n == s.length <= 10^5`</br>

> `s[i]` is either `'0'` or `'1'`.

___

## Topics 📝

1. Two Pointers
2. String
3. Greedy


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2938%20-%20Separate%20Black%20and%20White%20Balls/_2938SeparateBlackandWhiteBalls.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2938%20-%20Separate%20Black%20and%20White%20Balls/_2938SeparateBlackandWhiteBalls.cpp)  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2938%20-%20Separate%20Black%20and%20White%20Balls/_2938SeparateBlackandWhiteBalls.js) |
|![Python](https://img.shields.io/badge/python-3670A0?style=plastic&logo=python&logoColor=ffdd54)| [Python](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A1%20Medium/2938%20-%20Separate%20Black%20and%20White%20Balls/_2938SeparateBlackandWhiteBalls.py) |
