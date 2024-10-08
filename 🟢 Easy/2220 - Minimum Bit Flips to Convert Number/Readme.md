# 2220. Minimum Bit Flips to Convert Number

### `Easy`


<h2 align="center">
<a href="https://leetcode.com/problems/minimum-bit-flips-to-convert-number/description/?envType=daily-question&envId=2024-09-11"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### A bit flip of a number `x` is choosing a bit in the binary representation of `x` and flipping it from either `0` to `1` or `1` to `0`.

- For example, for `x = 7`, the binary representation is `111` and we may choose any bit (including any leading zeros not shown) and flip it. We can flip the first bit from the right to get `110`, flip the second bit from the right to get `101`, flip the fifth bit from the right (a leading zero) to get `10111`, etc.

#### Given two integers `start` and `goal`, return the minimum number of bit flips to convert `start` to `goal`.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `start = 10`, `goal = 7` | `3` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The binary representation of 10 and 7 are 1010 and 0111 respectively. We can convert 10 to 7 in 3 steps:

- Flip the first bit from the right: 1010 -> 1011.

- Flip the third bit from the right: 1011 -> 1111.

- Flip the fourth bit from the right: 1111 -> 0111.

It can be shown we cannot convert 10 to 7 in less than 3 steps. Hence, we return 3.

____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `start = 3`, `goal = 4` | `3` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

The binary representation of 3 and 4 are 011 and 100 respectively. We can convert 3 to 4 in 3 steps:

- Flip the first bit from the right: 011 -> 010.

- Flip the second bit from the right: 010 -> 000.

- Flip the third bit from the right: 000 -> 100.

It can be shown we cannot convert 3 to 4 in less than 3 steps. Hence, we return 3.


___

## Constraints 🔍

> `0 <= start, goal <= 10^9`

___

## Topics 📝

1. Bit Manipulation


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/2220%20-%20Minimum%20Bit%20Flips%20to%20Convert%20Number/_2220MinimumBitFlipstoConvertNumber.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/2220%20-%20Minimum%20Bit%20Flips%20to%20Convert%20Number/_2220MinimumBitFlipstoConvertNumber.cpp)  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/2220%20-%20Minimum%20Bit%20Flips%20to%20Convert%20Number/_2220MinimumBitFlipstoConvertNumber.js) |
