# 13.Roman to Integer

### `Easy`


<h2 align="center">
<a href="https://leetcode.com/problems/roman-to-integer/description/"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### Roman numerals are represented by seven different symbols: `I`, `V`, `X`, `L`, `C`, `D` and `M`.

| _Symbol_ | _Value_ |
| :-----------: | :-----------: |
| I | 1 |
| V | 5 |
| X | 10 |
| L | 50 |
| C | 100 |
| D | 500 |
| M | 1000 |
---

#### For example, `2` is written as `II` in Roman numeral, just two ones added together. `12` is written as `XII`, which is simply `X + II`. The number 27 is written as `XXVII`, which is `XX + V + II`.

#### Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not `IIII`. Instead, the number four is written as `IV`. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as `IX`. There are six instances where subtraction is used:

> `I` can be placed before `V` (5) and `X` (10) to make 4 and 9.  </br>
> `X` can be placed before `L` (50) and `C` (100) to make 40 and 90. </br>
> `C` can be placed before `D` (500) and `M` (1000) to make 400 and 900.

#### Given a roman numeral, convert it to an integer.

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `s = "III"` | `3` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>
III = 3.

___
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `s = "LVIII"` | `58` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>
L = 50, V= 5, III = 3.

___

<ins>**Example 3**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `s = "MCMXCIV"` | `1994` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>
M = 1000, CM = 900, XC = 90 and IV = 4.

___

## Constraints 🔍

> `1 <= s.length <= 15` </br>
> `s` contains only the characters `('I', 'V', 'X', 'L', 'C', 'D', 'M')`.  </br>
> It is guaranteed that `s` is a valid roman numeral in the range `[1, 3999]`.

___

## Topics 📝

1. HashTable
2. Math
3. String

## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/13%20-%20Roman%20To%20Integer/_13RomanToInteger.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/13%20-%20Roman%20To%20Integer/_13RomanToInteger.cpp)  |
