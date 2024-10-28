# 3232. Find if Digit Game Can Be Won

### `Easy`


<h2 align="center">
<a href="https://leetcode.com/problems/find-if-digit-game-can-be-won/description/"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### You are given an array of positive integers `nums`.

#### Alice and Bob are playing a game. In the game, Alice can choose either all single-digit numbers or all double-digit numbers from `nums`, and the rest of the numbers are given to Bob. Alice wins if the sum of her numbers is strictly greater than the sum of Bob's numbers.

#### Return `true` if Alice can win this game, otherwise, return `false`.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>


| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `nums = [1,2,3,4,10]` | `false` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

Alice cannot win by choosing either single-digit or double-digit numbers.

____
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `nums = [1,2,3,4,5,14]` | `true` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

Alice can win by choosing single-digit numbers which have a sum equal to 15.


___

<h3>

<ins>**Example 3**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `nums = [5,5,5,25]` | `true` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>


Alice can win by choosing double-digit numbers which have a sum equal to 25.


___

## Constraints 🔍

> `1 <= nums.length <= 100`</br>

> `1 <= nums[i] <= 99` 

___

## Topics 📝

1. Array
2. Math


## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/3232%20-%20Find%20if%20Digit%20Game%20Can%20Be%20Won/_3232FindifDigitGameCanBeWon.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/3232%20-%20Find%20if%20Digit%20Game%20Can%20Be%20Won/_3232FindifDigitGameCanBeWon.cpp)  |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/3232%20-%20Find%20if%20Digit%20Game%20Can%20Be%20Won/_3232FindifDigitGameCanBeWon.js) |
|![C](https://img.shields.io/badge/c-%2300599C.svg?style=plastic&logo=c&logoColor=white)| [C](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/3232%20-%20Find%20if%20Digit%20Game%20Can%20Be%20Won/_3232FindifDigitGameCanBeWon.c) |
|![Python](https://img.shields.io/badge/python-3670A0?style=plastic&logo=python&logoColor=ffdd54)| [Python](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/3232%20-%20Find%20if%20Digit%20Game%20Can%20Be%20Won/_3232FindifDigitGameCanBeWon.py) |
