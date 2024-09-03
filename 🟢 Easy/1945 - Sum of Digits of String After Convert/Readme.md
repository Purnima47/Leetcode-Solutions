# 1945. Sum of Digits of String After Convert Array

### `Easy`


<h2 align="center">
<a href="https://leetcode.com/problems/sum-of-digits-of-string-after-convert/description/?envType=daily-question&envId=2024-09-03"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### You are given a string `s` consisting of lowercase English letters, and an integer `k`.

#### First, convert `s` into an integer by replacing each letter with its position in the alphabet (i.e., replace `'a'` with `1`, `'b'` with `2`, ..., `'z'` with `26`). Then, transform the integer by replacing it with the sum of its digits. Repeat the transform operation `k` times in total.

#### For example, if `s = "zbax"` and `k = 2`, then the resulting integer would be `8` by the following operations:

- Convert: `"zbax" ➝ "(26)(2)(1)(24)" ➝ "262124" ➝ 262124`

- Transform #1: `262124 ➝ 2 + 6 + 2 + 1 + 2 + 4 ➝ 17`

- Transform #2: `17 ➝ 1 + 7 ➝ 8`

#### Return the resulting integer after performing the operations described above.


---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `s = "iiii"`, `k = 1` | `36` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The operations are as follows:

- Convert: "iiii" ➝ "(9)(9)(9)(9)" ➝ "9999" ➝ 9999

- Transform #1: 9999 ➝ 9 + 9 + 9 + 9 ➝ 36
Thus the resulting integer is 36.

____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `s = "leetcode"`, `k = 2` | `6` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The operations are as follows:

- Convert: "leetcode" ➝ "(12)(5)(5)(20)(3)(15)(4)(5)" ➝ "12552031545" ➝ 12552031545

- Transform #1: 12552031545 ➝ 1 + 2 + 5 + 5 + 2 + 0 + 3 + 1 + 5 + 4 + 5 ➝ 33

- Transform #2: 33 ➝ 3 + 3 ➝ 6

Thus the resulting integer is 6.

___

<h3>

<ins>**Example 3**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `s = "zbax"`, `k = 2` | `8` |

</h3>

___

## Constraints 🔍

> `1 <= s.length <= 100`</br>

> `1 <= k <= 10`. <br>

> `s` consists of lowercase English letters.

___

## Topics 📝

1.String
2. Simulation

## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/1945%20-%20Sum%20of%20Digits%20of%20String%20After%20Convert/_1945SumofDigitsofStringAfterConvert.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/1945%20-%20Sum%20of%20Digits%20of%20String%20After%20Convert/_1945SumofDigitsofStringAfterConvert.cpp)  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/1945%20-%20Sum%20of%20Digits%20of%20String%20After%20Convert/_1945SumofDigitsofStringAfterConvert.js) |
