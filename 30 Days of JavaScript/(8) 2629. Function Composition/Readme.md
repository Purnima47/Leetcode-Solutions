# 2629. Function Composition

### `Easy`


<h2 align="center">
<a href="https://leetcode.com/problems/function-composition/?envType=study-plan-v2&envId=30-days-of-javascript"><strong>Question Link</strong></a>
</h2>


## Description 📑

#### Given an array of functions [f1, f2, f3, ..., fn], return a new function fn that is the function composition of the array of functions.

#### The function composition of [f(x), g(x), h(x)] is fn(x) = f(g(h(x))).

#### The function composition of an empty list of functions is the identity function f(x) = x.

#### You may assume each function in the array accepts one integer as input and returns one integer as output.


---

## **EXAMPLES**💫✨ </br>

<h3>

<ins>**Example 1**:</ins> </br>

| _INPUT_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `functions = [x => x + 1, x => x * x, x => 2 * x]`, `x = 4`| `65` |

</h3>

<h3>
<ins>Explanation:</ins>
</h3>

Evaluating from right to left ...
1. Starting with x = 4.

2. 2 * (4) = 8

3. (8) * (8) = 64

4. (64) + 1 = 65

___
<h3>

<ins>**Example 2**:</ins> </br>

| _INPUT_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `functions = [x => 10 * x, x => 10 * x, x => 10 * x]`, `x = 1` |`1000` |

</h3>


<h3>
<ins>Explanation:</ins>
</h3>

Evaluating from right to left ...

1. 10 * (1) = 10

2. 10 * (10) = 100

3. 10 * (100) = 1000

___

<h3>

<ins>**Example 3**:</ins> </br>

| _INPUT_ | _OUTPUT_ |
| :-----------: | :-----------: |
| `functions = []`, `x = 42` |`42` |

</h3>


<h3>
<ins>Explanation:</ins>
</h3>

The composition of zero functions is the identity function
___

## Constraints 🔍

> `-1000 <= x <= 1000` <br>

> `0 <= functions.length <= 1000` <br>

> `all functions accept and return a single integer`

___

## Solution 📃

|  Language   |  Solution Link (GitHub) |
| ------------- | ------------- |
|  ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=flat&logo=javascript&logoColor=%23F7DF1E)  | [JavaScript](https://github.com/Purnima47/Leetcode-Solutions/blob/main/30%20Days%20of%20JavaScript/(8)%202629.%20Function%20Composition/_2629FunctionComposition.js) |
