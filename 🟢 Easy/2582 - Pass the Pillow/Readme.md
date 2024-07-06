# 2582. Pass the Pillow

### `Easy`


<h2 align="center">
<a href="https://leetcode.com/problems/pass-the-pillow/description/?envType=daily-question&envId=2024-07-06"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### There are `n` people standing in a line labeled from `1` to `n`. The first person in the line is holding a pillow initially. Every second, the person holding the pillow passes it to the next person standing in the line. Once the pillow reaches the end of the line, the direction changes, and people continue passing the pillow in the opposite direction.

- For example, once the pillow reaches the `nth` person they pass it to the `n - 1th` person, then to the `n - 2th` person and so on.

#### Given the two positive integers n and time, return the index of the person holding the pillow after time seconds.

---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `n = 4`, `time = 5` | `2` |
</h3>

<h3>
<ins>Explanation:</ins>
</h3>

People pass the pillow in the following way: 1 -> 2 -> 3 -> 4 -> 3 -> 2.
After five seconds, the 2nd person is holding the pillow.
___
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUTS_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `n = 3`, `time = 2` | `3` |

<h3>
<ins>Explanation:</ins>
</h3>

People pass the pillow in the following way: 1 -> 2 -> 3.
After two seconds, the 3rd person is holding the pillow.

</h3>

___

## Constraints 🔍

> `2 <= n <= 1000`</br>
> `1 <= time <= 1000`.
___

## Topics 📝

1. Math
2. Simulation

## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white)  | [JAVA](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/2582%20-%20Pass%20the%20Pillow/_2582PassThePillow.java) |
|  ![C++](https://img.shields.io/badge/c++-%2300599C.svg?style=plastic&logo=c%2B%2B&logoColor=white)  | [C++](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/2582%20-%20Pass%20the%20Pillow/_2582PassThePillow.cpp)  |
|![Python](https://img.shields.io/badge/python-3670A0?style=plastic&logo=python&logoColor=ffdd54)| [Python](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/2582%20-%20Pass%20the%20Pillow/_2582PassThePillow.py) |
|![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=plastic&logo=javascript&logoColor=%23F7DF1E)| [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/2582%20-%20Pass%20the%20Pillow/_2582PassThePillow.js) |
|![C](https://img.shields.io/badge/c-%2300599C.svg?style=plastic&logo=c&logoColor=white)| [C](https://github.com/Purnima47/Leetcode-Solutions/blob/main/%F0%9F%9F%A2%20Easy/2582%20-%20Pass%20the%20Pillow/_2582PassThePillow.c) |
